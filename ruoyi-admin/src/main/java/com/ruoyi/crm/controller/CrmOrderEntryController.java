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
import com.ruoyi.crm.domain.CrmOrderEntry;
import com.ruoyi.crm.service.ICrmOrderEntryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工作总结Controller
 * 
 * @author 高国文
 * @date 2022-07-08
 */
@Controller
@RequestMapping("/crm/ENTRY")
public class CrmOrderEntryController extends BaseController
{
    private final String prefix = "crm/ENTRY";

    @Autowired
    private ICrmOrderEntryService crmOrderEntryService;

    @RequiresPermissions("crm:ENTRY:view")
    @GetMapping()
    public String ENTRY()
    {
        return prefix + "/ENTRY";
    }

    /**
     * 查询工作总结列表
     */
    @RequiresPermissions("crm:ENTRY:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CrmOrderEntry crmOrderEntry)
    {
        startPage();
        List<CrmOrderEntry> list = crmOrderEntryService.selectCrmOrderEntryList(crmOrderEntry);
        return getDataTable(list);
    }

    /**
     * 导出工作总结列表
     */
    @RequiresPermissions("crm:ENTRY:export")
    @Log(title = "工作总结", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CrmOrderEntry crmOrderEntry)
    {
        List<CrmOrderEntry> list = crmOrderEntryService.selectCrmOrderEntryList(crmOrderEntry);
        ExcelUtil<CrmOrderEntry> util = new ExcelUtil<CrmOrderEntry>(CrmOrderEntry.class);
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
    @RequiresPermissions("crm:ENTRY:add")
    @Log(title = "工作总结", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CrmOrderEntry crmOrderEntry)
    {
        return toAjax(crmOrderEntryService.insertCrmOrderEntry(crmOrderEntry));
    }

    /**
     * 修改工作总结
     */
    @RequiresPermissions("crm:ENTRY:edit")
    @GetMapping("/edit/{entryId}")
    public String edit(@PathVariable("entryId") Long entryId, ModelMap mmap)
    {
        CrmOrderEntry crmOrderEntry = crmOrderEntryService.selectCrmOrderEntryByEntryId(entryId);
        mmap.put("crmOrderEntry", crmOrderEntry);
        return prefix + "/edit";
    }

    /**
     * 修改保存工作总结
     */
    @RequiresPermissions("crm:ENTRY:edit")
    @Log(title = "工作总结", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CrmOrderEntry crmOrderEntry)
    {
        return toAjax(crmOrderEntryService.updateCrmOrderEntry(crmOrderEntry));
    }

    /**
     * 删除工作总结
     */
    @RequiresPermissions("crm:ENTRY:remove")
    @Log(title = "工作总结", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(crmOrderEntryService.deleteCrmOrderEntryByEntryIds(ids));
    }
}
