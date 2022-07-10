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
import com.ruoyi.crm.domain.MyTaskReview;
import com.ruoyi.crm.service.IMyTaskReviewService;
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
@RequestMapping("/crm/mytaskreview")
public class MyTaskReviewController extends BaseController
{
    private final String prefix = "crm/mytaskreview";

    @Autowired
    private IMyTaskReviewService myTaskReviewService;

    @RequiresPermissions("crm:mytaskreview:view")
    @GetMapping()
    public String mytaskreview()
    {
        return prefix + "/mytaskreview";
    }

    /**
     * 查询工作总结列表
     */
    @RequiresPermissions("crm:mytaskreview:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyTaskReview myTaskReview)
    {
        startPage();
        List<MyTaskReview> list = myTaskReviewService.selectMyTaskReviewList(myTaskReview);
        return getDataTable(list);
    }

    /**
     * 导出工作总结列表
     */
    @RequiresPermissions("crm:mytaskreview:export")
    @Log(title = "工作总结", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MyTaskReview myTaskReview)
    {
        List<MyTaskReview> list = myTaskReviewService.selectMyTaskReviewList(myTaskReview);
        ExcelUtil<MyTaskReview> util = new ExcelUtil<MyTaskReview>(MyTaskReview.class);
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
    @RequiresPermissions("crm:mytaskreview:add")
    @Log(title = "工作总结", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MyTaskReview myTaskReview)
    {
        return toAjax(myTaskReviewService.insertMyTaskReview(myTaskReview));
    }

    /**
     * 修改工作总结
     */
    @RequiresPermissions("crm:mytaskreview:edit")
    @GetMapping("/edit/{taskId}")
    public String edit(@PathVariable("taskId") Long taskId, ModelMap mmap)
    {
        MyTaskReview myTaskReview = myTaskReviewService.selectMyTaskReviewByTaskId(taskId);
        mmap.put("myTaskReview", myTaskReview);
        return prefix + "/edit";
    }

    /**
     * 修改保存工作总结
     */
    @RequiresPermissions("crm:mytaskreview:edit")
    @Log(title = "工作总结", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MyTaskReview myTaskReview)
    {
        return toAjax(myTaskReviewService.updateMyTaskReview(myTaskReview));
    }

    /**
     * 删除工作总结
     */
    @RequiresPermissions("crm:mytaskreview:remove")
    @Log(title = "工作总结", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(myTaskReviewService.deleteMyTaskReviewByTaskIds(ids));
    }
}
