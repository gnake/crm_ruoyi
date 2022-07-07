package com.ruoyi.crm.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.crm.domain.CustomerInfo;
import com.ruoyi.crm.service.ICustomerInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 客户管理Controller
 * 
 * @author 李泽楷
 * @date 2022-07-07
 */
@Controller
@RequestMapping("/crm/customerinfo")
public class CustomerInfoController extends BaseController
{
    private String prefix = "crm/customerinfo";

    @Autowired
    private ICustomerInfoService customerInfoService;

    @RequiresPermissions("crm:customerinfo:view")
    @GetMapping()
    public String customerinfo()
    {
        return prefix + "/customerinfo";
    }

    /**
     * 查询客户管理列表
     */
    @RequiresPermissions("crm:customerinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CustomerInfo customerInfo)
    {
        startPage();
        List<CustomerInfo> list = customerInfoService.selectCustomerInfoList(customerInfo);
        return getDataTable(list);
    }

    /**
     * 导出客户管理列表
     */
    @RequiresPermissions("crm:customerinfo:export")
    @Log(title = "客户管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CustomerInfo customerInfo)
    {
        List<CustomerInfo> list = customerInfoService.selectCustomerInfoList(customerInfo);
        ExcelUtil<CustomerInfo> util = new ExcelUtil<CustomerInfo>(CustomerInfo.class);
        return util.exportExcel(list, "客户管理数据");
    }

    /**
     * 新增客户管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户管理
     */
    @RequiresPermissions("crm:customerinfo:add")
    @Log(title = "客户管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CustomerInfo customerInfo)
    {
        return toAjax(customerInfoService.insertCustomerInfo(customerInfo));
    }

    /**
     * 修改客户管理
     */
    @RequiresPermissions("crm:customerinfo:edit")
    @GetMapping("/edit/{custId}")
    public String edit(@PathVariable("custId") Long custId, ModelMap mmap)
    {
        CustomerInfo customerInfo = customerInfoService.selectCustomerInfoByCustId(custId);
        mmap.put("customerInfo", customerInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户管理
     */
    @RequiresPermissions("crm:customerinfo:edit")
    @Log(title = "客户管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CustomerInfo customerInfo)
    {
        return toAjax(customerInfoService.updateCustomerInfo(customerInfo));
    }

    /**
     * 删除客户管理
     */
    @RequiresPermissions("crm:customerinfo:remove")
    @Log(title = "客户管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerInfoService.deleteCustomerInfoByCustIds(ids));
    }
}
