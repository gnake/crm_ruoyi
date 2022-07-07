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
import com.ruoyi.crm.domain.CrmTaskReviewIntention;
import com.ruoyi.crm.service.ICrmTaskReviewIntentionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 意向跟进Controller
 * 
 * @author ggw
 * @date 2022-07-07
 */
@Controller
@RequestMapping("/crm/intention")
public class CrmTaskReviewIntentionController extends BaseController
{
    private final String prefix = "crm/intention";

    @Autowired
    private ICrmTaskReviewIntentionService crmTaskReviewIntentionService;

    @RequiresPermissions("crm:intention:view")
    @GetMapping()
    public String intention()
    {
        return prefix + "/intention";
    }

    /**
     * 查询意向跟进列表
     */
    @RequiresPermissions("crm:intention:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CrmTaskReviewIntention crmTaskReviewIntention)
    {
        startPage();
        List<CrmTaskReviewIntention> list = crmTaskReviewIntentionService.selectCrmTaskReviewIntentionList(crmTaskReviewIntention);
        return getDataTable(list);
    }

    /**
     * 导出意向跟进列表
     */
    @RequiresPermissions("crm:intention:export")
    @Log(title = "意向跟进", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CrmTaskReviewIntention crmTaskReviewIntention)
    {
        List<CrmTaskReviewIntention> list = crmTaskReviewIntentionService.selectCrmTaskReviewIntentionList(crmTaskReviewIntention);
        ExcelUtil<CrmTaskReviewIntention> util = new ExcelUtil<CrmTaskReviewIntention>(CrmTaskReviewIntention.class);
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
    @RequiresPermissions("crm:intention:add")
    @Log(title = "意向跟进", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CrmTaskReviewIntention crmTaskReviewIntention)
    {
        return toAjax(crmTaskReviewIntentionService.insertCrmTaskReviewIntention(crmTaskReviewIntention));
    }

    /**
     * 修改意向跟进
     */
    @RequiresPermissions("crm:intention:edit")
    @GetMapping("/edit/{custId}")
    public String edit(@PathVariable("custId") Long custId, ModelMap mmap)
    {
        CrmTaskReviewIntention crmTaskReviewIntention = crmTaskReviewIntentionService.selectCrmTaskReviewIntentionByCustId(custId);
        mmap.put("crmTaskReviewIntention", crmTaskReviewIntention);
        return prefix + "/edit";
    }

    /**
     * 修改保存意向跟进
     */
    @RequiresPermissions("crm:intention:edit")
    @Log(title = "意向跟进", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CrmTaskReviewIntention crmTaskReviewIntention)
    {
        return toAjax(crmTaskReviewIntentionService.updateCrmTaskReviewIntention(crmTaskReviewIntention));
    }

    /**
     * 删除意向跟进
     */
    @RequiresPermissions("crm:intention:remove")
    @Log(title = "意向跟进", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(crmTaskReviewIntentionService.deleteCrmTaskReviewIntentionByCustIds(ids));
    }
}
