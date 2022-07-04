package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SysCodetype;
import com.lzjtugrp2.service.SysCodetypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SysCodeTypeController {
    @Autowired
    private SysCodetypeService sysCodetypeService;

    @GetMapping("/codetype")
    public String codetype(){
        return "sysCodetype";
    }

    /*
    添加一条数据
    * */

    @GetMapping("/toaddCodetype")
    public String toaddCodetype(){
        return "addsysCodetype";
    }

    @GetMapping("/toupdatecodetype")
    public String toupdatecodetype(Model model,Long typeId){
        SysCodetype codetype = sysCodetypeService.selectById(typeId);
        model.addAttribute("codetype",codetype);
        return "updatesyscodetype";
    }
    /*
    * 删除一项数据*/
    @GetMapping("/delete/{typeid}")
    public String deleteByPrimaryKey(@PathVariable long typeid){
        sysCodetypeService.deleteByPrimaryKey(typeid);
        return "redirect:/selectAllCodetype";
    }



    /**
     * 分页查询所有数据
     *
     * @return PageInfo 所有页面
     */
    @GetMapping("/selectAllCodetype")
    public String selectAll(Model model) {
        List<SysCodetype> sysCodetypes = sysCodetypeService.selectAll();
        model.addAttribute("list", sysCodetypes);
        return "sysCodetype";
    }


    /*
    * 添加数据
    * */
    @PostMapping("/addCodetype")
    public String addCodetype(SysCodetype sysCodetype){
        sysCodetypeService.insert(sysCodetype);
        return "redirect:/selectAllCodetype";
    }

    /*
    * 更新数据
    * */
    @PostMapping("/updatecodetypeById")
    public String updateCodetype(SysCodetype sysCodetype){
        sysCodetypeService.updateByPrimaryKeySelective(sysCodetype);
        return "redirect:/selectAllCodetype";
    }

}
