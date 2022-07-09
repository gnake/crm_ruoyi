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
import com.ruoyi.crm.domain.CrmTaskReviewStrange;
import com.ruoyi.crm.service.ICrmTaskReviewStrangeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 陌生拜访Controller
 * 
 * @author 高国文
 * @date 2022-07-08
 */
@Controller
@RequestMapping("/crm/orgstrangevisit")
public class CrmTaskReviewStrangeController extends BaseController
{
    private final String prefix = "crm/orgstrangevisit";

    @Autowired
    private ICrmTaskReviewStrangeService crmTaskReviewStrangeService;

    @RequiresPermissions("crm:orgstrangevisit:view")
    @GetMapping()
    public String orgstrangevisit()
    {
        return prefix + "/orgstrangevisit";
    }

    /**
     * 查询陌生拜访列表
     */
    @RequiresPermissions("crm:orgstrangevisit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CrmTaskReviewStrange crmTaskReviewStrange)
    {
        startPage();
        List<CrmTaskReviewStrange> list = crmTaskReviewStrangeService.selectCrmTaskReviewStrangeList(crmTaskReviewStrange);
        return getDataTable(list);
    }

    /**
     * 导出陌生拜访列表
     */
    @RequiresPermissions("crm:orgstrangevisit:export")
    @Log(title = "陌生拜访", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CrmTaskReviewStrange crmTaskReviewStrange)
    {
        List<CrmTaskReviewStrange> list = crmTaskReviewStrangeService.selectCrmTaskReviewStrangeList(crmTaskReviewStrange);
        ExcelUtil<CrmTaskReviewStrange> util = new ExcelUtil<CrmTaskReviewStrange>(CrmTaskReviewStrange.class);
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
    @RequiresPermissions("crm:orgstrangevisit:add")
    @Log(title = "陌生拜访", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CrmTaskReviewStrange crmTaskReviewStrange)
    {
        return toAjax(crmTaskReviewStrangeService.insertCrmTaskReviewStrange(crmTaskReviewStrange));
    }

    /**
     * 修改陌生拜访
     */
    @RequiresPermissions("crm:orgstrangevisit:edit")
    @GetMapping("/edit/{orgId}")
    public String edit(@PathVariable("orgId") Long orgId, ModelMap mmap)
    {
        CrmTaskReviewStrange crmTaskReviewStrange = crmTaskReviewStrangeService.selectCrmTaskReviewStrangeByOrgId(orgId);
        mmap.put("crmTaskReviewStrange", crmTaskReviewStrange);
        return prefix + "/edit";
    }

    /**
     * 修改保存陌生拜访
     */
    @RequiresPermissions("crm:orgstrangevisit:edit")
    @Log(title = "陌生拜访", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CrmTaskReviewStrange crmTaskReviewStrange)
    {
        return toAjax(crmTaskReviewStrangeService.updateCrmTaskReviewStrange(crmTaskReviewStrange));
    }

    /**
     * 删除陌生拜访
     */
    @RequiresPermissions("crm:orgstrangevisit:remove")
    @Log(title = "陌生拜访", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(crmTaskReviewStrangeService.deleteCrmTaskReviewStrangeByOrgIds(ids));
    }
}
