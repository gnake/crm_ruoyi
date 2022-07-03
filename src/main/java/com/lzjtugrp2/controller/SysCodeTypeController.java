package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SysCodetype;
import com.lzjtugrp2.service.SysCodetypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class SysCodeTypeController {
    @Resource
    private SysCodetypeService sysCodetypeService;

    @GetMapping("/showCodetype")
    public String showCodetype(){
        return "sysCodetype";
    }

    @GetMapping("/selectByPrimaryKey")
    public String selectByPrimaryKey(Long id){
        SysCodetype sysCodetype = sysCodetypeService.selectByPrimaryKey(id);
        return "sysCodeType";
    }






}
