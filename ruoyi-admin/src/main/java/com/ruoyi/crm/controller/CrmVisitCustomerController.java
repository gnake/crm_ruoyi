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
import com.ruoyi.crm.domain.CrmVisitCustomer;
import com.ruoyi.crm.service.ICrmVisitCustomerService;
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
@RequestMapping("/crm/CrmVisitCustomer")
public class CrmVisitCustomerController extends BaseController
{
    private final String prefix = "crm/CrmVisitCustomer";

    @Autowired
    private ICrmVisitCustomerService crmVisitCustomerService;

    @RequiresPermissions("crm:CrmVisitCustomer:view")
    @GetMapping()
    public String CrmVisitCustomer()
    {
        return prefix + "/CrmVisitCustomer";
    }

    /**
     * 查询我的客户列表
     */
    @RequiresPermissions("crm:CrmVisitCustomer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CrmVisitCustomer crmVisitCustomer)
    {
        startPage();
        List<CrmVisitCustomer> list = crmVisitCustomerService.selectCrmVisitCustomerList(crmVisitCustomer);
        return getDataTable(list);
    }

    /**
     * 导出我的客户列表
     */
    @RequiresPermissions("crm:CrmVisitCustomer:export")
    @Log(title = "我的客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CrmVisitCustomer crmVisitCustomer)
    {
        List<CrmVisitCustomer> list = crmVisitCustomerService.selectCrmVisitCustomerList(crmVisitCustomer);
        ExcelUtil<CrmVisitCustomer> util = new ExcelUtil<CrmVisitCustomer>(CrmVisitCustomer.class);
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
    @RequiresPermissions("crm:CrmVisitCustomer:add")
    @Log(title = "我的客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CrmVisitCustomer crmVisitCustomer)
    {
        return toAjax(crmVisitCustomerService.insertCrmVisitCustomer(crmVisitCustomer));
    }

    /**
     * 修改我的客户
     */
    @RequiresPermissions("crm:CrmVisitCustomer:edit")
    @GetMapping("/edit/{visitId}")
    public String edit(@PathVariable("visitId") Long visitId, ModelMap mmap)
    {
        CrmVisitCustomer crmVisitCustomer = crmVisitCustomerService.selectCrmVisitCustomerByVisitId(visitId);
        mmap.put("crmVisitCustomer", crmVisitCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存我的客户
     */
    @RequiresPermissions("crm:CrmVisitCustomer:edit")
    @Log(title = "我的客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CrmVisitCustomer crmVisitCustomer)
    {
        return toAjax(crmVisitCustomerService.updateCrmVisitCustomer(crmVisitCustomer));
    }

    /**
     * 删除我的客户
     */
    @RequiresPermissions("crm:CrmVisitCustomer:remove")
    @Log(title = "我的客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(crmVisitCustomerService.deleteCrmVisitCustomerByVisitIds(ids));
    }
}
