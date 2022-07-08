package com.ruoyi.crm.mapper;

import java.util.List;

import com.ruoyi.crm.domain.CustomerGroup;
import org.apache.ibatis.annotations.Param;

/**
 * 客户分组Mapper接口
 *
 * @author gsh
 * @date 2022-07-07
 */
public interface CustomerGroupMapper {
    /**
     * 查询部门人数
     *
     * @param group 部门信息
     * @return 结果
     */
    int selectGroupCount(CustomerGroup group);

    /**
     * 查询部门是否存在用户
     *
     * @param groupId 部门ID
     * @return 结果
     */
    int checkGroupExistUser(Long groupId);

    /**
     * 查询部门管理数据
     *
     * @param group 部门信息
     * @return 部门信息集合
     */
    List<CustomerGroup> selectGroupList(CustomerGroup group);

    /**
     * 删除部门管理信息
     *
     * @param groupId 部门ID
     * @return 结果
     */
    int deleteGroupById(Long groupId);

    /**
     * 新增部门信息
     *
     * @param group 部门信息
     * @return 结果
     */
    int insertGroup(CustomerGroup group);

    /**
     * 修改部门信息
     *
     * @param group 部门信息
     * @return 结果
     */
    int updateGroup(CustomerGroup group);

    /**
     * 修改子元素关系
     *
     * @param groups 子元素
     * @return 结果
     */
    int updateGroupChildren(@Param("groups") List<CustomerGroup> groups);

    /**
     * 根据部门ID查询信息
     *
     * @param groupId 部门ID
     * @return 部门信息
     */
    CustomerGroup selectGroupById(Long groupId);

    /**
     * 校验部门名称是否唯一
     *
     * @param groupName 部门名称
     * @param parentId 父部门ID
     * @return 结果
     */
    CustomerGroup checkGroupNameUnique(@Param("groupName") String groupName, @Param("parentId") Long parentId);

    /**
     * 根据角色ID查询部门
     *
     * @param roleId 角色ID
     * @return 部门列表
     */
    List<String> selectCustomerGroupTree(Long roleId);

    /**
     * 修改所在部门正常状态
     *
     * @param groupIds 部门ID组
     */
    void updateGroupStatusNormal(Long[] groupIds);

    /**
     * 根据ID查询所有子部门
     *
     * @param groupId 部门ID
     * @return 部门列表
     */
    List<CustomerGroup> selectChildrenGroupById(Long groupId);

    /**
     * 根据ID查询所有子部门（正常状态）
     *
     * @param groupId 部门ID
     * @return 子部门数
     */
    int selectNormalChildrenGroupById(Long groupId);
}
