package com.ruoyi.crm.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.crm.domain.CrmOrgInfo;
import com.ruoyi.crm.service.ICrmOrgInfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 潜在客户Controller
 * 
 * @author zxl
 * @date 2022-07-07
 */
@Controller
@RequestMapping("/crm/mycust_info")
public class CrmOrgInfoController extends BaseController
{
    private String prefix = "crm/mycust_info";

    @Autowired
    private ICrmOrgInfoService crmOrgInfoService;

    @RequiresPermissions("crm:mycust_info:view")
    @GetMapping()
    public String mycust_info()
    {
        return prefix + "/mycust_info";
    }

    /**
     * 查询潜在客户列表
     */
    @RequiresPermissions("crm:mycust_info:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CrmOrgInfo crmOrgInfo)
    {
        startPage();
        List<CrmOrgInfo> list = crmOrgInfoService.selectCrmOrgInfoList(crmOrgInfo);
        return getDataTable(list);
    }

    /**
     * 导出潜在客户列表
     */
    @RequiresPermissions("crm:mycust_info:export")
    @Log(title = "潜在客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CrmOrgInfo crmOrgInfo)
    {
        List<CrmOrgInfo> list = crmOrgInfoService.selectCrmOrgInfoList(crmOrgInfo);
        ExcelUtil<CrmOrgInfo> util = new ExcelUtil<CrmOrgInfo>(CrmOrgInfo.class);
        return util.exportExcel(list, "潜在客户数据");
    }

    /**
     * 新增潜在客户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存潜在客户
     */
    @RequiresPermissions("crm:mycust_info:add")
    @Log(title = "潜在客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CrmOrgInfo crmOrgInfo)
    {
        return toAjax(crmOrgInfoService.insertCrmOrgInfo(crmOrgInfo));
    }

    /**
     * 修改潜在客户
     */
    @RequiresPermissions("crm:mycust_info:edit")
    @GetMapping("/edit/{orgId}")
    public String edit(@PathVariable("orgId") Long orgId, ModelMap mmap)
    {
        CrmOrgInfo crmOrgInfo = crmOrgInfoService.selectCrmOrgInfoByOrgId(orgId);
        mmap.put("crmOrgInfo", crmOrgInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存潜在客户
     */
    @RequiresPermissions("crm:mycust_info:edit")
    @Log(title = "潜在客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CrmOrgInfo crmOrgInfo)
    {
        return toAjax(crmOrgInfoService.updateCrmOrgInfo(crmOrgInfo));
    }

    /**
     * 删除潜在客户
     */
    @RequiresPermissions("crm:mycust_info:remove")
    @Log(title = "潜在客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(crmOrgInfoService.deleteCrmOrgInfoByOrgIds(ids));
    }
}
