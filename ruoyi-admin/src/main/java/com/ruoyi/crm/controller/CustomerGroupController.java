package com.ruoyi.crm.controller;

import java.util.List;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.utils.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.crm.domain.CustomerGroup;
import com.ruoyi.crm.service.ICustomerGroupService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户分组Controller
 *
 * @author gsh
 * @date 2022-07-07
 */
@Controller
@RequestMapping("/crm/group")
public class CustomerGroupController extends BaseController {
    private final String prefix = "crm/group";

    @Autowired
    private ICustomerGroupService groupService;

    @RequiresPermissions("crm:group:view")
    @GetMapping()
    public String group() {
        return prefix + "/group";
    }

    @RequiresPermissions(" crm:group:list")
    @PostMapping("/list")
    @ResponseBody
    public List<CustomerGroup> list(CustomerGroup group) {
        List<CustomerGroup> groupList = groupService.selectGroupList(group);
        return groupList;
    }

    /**
     * 新增部门
     */
    @GetMapping("/add/{parentId}")
    public String add(@PathVariable("parentId") Long parentId, ModelMap mmap) {
//        if (!getSysUser().isAdmin()) {
//            parentId = getSysUser().getGroupId();
//        }
        mmap.put("group", groupService.selectGroupById(parentId));
        return prefix + "/add";
    }

    /**
     * 新增保存部门
     */
    @Log(title = "部门管理", businessType = BusinessType.INSERT)
    @RequiresPermissions(" crm:group:add")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Validated CustomerGroup group) {
        if (UserConstants.DEPT_NAME_NOT_UNIQUE.equals(groupService.checkGroupNameUnique(group))) {
            return error("新增部门'" + group.getGroupName() + "'失败，部门名称已存在");
        }
        group.setCreateBy(getLoginName());
        return toAjax(groupService.insertGroup(group));
    }

    /**
     * 修改部门
     */
    @RequiresPermissions(" crm:group:edit")
    @GetMapping("/edit/{groupId}")
    public String edit(@PathVariable("groupId") Long groupId, ModelMap mmap) {
        groupService.checkGroupDataScope(groupId);
        CustomerGroup group = groupService.selectGroupById(groupId);
        if (StringUtils.isNotNull(group) && 100L == groupId) {
            group.setParentName("无");
        }
        mmap.put("group", group);
        return prefix + "/edit";
    }

    /**
     * 修改保存部门
     */
    @Log(title = "部门管理", businessType = BusinessType.UPDATE)
    @RequiresPermissions(" crm:group:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@Validated CustomerGroup group) {
        Long groupId = group.getGroupId();
        groupService.checkGroupDataScope(groupId);
        if (UserConstants.DEPT_NAME_NOT_UNIQUE.equals(groupService.checkGroupNameUnique(group))) {
            return error("修改部门'" + group.getGroupName() + "'失败，部门名称已存在");
        } else if (group.getParentId().equals(groupId)) {
            return error("修改部门'" + group.getGroupName() + "'失败，上级部门不能是自己");
        } else if (StringUtils.equals(UserConstants.DEPT_DISABLE, group.getStatus()) && groupService.selectNormalChildrenGroupById(groupId) > 0) {
            return AjaxResult.error("该部门包含未停用的子部门！");
        }
        group.setUpdateBy(getLoginName());
        return toAjax(groupService.updateGroup(group));
    }

    /**
     * 删除
     */
    @Log(title = "部门管理", businessType = BusinessType.DELETE)
    @RequiresPermissions(" crm:group:remove")
    @GetMapping("/remove/{groupId}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("groupId") Long groupId) {
        if (groupService.selectGroupCount(groupId) > 0) {
            return AjaxResult.warn("存在下级部门,不允许删除");
        }
        if (groupService.checkGroupExistUser(groupId)) {
            return AjaxResult.warn("部门存在用户,不允许删除");
        }
        groupService.checkGroupDataScope(groupId);
        return toAjax(groupService.deleteGroupById(groupId));
    }

    /**
     * 校验部门名称
     */
    @PostMapping("/checkGroupNameUnique")
    @ResponseBody
    public String checkGroupNameUnique(CustomerGroup group) {
        return groupService.checkGroupNameUnique(group);
    }

    /**
     * 选择部门树
     *
     * @param groupId   部门ID
     * @param excludeId 排除ID
     */
    @GetMapping(value = {"/selectGroupTree/{groupId}", "/selectGroupTree/{groupId}/{excludeId}"})
    public String selectGroupTree(@PathVariable("groupId") Long groupId,
                                  @PathVariable(value = "excludeId", required = false) String excludeId, ModelMap mmap) {
        mmap.put("group", groupService.selectGroupById(groupId));
        mmap.put("excludeId", excludeId);
        return prefix + "/tree";
    }

    /**
     * 加载部门列表树
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData() {
        List<Ztree> ztrees = groupService.selectGroupTree(new CustomerGroup());
        return ztrees;
    }

    /**
     * 加载部门列表树（排除下级）
     */
    @GetMapping("/treeData/{excludeId}")
    @ResponseBody
    public List<Ztree> treeDataExcludeChild(@PathVariable(value = "excludeId", required = false) Long excludeId) {
        CustomerGroup group = new CustomerGroup();
        group.setExcludeId(excludeId);
        List<Ztree> ztrees = groupService.selectGroupTreeExcludeChild(group);
        return ztrees;
    }

    /**
     * 加载角色部门（数据权限）列表树
     */
    @GetMapping("/roleGroupTreeData")
    @ResponseBody
    public List<Ztree> groupTreeData(SysRole role) {
        List<Ztree> ztrees = groupService.CustomerGroupTreeData(role);
        return ztrees;
    }
}
