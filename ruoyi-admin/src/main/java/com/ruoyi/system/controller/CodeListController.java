package com.ruoyi.system.controller;

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
import com.ruoyi.system.domain.CodeList;
import com.ruoyi.system.service.ICodeListService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 编码管理Controller
 * 
 * @author gsh
 * @date 2022-07-07
 */
@Controller
@RequestMapping("/system/codelist")
public class CodeListController extends BaseController
{
    private final String prefix = "system/codelist";

    @Autowired
    private ICodeListService codeListService;

    @RequiresPermissions("system:codelist:view")
    @GetMapping()
    public String codelist()
    {
        return prefix + "/codelist";
    }

    /**
     * 查询编码管理列表
     */
    @RequiresPermissions("system:codelist:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CodeList codeList)
    {
        startPage();
        List<CodeList> list = codeListService.selectCodeListList(codeList);
        return getDataTable(list);
    }

    /**
     * 导出编码管理列表
     */
    @RequiresPermissions("system:codelist:export")
    @Log(title = "编码管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CodeList codeList)
    {
        List<CodeList> list = codeListService.selectCodeListList(codeList);
        ExcelUtil<CodeList> util = new ExcelUtil<CodeList>(CodeList.class);
        return util.exportExcel(list, "编码管理数据");
    }

    /**
     * 新增编码管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存编码管理
     */
    @RequiresPermissions("system:codelist:add")
    @Log(title = "编码管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CodeList codeList)
    {
        return toAjax(codeListService.insertCodeList(codeList));
    }

    /**
     * 修改编码管理
     */
    @RequiresPermissions("system:codelist:edit")
    @GetMapping("/edit/{codeId}")
    public String edit(@PathVariable("codeId") Long codeId, ModelMap mmap)
    {
        CodeList codeList = codeListService.selectCodeListByCodeId(codeId);
        mmap.put("codeList", codeList);
        return prefix + "/edit";
    }

    /**
     * 修改保存编码管理
     */
    @RequiresPermissions("system:codelist:edit")
    @Log(title = "编码管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CodeList codeList)
    {
        return toAjax(codeListService.updateCodeList(codeList));
    }

    /**
     * 删除编码管理
     */
    @RequiresPermissions("system:codelist:remove")
    @Log(title = "编码管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(codeListService.deleteCodeListByCodeIds(ids));
    }
}
