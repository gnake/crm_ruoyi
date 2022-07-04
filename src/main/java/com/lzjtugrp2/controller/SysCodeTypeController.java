package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SysCodetype;
import com.lzjtugrp2.service.SysCodetypeService;
import com.lzjtugrp2.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SysCodeTypeController {
    @Resource
    private SysCodetypeService sysCodetypeService;

    @GetMapping("/showCodetype")
    public String showCodetype(){
        return "sysCodetype";
    }

    @GetMapping("/editCodetype")
    public String EditCodetype(){
        return "editsysCodetype";
    }

    /*
    添加一条数据
    * */

    @GetMapping("/addCodetype")
    public ResultVO addCodetype(@RequestBody SysCodetype sysCodetype){
        sysCodetypeService.insert(sysCodetype);
        return null;
    }

    /*
    * 删除一项数据*/
    @GetMapping("/delete/{typeid}")
    @ResponseBody
    public String deleteByPrimaryKey(@PathVariable long typeid){
        sysCodetypeService.deleteByPrimaryKey(typeid);
        return "sysCodetype";
    }


    /*
    查询一条数据
    * */
    @GetMapping("/selectByPrimaryKeyCodetype/{typeid}")
    public String selectByPrimaryKey(@PathVariable long typeid){
        SysCodetype sysCodetype = sysCodetypeService.selectByPrimaryKey(typeid);
        sysCodetypeService.selectByPrimaryKey(typeid);
        return "sysCodetype";
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




}
