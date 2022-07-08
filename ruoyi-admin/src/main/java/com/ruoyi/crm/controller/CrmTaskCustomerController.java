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
import com.ruoyi.crm.domain.CrmTaskCustomer;
import com.ruoyi.crm.service.ICrmTaskCustomerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 意向跟进Controller
 * 
 * @author swj
 * @date 2022-07-08
 */
@Controller
@RequestMapping("/crm/mytaskcustomer")
public class CrmTaskCustomerController extends BaseController
{
    private final String prefix = "crm/mytaskcustomer";

    @Autowired
    private ICrmTaskCustomerService crmTaskCustomerService;

    @RequiresPermissions("crm:mytaskcustomer:view")
    @GetMapping()
    public String mytaskcustomer()
    {
        return prefix + "/mytaskcustomer";
    }

    /**
     * 查询意向跟进列表
     */
    @RequiresPermissions("crm:mytaskcustomer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CrmTaskCustomer crmTaskCustomer)
    {
        startPage();
        List<CrmTaskCustomer> list = crmTaskCustomerService.selectCrmTaskCustomerList(crmTaskCustomer);
        return getDataTable(list);
    }

    /**
     * 导出意向跟进列表
     */
    @RequiresPermissions("crm:mytaskcustomer:export")
    @Log(title = "意向跟进", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CrmTaskCustomer crmTaskCustomer)
    {
        List<CrmTaskCustomer> list = crmTaskCustomerService.selectCrmTaskCustomerList(crmTaskCustomer);
        ExcelUtil<CrmTaskCustomer> util = new ExcelUtil<CrmTaskCustomer>(CrmTaskCustomer.class);
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
    @RequiresPermissions("crm:mytaskcustomer:add")
    @Log(title = "意向跟进", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CrmTaskCustomer crmTaskCustomer)
    {
        return toAjax(crmTaskCustomerService.insertCrmTaskCustomer(crmTaskCustomer));
    }

    /**
     * 修改意向跟进
     */
    @RequiresPermissions("crm:mytaskcustomer:edit")
    @GetMapping("/edit/{custId}")
    public String edit(@PathVariable("custId") Long custId, ModelMap mmap)
    {
        CrmTaskCustomer crmTaskCustomer = crmTaskCustomerService.selectCrmTaskCustomerByCustId(custId);
        mmap.put("crmTaskCustomer", crmTaskCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存意向跟进
     */
    @RequiresPermissions("crm:mytaskcustomer:edit")
    @Log(title = "意向跟进", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CrmTaskCustomer crmTaskCustomer)
    {
        return toAjax(crmTaskCustomerService.updateCrmTaskCustomer(crmTaskCustomer));
    }

    /**
     * 删除意向跟进
     */
    @RequiresPermissions("crm:mytaskcustomer:remove")
    @Log(title = "意向跟进", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(crmTaskCustomerService.deleteCrmTaskCustomerByCustIds(ids));
    }
}
