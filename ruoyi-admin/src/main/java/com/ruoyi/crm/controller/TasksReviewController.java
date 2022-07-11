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
import com.ruoyi.crm.domain.TasksReview;
import com.ruoyi.crm.service.ITasksReviewService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工作总结Controller
 * 
 * @author swj
 * @date 2022-07-10
 */
@Controller
@RequestMapping("/crm/mytasksreview")
public class TasksReviewController extends BaseController
{
    private final String prefix = "crm/mytasksreview";

    @Autowired
    private ITasksReviewService tasksReviewService;

    @RequiresPermissions("crm:mytasksreview:view")
    @GetMapping()
    public String mytasksreview()
    {
        return prefix + "/mytasksreview";
    }

    /**
     * 查询工作总结列表
     */
    @RequiresPermissions("crm:mytasksreview:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TasksReview tasksReview)
    {
        startPage();
        List<TasksReview> list = tasksReviewService.selectTasksReviewList(tasksReview);
        return getDataTable(list);
    }

    /**
     * 导出工作总结列表
     */
    @RequiresPermissions("crm:mytasksreview:export")
    @Log(title = "工作总结", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TasksReview tasksReview)
    {
        List<TasksReview> list = tasksReviewService.selectTasksReviewList(tasksReview);
        ExcelUtil<TasksReview> util = new ExcelUtil<TasksReview>(TasksReview.class);
        return util.exportExcel(list, "工作总结数据");
    }

    /**
     * 新增工作总结
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工作总结
     */
    @RequiresPermissions("crm:mytasksreview:add")
    @Log(title = "工作总结", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TasksReview tasksReview)
    {
        return toAjax(tasksReviewService.insertTasksReview(tasksReview));
    }

    /**
     * 修改工作总结
     */
    @RequiresPermissions("crm:mytasksreview:edit")
    @GetMapping("/edit/{taskReviewId}")
    public String edit(@PathVariable("taskReviewId") Long taskReviewId, ModelMap mmap)
    {
        TasksReview tasksReview = tasksReviewService.selectTasksReviewByTaskReviewId(taskReviewId);
        mmap.put("tasksReview", tasksReview);
        return prefix + "/edit";
    }

    /**
     * 修改保存工作总结
     */
    @RequiresPermissions("crm:mytasksreview:edit")
    @Log(title = "工作总结", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TasksReview tasksReview)
    {
        return toAjax(tasksReviewService.updateTasksReview(tasksReview));
    }

    /**
     * 删除工作总结
     */
    @RequiresPermissions("crm:mytasksreview:remove")
    @Log(title = "工作总结", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tasksReviewService.deleteTasksReviewByTaskReviewIds(ids));
    }
}
