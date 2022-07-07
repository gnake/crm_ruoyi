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
import com.ruoyi.crm.domain.CrmTaskReviewStrangeVisit;
import com.ruoyi.crm.service.ICrmTaskReviewStrangeVisitService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 陌生拜访Controller
 * 
 * @author ggw
 * @date 2022-07-07
 */
@Controller
@RequestMapping("/strangevisit/strangevisit")
public class CrmTaskReviewStrangeVisitController extends BaseController
{
    private final String prefix = "strangevisit/strangevisit";

    @Autowired
    private ICrmTaskReviewStrangeVisitService crmTaskReviewStrangeVisitService;

    @RequiresPermissions("strangevisit:strangevisit:view")
    @GetMapping()
    public String strangevisit()
    {
        return prefix + "/strangevisit";
    }

    /**
     * 查询陌生拜访列表
     */
    @RequiresPermissions("strangevisit:strangevisit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit)
    {
        startPage();
        List<CrmTaskReviewStrangeVisit> list = crmTaskReviewStrangeVisitService.selectCrmTaskReviewStrangeVisitList(crmTaskReviewStrangeVisit);
        return getDataTable(list);
    }

    /**
     * 导出陌生拜访列表
     */
    @RequiresPermissions("strangevisit:strangevisit:export")
    @Log(title = "陌生拜访", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit)
    {
        List<CrmTaskReviewStrangeVisit> list = crmTaskReviewStrangeVisitService.selectCrmTaskReviewStrangeVisitList(crmTaskReviewStrangeVisit);
        ExcelUtil<CrmTaskReviewStrangeVisit> util = new ExcelUtil<CrmTaskReviewStrangeVisit>(CrmTaskReviewStrangeVisit.class);
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
    @RequiresPermissions("strangevisit:strangevisit:add")
    @Log(title = "陌生拜访", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit)
    {
        return toAjax(crmTaskReviewStrangeVisitService.insertCrmTaskReviewStrangeVisit(crmTaskReviewStrangeVisit));
    }

    /**
     * 修改陌生拜访
     */
    @RequiresPermissions("strangevisit:strangevisit:edit")
    @GetMapping("/edit/{orgId}")
    public String edit(@PathVariable("orgId") Long orgId, ModelMap mmap)
    {
        CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit = crmTaskReviewStrangeVisitService.selectCrmTaskReviewStrangeVisitByOrgId(orgId);
        mmap.put("crmTaskReviewStrangeVisit", crmTaskReviewStrangeVisit);
        return prefix + "/edit";
    }

    /**
     * 修改保存陌生拜访
     */
    @RequiresPermissions("strangevisit:strangevisit:edit")
    @Log(title = "陌生拜访", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit)
    {
        return toAjax(crmTaskReviewStrangeVisitService.updateCrmTaskReviewStrangeVisit(crmTaskReviewStrangeVisit));
    }

    /**
     * 删除陌生拜访
     */
    @RequiresPermissions("strangevisit:strangevisit:remove")
    @Log(title = "陌生拜访", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(crmTaskReviewStrangeVisitService.deleteCrmTaskReviewStrangeVisitByOrgIds(ids));
    }
}
