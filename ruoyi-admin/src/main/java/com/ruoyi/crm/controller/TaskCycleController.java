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
import com.ruoyi.crm.domain.TaskCycle;
import com.ruoyi.crm.service.ITaskCycleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 任务周期Controller
 * 
 * @author swj
 * @date 2022-07-07
 */
@Controller
@RequestMapping("/crm/taskcycle")
public class TaskCycleController extends BaseController
{
    private final String prefix = "crm/taskcycle";

    @Autowired
    private ITaskCycleService taskCycleService;

    @RequiresPermissions("crm:taskcycle:view")
    @GetMapping()
    public String taskcycle()
    {
        return prefix + "/taskcycle";
    }

    /**
     * 查询任务周期列表
     */
    @RequiresPermissions("crm:taskcycle:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TaskCycle taskCycle)
    {
        startPage();
        List<TaskCycle> list = taskCycleService.selectTaskCycleList(taskCycle);
        return getDataTable(list);
    }

    /**
     * 导出任务周期列表
     */
    @RequiresPermissions("crm:taskcycle:export")
    @Log(title = "任务周期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TaskCycle taskCycle)
    {
        List<TaskCycle> list = taskCycleService.selectTaskCycleList(taskCycle);
        ExcelUtil<TaskCycle> util = new ExcelUtil<TaskCycle>(TaskCycle.class);
        return util.exportExcel(list, "任务周期数据");
    }

    /**
     * 新增任务周期
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存任务周期
     */
    @RequiresPermissions("crm:taskcycle:add")
    @Log(title = "任务周期", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TaskCycle taskCycle)
    {
        return toAjax(taskCycleService.insertTaskCycle(taskCycle));
    }

    /**
     * 修改任务周期
     */
    @RequiresPermissions("crm:taskcycle:edit")
    @GetMapping("/edit/{tcId}")
    public String edit(@PathVariable("tcId") Long tcId, ModelMap mmap)
    {
        TaskCycle taskCycle = taskCycleService.selectTaskCycleByTcId(tcId);
        mmap.put("taskCycle", taskCycle);
        return prefix + "/edit";
    }

    /**
     * 修改保存任务周期
     */
    @RequiresPermissions("crm:taskcycle:edit")
    @Log(title = "任务周期", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TaskCycle taskCycle)
    {
        return toAjax(taskCycleService.updateTaskCycle(taskCycle));
    }

    /**
     * 删除任务周期
     */
    @RequiresPermissions("crm:taskcycle:remove")
    @Log(title = "任务周期", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(taskCycleService.deleteTaskCycleByTcIds(ids));
    }
}
