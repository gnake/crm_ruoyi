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
import com.ruoyi.crm.domain.crmOrgCustomerInfo;
import com.ruoyi.crm.service.IcrmOrgCustomerInfoService;
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
@RequestMapping("/crm/mycust")
public class crmOrgCustomerInfoController extends BaseController
{
    private final String prefix = "crm/mycust";

    @Autowired
    private IcrmOrgCustomerInfoService crmOrgCustomerInfoService;

    @RequiresPermissions("crm:mycust:view")
    @GetMapping()
    public String mycust()
    {
        return prefix + "/mycust";
    }

    /**
     * 查询潜在客户列表
     */
    @RequiresPermissions("crm:mycust:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(crmOrgCustomerInfo crmOrgCustomerInfo)
    {
        startPage();
        List<crmOrgCustomerInfo> list = crmOrgCustomerInfoService.selectcrmOrgCustomerInfoList(crmOrgCustomerInfo);
        return getDataTable(list);
    }

    /**
     * 导出潜在客户列表
     */
    @RequiresPermissions("crm:mycust:export")
    @Log(title = "潜在客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(crmOrgCustomerInfo crmOrgCustomerInfo)
    {
        List<crmOrgCustomerInfo> list = crmOrgCustomerInfoService.selectcrmOrgCustomerInfoList(crmOrgCustomerInfo);
        ExcelUtil<crmOrgCustomerInfo> util = new ExcelUtil<crmOrgCustomerInfo>(crmOrgCustomerInfo.class);
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
    @RequiresPermissions("crm:mycust:add")
    @Log(title = "潜在客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(crmOrgCustomerInfo crmOrgCustomerInfo)
    {
        return toAjax(crmOrgCustomerInfoService.insertcrmOrgCustomerInfo(crmOrgCustomerInfo));
    }

    /**
     * 修改潜在客户
     */
    @RequiresPermissions("crm:mycust:edit")
    @GetMapping("/edit/{orgId}")
    public String edit(@PathVariable("orgId") Long orgId, ModelMap mmap)
    {
        crmOrgCustomerInfo crmOrgCustomerInfo = crmOrgCustomerInfoService.selectcrmOrgCustomerInfoByOrgId(orgId);
        mmap.put("crmOrgCustomerInfo", crmOrgCustomerInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存潜在客户
     */
    @RequiresPermissions("crm:mycust:edit")
    @Log(title = "潜在客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(crmOrgCustomerInfo crmOrgCustomerInfo)
    {
        return toAjax(crmOrgCustomerInfoService.updatecrmOrgCustomerInfo(crmOrgCustomerInfo));
    }

    /**
     * 删除潜在客户
     */
    @RequiresPermissions("crm:mycust:remove")
    @Log(title = "潜在客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(crmOrgCustomerInfoService.deletecrmOrgCustomerInfoByOrgIds(ids));
    }
}
