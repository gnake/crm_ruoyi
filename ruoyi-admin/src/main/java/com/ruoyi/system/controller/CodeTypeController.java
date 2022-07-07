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
import com.ruoyi.system.domain.CodeType;
import com.ruoyi.system.service.ICodeTypeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 编码类型Controller
 * 
 * @author ruoyi
 * @date 2022-07-07
 */
@Controller
@RequestMapping("/system/codetype")
public class CodeTypeController extends BaseController
{
    private final String prefix = "system/codetype";

    @Autowired
    private ICodeTypeService codeTypeService;

    @RequiresPermissions("system:codetype:view")
    @GetMapping()
    public String codetype()
    {
        return prefix + "/codetype";
    }

    /**
     * 查询编码类型列表
     */
    @RequiresPermissions("system:codetype:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CodeType codeType)
    {
        startPage();
        List<CodeType> list = codeTypeService.selectCodeTypeList(codeType);
        return getDataTable(list);
    }

    /**
     * 导出编码类型列表
     */
    @RequiresPermissions("system:codetype:export")
    @Log(title = "编码类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CodeType codeType)
    {
        List<CodeType> list = codeTypeService.selectCodeTypeList(codeType);
        ExcelUtil<CodeType> util = new ExcelUtil<CodeType>(CodeType.class);
        return util.exportExcel(list, "编码类型数据");
    }

    /**
     * 新增编码类型
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存编码类型
     */
    @RequiresPermissions("system:codetype:add")
    @Log(title = "编码类型", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CodeType codeType)
    {
        return toAjax(codeTypeService.insertCodeType(codeType));
    }

    /**
     * 修改编码类型
     */
    @RequiresPermissions("system:codetype:edit")
    @GetMapping("/edit/{typeId}")
    public String edit(@PathVariable("typeId") Long typeId, ModelMap mmap)
    {
        CodeType codeType = codeTypeService.selectCodeTypeByTypeId(typeId);
        mmap.put("codeType", codeType);
        return prefix + "/edit";
    }

    /**
     * 修改保存编码类型
     */
    @RequiresPermissions("system:codetype:edit")
    @Log(title = "编码类型", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CodeType codeType)
    {
        return toAjax(codeTypeService.updateCodeType(codeType));
    }

    /**
     * 删除编码类型
     */
    @RequiresPermissions("system:codetype:remove")
    @Log(title = "编码类型", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(codeTypeService.deleteCodeTypeByTypeIds(ids));
    }
}
