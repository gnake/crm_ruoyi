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
import com.ruoyi.crm.domain.TaskReview;
import com.ruoyi.crm.service.ITaskReviewService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工作总结Controller
 * 
 * @author swj
 * @date 2022-07-08
 */
@Controller
@RequestMapping("/crm/REVIEW")
public class TaskReviewController extends BaseController
{
    private final String prefix = "crm/REVIEW";

    @Autowired
    private ITaskReviewService taskReviewService;

    @RequiresPermissions("crm:REVIEW:view")
    @GetMapping()
    public String REVIEW()
    {
        return prefix + "/REVIEW";
    }

    /**
     * 查询工作总结列表
     */
    @RequiresPermissions("crm:REVIEW:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TaskReview taskReview)
    {
        startPage();
        List<TaskReview> list = taskReviewService.selectTaskReviewList(taskReview);
        return getDataTable(list);
    }

    /**
     * 导出工作总结列表
     */
    @RequiresPermissions("crm:REVIEW:export")
    @Log(title = "工作总结", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TaskReview taskReview)
    {
        List<TaskReview> list = taskReviewService.selectTaskReviewList(taskReview);
        ExcelUtil<TaskReview> util = new ExcelUtil<TaskReview>(TaskReview.class);
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
    @RequiresPermissions("crm:REVIEW:add")
    @Log(title = "工作总结", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TaskReview taskReview)
    {
        return toAjax(taskReviewService.insertTaskReview(taskReview));
    }

    /**
     * 修改工作总结
     */
    @RequiresPermissions("crm:REVIEW:edit")
    @GetMapping("/edit/{taskReviewId}")
    public String edit(@PathVariable("taskReviewId") Long taskReviewId, ModelMap mmap)
    {
        TaskReview taskReview = taskReviewService.selectTaskReviewByTaskReviewId(taskReviewId);
        mmap.put("taskReview", taskReview);
        return prefix + "/edit";
    }

    /**
     * 修改保存工作总结
     */
    @RequiresPermissions("crm:REVIEW:edit")
    @Log(title = "工作总结", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TaskReview taskReview)
    {
        return toAjax(taskReviewService.updateTaskReview(taskReview));
    }

    /**
     * 删除工作总结
     */
    @RequiresPermissions("crm:REVIEW:remove")
    @Log(title = "工作总结", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(taskReviewService.deleteTaskReviewByTaskReviewIds(ids));
    }
}
