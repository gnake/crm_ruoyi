package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SysCodelist;
import com.lzjtugrp2.domain.dto.SysCodeListDTO;
import com.lzjtugrp2.service.SysCodeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SysCodeListController {
    @Autowired
    private SysCodeListService sysCodeManagerService;

    @GetMapping("/codelist")
    public String codelist() {
        return "syscodelist";
    }

    @GetMapping("/toinsertcodelist")
    public String toInsertCodeList() {
        return "insertsyscodelist";
    }

    @GetMapping("/toinsertcodelistView")
    public String toupdateCodeListView() {
        return "updatesyscodelist";
    }

    @GetMapping("/toupdatecodelist")
    public String toupdateCodeList(Model model, Long codeId) {
        SysCodelist codelist = sysCodeManagerService.selectById(codeId);
        model.addAttribute("codelist", codelist);
        return "updatesyscodelist";
    }

    /**
     * 分页查询所有数据
     *
     * @return PageInfo 所有页面
     */
    @GetMapping("/selectAll")
    public String selectAll(Model model) {
        List<SysCodeListDTO> sysCodelists = sysCodeManagerService.selectAll();
        model.addAttribute("list", sysCodelists);
        return "syscodelist";
    }

    @GetMapping("/delete/{codeid}")
    public String deleteByPrimaryKey(@PathVariable long codeid) {
        sysCodeManagerService.deleteByPrimaryKey(codeid);
        return "redirect:/selectAll";
    }

    /**
     * 新增数据
     *
     * @param sysCodelist 实体对象
     * @return 新增结果
     */
    @PostMapping("/insertCodelist")
    public String insert(SysCodelist sysCodelist) {
        sysCodeManagerService.insert(sysCodelist);
        return "redirect:/selectAll";
    }

    @PostMapping("/updatecodelistById")
    public String update(SysCodelist sysCodelist) {
        sysCodeManagerService.updateByPrimaryKeySelective(sysCodelist);
        return "redirect:/selectAll";
    }
}
