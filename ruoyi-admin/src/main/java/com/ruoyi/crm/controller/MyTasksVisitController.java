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
import com.ruoyi.crm.domain.MyTasksVisit;
import com.ruoyi.crm.service.IMyTasksVisitService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 陌生拜访Controller
 * 
 * @author swj
 * @date 2022-07-10
 */
@Controller
@RequestMapping("/crm/taskvisit")
public class MyTasksVisitController extends BaseController
{
    private final String prefix = "crm/taskvisit";

    @Autowired
    private IMyTasksVisitService myTasksVisitService;

    @RequiresPermissions("crm:taskvisit:view")
    @GetMapping()
    public String taskvisit()
    {
        return prefix + "/taskvisit";
    }

    /**
     * 查询陌生拜访列表
     */
    @RequiresPermissions("crm:taskvisit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyTasksVisit myTasksVisit)
    {
        startPage();
        List<MyTasksVisit> list = myTasksVisitService.selectMyTasksVisitList(myTasksVisit);
        return getDataTable(list);
    }

    /**
     * 导出陌生拜访列表
     */
    @RequiresPermissions("crm:taskvisit:export")
    @Log(title = "陌生拜访", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MyTasksVisit myTasksVisit)
    {
        List<MyTasksVisit> list = myTasksVisitService.selectMyTasksVisitList(myTasksVisit);
        ExcelUtil<MyTasksVisit> util = new ExcelUtil<MyTasksVisit>(MyTasksVisit.class);
        return util.exportExcel(list, "陌生拜访数据");
    }

    /**
     * 新增陌生拜访
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存陌生拜访
     */
    @RequiresPermissions("crm:taskvisit:add")
    @Log(title = "陌生拜访", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MyTasksVisit myTasksVisit)
    {
        return toAjax(myTasksVisitService.insertMyTasksVisit(myTasksVisit));
    }

    /**
     * 修改陌生拜访
     */
    @RequiresPermissions("crm:taskvisit:edit")
    @GetMapping("/edit/{taskId}")
    public String edit(@PathVariable("taskId") Long taskId, ModelMap mmap)
    {
        MyTasksVisit myTasksVisit = myTasksVisitService.selectMyTasksVisitByTaskId(taskId);
        mmap.put("myTasksVisit", myTasksVisit);
        return prefix + "/edit";
    }

    /**
     * 修改保存陌生拜访
     */
    @RequiresPermissions("crm:taskvisit:edit")
    @Log(title = "陌生拜访", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MyTasksVisit myTasksVisit)
    {
        return toAjax(myTasksVisitService.updateMyTasksVisit(myTasksVisit));
    }

    /**
     * 删除陌生拜访
     */
    @RequiresPermissions("crm:taskvisit:remove")
    @Log(title = "陌生拜访", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(myTasksVisitService.deleteMyTasksVisitByTaskIds(ids));
    }
}
