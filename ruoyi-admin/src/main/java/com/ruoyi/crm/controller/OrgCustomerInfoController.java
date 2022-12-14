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
import com.ruoyi.crm.domain.OrgCustomerInfo;
import com.ruoyi.crm.service.IOrgCustomerInfoService;
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
@RequestMapping("/crm/orgcust")
public class OrgCustomerInfoController extends BaseController
{
    private final String prefix = "crm/orgcust";

    @Autowired
    private IOrgCustomerInfoService orgCustomerInfoService;

    @RequiresPermissions("crm:orgcust:view")
    @GetMapping()
    public String orgcust()
    {
        return prefix + "/orgcust";
    }

    /**
     * 查询潜在客户列表
     */
    @RequiresPermissions("crm:orgcust:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrgCustomerInfo orgCustomerInfo)
    {
        startPage();
        List<OrgCustomerInfo> list = orgCustomerInfoService.selectOrgCustomerInfoList(orgCustomerInfo);
        return getDataTable(list);
    }

    /**
     * 导出潜在客户列表
     */
    @RequiresPermissions("crm:orgcust:export")
    @Log(title = "潜在客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrgCustomerInfo orgCustomerInfo)
    {
        List<OrgCustomerInfo> list = orgCustomerInfoService.selectOrgCustomerInfoList(orgCustomerInfo);
        ExcelUtil<OrgCustomerInfo> util = new ExcelUtil<OrgCustomerInfo>(OrgCustomerInfo.class);
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
    @RequiresPermissions("crm:orgcust:add")
    @Log(title = "潜在客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrgCustomerInfo orgCustomerInfo)
    {
        return toAjax(orgCustomerInfoService.insertOrgCustomerInfo(orgCustomerInfo));
    }

    /**
     * 修改潜在客户
     */
    @RequiresPermissions("crm:orgcust:edit")
    @GetMapping("/edit/{orgId}")
    public String edit(@PathVariable("orgId") Long orgId, ModelMap mmap)
    {
        OrgCustomerInfo orgCustomerInfo = orgCustomerInfoService.selectOrgCustomerInfoByOrgId(orgId);
        mmap.put("orgCustomerInfo", orgCustomerInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存潜在客户
     */
    @RequiresPermissions("crm:orgcust:edit")
    @Log(title = "潜在客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrgCustomerInfo orgCustomerInfo)
    {
        return toAjax(orgCustomerInfoService.updateOrgCustomerInfo(orgCustomerInfo));
    }

    /**
     * 删除潜在客户
     */
    @RequiresPermissions("crm:orgcust:remove")
    @Log(title = "潜在客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(orgCustomerInfoService.deleteOrgCustomerInfoByOrgIds(ids));
    }
}
