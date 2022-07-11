package com.ruoyi.crm.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.spring.SpringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.CustomerGroupMapper;
import com.ruoyi.crm.domain.CustomerGroup;
import com.ruoyi.crm.service.ICustomerGroupService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.transaction.annotation.Transactional;

/**
 * 客户分组Service业务层处理
 *
 * @author gsh
 * @date 2022-07-07
 */
@Service
public class CustomerGroupServiceImpl implements ICustomerGroupService {
    @Autowired
    private CustomerGroupMapper groupMapper;

    /**
     * 查询部门管理数据
     *
     * @param group 部门信息
     * @return 部门信息集合
     */
    @Override
    public List<CustomerGroup> selectGroupList(CustomerGroup group) {
        return groupMapper.selectGroupList(group);
    }

    /**
     * 查询部门管理树
     *
     * @param group 部门信息
     * @return 所有部门信息
     */
    @Override
    public List<Ztree> selectGroupTree(CustomerGroup group) {
        List<CustomerGroup> groupList = groupMapper.selectGroupList(group);
        List<Ztree> ztrees = initZtree(groupList);
        return ztrees;
    }

    /**
     * 查询部门管理树（排除下级）
     *
     * @param groupId 部门ID
     * @return 所有部门信息
     */
    @Override
    public List<Ztree> selectGroupTreeExcludeChild(CustomerGroup group) {
        Long excludeId = group.getExcludeId();
        List<CustomerGroup> groupList = groupMapper.selectGroupList(group);
        Iterator<CustomerGroup> it = groupList.iterator();
        while (it.hasNext()) {
            CustomerGroup d = it.next();
            if (d.getGroupId().intValue() == excludeId
                    || ArrayUtils.contains(StringUtils.split(d.getAncestors(), ","), excludeId + "")) {
                it.remove();
            }
        }
        List<Ztree> ztrees = initZtree(groupList);
        return ztrees;
    }

    /**
     * 根据角色ID查询部门（数据权限）
     *
     * @param role 角色对象
     * @return 部门列表（数据权限）
     */
    @Override
    public List<Ztree> CustomerGroupTreeData(SysRole role) {
        Long roleId = role.getRoleId();
        List<Ztree> ztrees = new ArrayList<Ztree>();
        List<CustomerGroup> groupList = selectGroupList(new CustomerGroup());
        if (StringUtils.isNotNull(roleId)) {
            List<String> roleGroupList = groupMapper.selectCustomerGroupTree(roleId);
            ztrees = initZtree(groupList, roleGroupList);
        } else {
            ztrees = initZtree(groupList);
        }
        return ztrees;
    }

    /**
     * 对象转部门树
     *
     * @param groupList 部门列表
     * @return 树结构列表
     */
    public List<Ztree> initZtree(List<CustomerGroup> groupList) {
        return initZtree(groupList, null);
    }

    /**
     * 对象转部门树
     *
     * @param groupList     部门列表
     * @param roleGroupList 角色已存在菜单列表
     * @return 树结构列表
     */
    public List<Ztree> initZtree(List<CustomerGroup> groupList, List<String> roleGroupList) {

        List<Ztree> ztrees = new ArrayList<Ztree>();
        boolean isCheck = StringUtils.isNotNull(roleGroupList);
        for (CustomerGroup group : groupList) {
            if (UserConstants.DEPT_NORMAL.equals(group.getStatus())) {
                Ztree ztree = new Ztree();
                ztree.setId(group.getGroupId());
                ztree.setpId(group.getParentId());
                ztree.setName(group.getGroupName());
                ztree.setTitle(group.getGroupName());
                if (isCheck) {
                    ztree.setChecked(roleGroupList.contains(group.getGroupId() + group.getGroupName()));
                }
                ztrees.add(ztree);
            }
        }
        return ztrees;
    }

    /**
     * 查询部门人数
     *
     * @param parentId 部门ID
     * @return 结果
     */
    @Override
    public int selectGroupCount(Long parentId) {
        CustomerGroup group = new CustomerGroup();
        group.setParentId(parentId);
        return groupMapper.selectGroupCount(group);
    }

    /**
     * 查询部门是否存在用户
     *
     * @param groupId 部门ID
     * @return 结果 true 存在 false 不存在
     */
    @Override
    public boolean checkGroupExistUser(Long groupId) {
        int result = groupMapper.checkGroupExistUser(groupId);
        return result > 0;
    }

    /**
     * 删除部门管理信息
     *
     * @param groupId 部门ID
     * @return 结果
     */
    @Override
    public int deleteGroupById(Long groupId) {
        return groupMapper.deleteGroupById(groupId);
    }

    /**
     * 新增保存部门信息
     *
     * @param group 部门信息
     * @return 结果
     */
    @Override
    public int insertGroup(CustomerGroup group) {
        CustomerGroup info = groupMapper.selectGroupById(group.getParentId());
        // 如果父节点不为"正常"状态,则不允许新增子节点
        if (!UserConstants.DEPT_NORMAL.equals(info.getStatus())) {
            throw new ServiceException("部门停用，不允许新增");
        }
        group.setAncestors(info.getAncestors() + "," + group.getParentId());
        return groupMapper.insertGroup(group);
    }

    /**
     * 修改保存部门信息
     *
     * @param group 部门信息
     * @return 结果
     */
    @Override
    @Transactional
    public int updateGroup(CustomerGroup group) {
        CustomerGroup newParentGroup = groupMapper.selectGroupById(group.getParentId());
        CustomerGroup oldGroup = selectGroupById(group.getGroupId());
        if (StringUtils.isNotNull(newParentGroup) && StringUtils.isNotNull(oldGroup)) {
            String newAncestors = newParentGroup.getAncestors() + "," + newParentGroup.getGroupId();
            String oldAncestors = oldGroup.getAncestors();
            group.setAncestors(newAncestors);
            updateGroupChildren(group.getGroupId(), newAncestors, oldAncestors);
        }
        int result = groupMapper.updateGroup(group);
        if (UserConstants.DEPT_NORMAL.equals(group.getStatus()) && StringUtils.isNotEmpty(group.getAncestors())
                && !StringUtils.equals("0", group.getAncestors())) {
            // 如果该部门是启用状态，则启用该部门的所有上级部门
            updateParentGroupStatusNormal(group);
        }
        return result;
    }

    /**
     * 修改该部门的父级部门状态
     *
     * @param group 当前部门
     */
    private void updateParentGroupStatusNormal(CustomerGroup group) {
        String ancestors = group.getAncestors();
        Long[] groupIds = Convert.toLongArray(ancestors);
        groupMapper.updateGroupStatusNormal(groupIds);
    }

    /**
     * 修改子元素关系
     *
     * @param groupId      被修改的部门ID
     * @param newAncestors 新的父ID集合
     * @param oldAncestors 旧的父ID集合
     */
    public void updateGroupChildren(Long groupId, String newAncestors, String oldAncestors) {
        List<CustomerGroup> children = groupMapper.selectChildrenGroupById(groupId);
        for (CustomerGroup child : children) {
            child.setAncestors(child.getAncestors().replaceFirst(oldAncestors, newAncestors));
        }
        if (children.size() > 0) {
            groupMapper.updateGroupChildren(children);
        }
    }

    /**
     * 根据部门ID查询信息
     *
     * @param groupId 部门ID
     * @return 部门信息
     */
    @Override
    public CustomerGroup selectGroupById(Long groupId) {
        return groupMapper.selectGroupById(groupId);
    }

    /**
     * 根据ID查询所有子部门（正常状态）
     *
     * @param groupId 部门ID
     * @return 子部门数
     */
    @Override
    public int selectNormalChildrenGroupById(Long groupId) {
        return groupMapper.selectNormalChildrenGroupById(groupId);
    }

    /**
     * 校验部门名称是否唯一
     *
     * @param group 部门信息
     * @return 结果
     */
    @Override
    public String checkGroupNameUnique(CustomerGroup group) {
        Long groupId = StringUtils.isNull(group.getGroupId()) ? -1L : group.getGroupId();
        CustomerGroup info = groupMapper.checkGroupNameUnique(group.getGroupName(), group.getParentId());
        if (StringUtils.isNotNull(info) && info.getGroupId().longValue() != groupId.longValue()) {
            return UserConstants.DEPT_NAME_NOT_UNIQUE;
        }
        return UserConstants.DEPT_NAME_UNIQUE;
    }

    /**
     * 校验部门是否有数据权限
     *
     * @param groupId 部门id
     */
    @Override
    public void checkGroupDataScope(Long groupId) {
        if (!SysUser.isAdmin(ShiroUtils.getUserId())) {
            CustomerGroup group = new CustomerGroup();
            group.setGroupId(groupId);
            List<CustomerGroup> groups = SpringUtils.getAopProxy(this).selectGroupList(group);
            if (StringUtils.isEmpty(groups)) {
                throw new ServiceException("没有权限访问部门数据！");
            }
        }
    }
}
