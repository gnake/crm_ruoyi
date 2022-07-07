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
import com.ruoyi.crm.domain.SysMyCustomer;
import com.ruoyi.crm.service.ISysMyCustomerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 我的客户Controller
 * 
 * @author tkh
 * @date 2022-07-07
 */
@Controller
@RequestMapping("/crm/mycustomer")
public class SysMyCustomerController extends BaseController
{
    private final String prefix = "crm/mycustomer";

    @Autowired
    private ISysMyCustomerService sysMyCustomerService;

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
    public TableDataInfo list(SysMyCustomer sysMyCustomer)
    {
        startPage();
        List<SysMyCustomer> list = sysMyCustomerService.selectSysMyCustomerList(sysMyCustomer);
        return getDataTable(list);
    }

    /**
     * 导出我的客户列表
     */
    @RequiresPermissions("crm:mycustomer:export")
    @Log(title = "我的客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysMyCustomer sysMyCustomer)
    {
        List<SysMyCustomer> list = sysMyCustomerService.selectSysMyCustomerList(sysMyCustomer);
        ExcelUtil<SysMyCustomer> util = new ExcelUtil<SysMyCustomer>(SysMyCustomer.class);
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
    public AjaxResult addSave(SysMyCustomer sysMyCustomer)
    {
        return toAjax(sysMyCustomerService.insertSysMyCustomer(sysMyCustomer));
    }

    /**
     * 修改我的客户
     */
    @RequiresPermissions("crm:mycustomer:edit")
    @GetMapping("/edit/{custId}")
    public String edit(@PathVariable("custId") Long custId, ModelMap mmap)
    {
        SysMyCustomer sysMyCustomer = sysMyCustomerService.selectSysMyCustomerByCustId(custId);
        mmap.put("sysMyCustomer", sysMyCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存我的客户
     */
    @RequiresPermissions("crm:mycustomer:edit")
    @Log(title = "我的客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysMyCustomer sysMyCustomer)
    {
        return toAjax(sysMyCustomerService.updateSysMyCustomer(sysMyCustomer));
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
        return toAjax(sysMyCustomerService.deleteSysMyCustomerByCustIds(ids));
    }
}
