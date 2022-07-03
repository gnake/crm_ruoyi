package com.lzjtugrp2.controller;

import com.lzjtugrp2.service.SysCodetypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("code")
public class SysCodeTypeController {
    @Resource
    private SysCodetypeService sysCodetypeService;

    @RequestMapping("toCodetypeListView")
    public String toCodetypeListView(){
        return "codeList";
    }

}
