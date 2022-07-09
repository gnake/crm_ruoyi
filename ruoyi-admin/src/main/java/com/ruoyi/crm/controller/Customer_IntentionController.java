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
import com.ruoyi.crm.domain.Customer_Intention;
import com.ruoyi.crm.service.ICustomer_IntentionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 意向跟进Controller
 * 
 * @author 高国文
 * @date 2022-07-09
 */
@Controller
@RequestMapping("/crm/CustomerIntetion")
public class Customer_IntentionController extends BaseController
{
    private final String prefix = "crm/CustomerIntetion";

    @Autowired
    private ICustomer_IntentionService customer_IntentionService;

    @RequiresPermissions("crm:CustomerIntetion:view")
    @GetMapping()
    public String CustomerIntetion()
    {
        return prefix + "/CustomerIntetion";
    }

    /**
     * 查询意向跟进列表
     */
    @RequiresPermissions("crm:CustomerIntetion:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Customer_Intention customer_Intention)
    {
        startPage();
        List<Customer_Intention> list = customer_IntentionService.selectCustomer_IntentionList(customer_Intention);
        return getDataTable(list);
    }

    /**
     * 导出意向跟进列表
     */
    @RequiresPermissions("crm:CustomerIntetion:export")
    @Log(title = "意向跟进", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Customer_Intention customer_Intention)
    {
        List<Customer_Intention> list = customer_IntentionService.selectCustomer_IntentionList(customer_Intention);
        ExcelUtil<Customer_Intention> util = new ExcelUtil<Customer_Intention>(Customer_Intention.class);
        return util.exportExcel(list, "意向跟进数据");
    }

    /**
     * 新增意向跟进
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存意向跟进
     */
    @RequiresPermissions("crm:CustomerIntetion:add")
    @Log(title = "意向跟进", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Customer_Intention customer_Intention)
    {
        return toAjax(customer_IntentionService.insertCustomer_Intention(customer_Intention));
    }

    /**
     * 修改意向跟进
     */
    @RequiresPermissions("crm:CustomerIntetion:edit")
    @GetMapping("/edit/{custId}")
    public String edit(@PathVariable("custId") Long custId, ModelMap mmap)
    {
        Customer_Intention customer_Intention = customer_IntentionService.selectCustomer_IntentionByCustId(custId);
        mmap.put("customer_Intention", customer_Intention);
        return prefix + "/edit";
    }

    /**
     * 修改保存意向跟进
     */
    @RequiresPermissions("crm:CustomerIntetion:edit")
    @Log(title = "意向跟进", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Customer_Intention customer_Intention)
    {
        return toAjax(customer_IntentionService.updateCustomer_Intention(customer_Intention));
    }

    /**
     * 删除意向跟进
     */
    @RequiresPermissions("crm:CustomerIntetion:remove")
    @Log(title = "意向跟进", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customer_IntentionService.deleteCustomer_IntentionByCustIds(ids));
    }
}
