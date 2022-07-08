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
import com.ruoyi.crm.domain.CrmMyCustomer;
import com.ruoyi.crm.service.ICrmMyCustomerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 我的客户Controller
 * 
 * @author 童楷涵
 * @date 2022-07-08
 */
@Controller
@RequestMapping("/crm/mycustomer")
public class CrmMyCustomerController extends BaseController
{
    private final String prefix = "crm/mycustomer";

    @Autowired
    private ICrmMyCustomerService crmMyCustomerService;

    @RequiresPermissions("crm:mycustomer:view")
    @GetMapping()
    public String mycustomer()
    {
        return prefix + "/mycustomer";
    }

    /**
     * 查询我的客户列表
     */
    @RequiresPermissions("crm:mycustomer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CrmMyCustomer crmMyCustomer)
    {
        startPage();
        List<CrmMyCustomer> list = crmMyCustomerService.selectCrmMyCustomerList(crmMyCustomer);
        return getDataTable(list);
    }

    /**
     * 导出我的客户列表
     */
    @RequiresPermissions("crm:mycustomer:export")
    @Log(title = "我的客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CrmMyCustomer crmMyCustomer)
    {
        List<CrmMyCustomer> list = crmMyCustomerService.selectCrmMyCustomerList(crmMyCustomer);
        ExcelUtil<CrmMyCustomer> util = new ExcelUtil<CrmMyCustomer>(CrmMyCustomer.class);
        return util.exportExcel(list, "我的客户数据");
    }

    /**
     * 新增我的客户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存我的客户
     */
    @RequiresPermissions("crm:mycustomer:add")
    @Log(title = "我的客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CrmMyCustomer crmMyCustomer)
    {
        return toAjax(crmMyCustomerService.insertCrmMyCustomer(crmMyCustomer));
    }

    /**
     * 修改我的客户
     */
    @RequiresPermissions("crm:mycustomer:edit")
    @GetMapping("/edit/{custId}")
    public String edit(@PathVariable("custId") Long custId, ModelMap mmap)
    {
        CrmMyCustomer crmMyCustomer = crmMyCustomerService.selectCrmMyCustomerByCustId(custId);
        mmap.put("crmMyCustomer", crmMyCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存我的客户
     */
    @RequiresPermissions("crm:mycustomer:edit")
    @Log(title = "我的客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CrmMyCustomer crmMyCustomer)
    {
        return toAjax(crmMyCustomerService.updateCrmMyCustomer(crmMyCustomer));
    }

    /**
     * 删除我的客户
     */
    @RequiresPermissions("crm:mycustomer:remove")
    @Log(title = "我的客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(crmMyCustomerService.deleteCrmMyCustomerByCustIds(ids));
    }
}
