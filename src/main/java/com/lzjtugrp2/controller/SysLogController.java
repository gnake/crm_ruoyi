package com.lzjtugrp2.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzjtugrp2.domain.SysLog;
import com.lzjtugrp2.domain.dto.SysLogDTO;
import com.lzjtugrp2.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;
    @GetMapping("/syslog")
    public String show(Model model) {
        List<SysLogDTO> sysLogDTOS = sysLogService.selectAllSysLogDTO();
        model.addAttribute("sysLogDTOS",sysLogDTOS);
        return "sysLogPage";
    }
    //分页查询
    @GetMapping("/selectPageSysLog")
    public PageInfo<SysLogDTO> selectPageSysLog(Model model, int pageNum, int pageSize) {
        //pageNum当前页；pageSize每页显示的数据数目
        PageHelper.startPage(pageNum,pageSize);
        List<SysLogDTO> sysLogDTOS = sysLogService.selectAllSysLogDTO();
        System.out.println("sysLogDTOS = " + sysLogDTOS);
        //获得分页后的数据信息
        return new PageInfo<>(sysLogDTOS);
    }
    //根据输入进行多条件查询
    @GetMapping("/getSysLogsByMultipleConditions")
    public String getSysLogsByMultipleConditions(SysLog sysLog, Model model) {
//        Date endOperTime = sysLog.getOperTime();
        List<SysLogDTO> sysLogDTOS = sysLogService.getSysLogsByMultipleConditions(sysLog);
        model.addAttribute("sysLogDTOS",sysLogDTOS);
        return "sysLogPage";
    }
    //查看日志的明细信息
    @GetMapping("/selectByPrimaryKey")
    public String selectByPrimaryKey(Long id, Model model) {
        SysLogDTO sysLogDTO = sysLogService.selectByPrimaryKey(id);
        System.out.println("sysLogDTO = " + sysLogDTO);
        model.addAttribute("sysLogDTO",sysLogDTO);
        return "sysLogPage";
    }
}