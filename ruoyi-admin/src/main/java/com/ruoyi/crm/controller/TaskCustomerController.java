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
import com.ruoyi.crm.domain.TaskCustomer;
import com.ruoyi.crm.service.ITaskCustomerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 意向跟进Controller
 * 
 * @author swj
 * @date 2022-07-10
 */
@Controller
@RequestMapping("/crm/taskcustomer")
public class TaskCustomerController extends BaseController
{
    private final String prefix = "crm/taskcustomer";

    @Autowired
    private ITaskCustomerService taskCustomerService;

    @RequiresPermissions("crm:taskcustomer:view")
    @GetMapping()
    public String taskcustomer()
    {
        return prefix + "/taskcustomer";
    }

    /**
     * 查询意向跟进列表
     */
    @RequiresPermissions("crm:taskcustomer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TaskCustomer taskCustomer)
    {
        startPage();
        List<TaskCustomer> list = taskCustomerService.selectTaskCustomerList(taskCustomer);
        return getDataTable(list);
    }

    /**
     * 导出意向跟进列表
     */
    @RequiresPermissions("crm:taskcustomer:export")
    @Log(title = "意向跟进", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TaskCustomer taskCustomer)
    {
        List<TaskCustomer> list = taskCustomerService.selectTaskCustomerList(taskCustomer);
        ExcelUtil<TaskCustomer> util = new ExcelUtil<TaskCustomer>(TaskCustomer.class);
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
    @RequiresPermissions("crm:taskcustomer:add")
    @Log(title = "意向跟进", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TaskCustomer taskCustomer)
    {
        return toAjax(taskCustomerService.insertTaskCustomer(taskCustomer));
    }

    /**
     * 修改意向跟进
     */
    @RequiresPermissions("crm:taskcustomer:edit")
    @GetMapping("/edit/{taskId}")
    public String edit(@PathVariable("taskId") Long taskId, ModelMap mmap)
    {
        TaskCustomer taskCustomer = taskCustomerService.selectTaskCustomerByTaskId(taskId);
        mmap.put("taskCustomer", taskCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存意向跟进
     */
    @RequiresPermissions("crm:taskcustomer:edit")
    @Log(title = "意向跟进", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TaskCustomer taskCustomer)
    {
        return toAjax(taskCustomerService.updateTaskCustomer(taskCustomer));
    }

    /**
     * 删除意向跟进
     */
    @RequiresPermissions("crm:taskcustomer:remove")
    @Log(title = "意向跟进", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(taskCustomerService.deleteTaskCustomerByTaskIds(ids));
    }
}
