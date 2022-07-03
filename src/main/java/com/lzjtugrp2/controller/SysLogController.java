package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SysLog;
import com.lzjtugrp2.service.SysLogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class SysLogController {
    private SysLogService sysLogService;
    @GetMapping("/showLog")
    public String show(Model model) {
        return "sysLogPage";
    }
    //查出日志信息
    @GetMapping("/examineSysLogs")
    public String examineSysLogs(Model model) {
        List<SysLog> sysLogs = sysLogService.examineSysLogs();
        System.out.println("sysLogs = " + sysLogs);
        model.addAttribute("sysLogs",sysLogs);
        return "sysLogPage";
    }
    //根据输入进行多条件查询
    @GetMapping("/getSysLogsByMultipleConditions")
    @ResponseBody
    public List<SysLog> getSysLogsByMultipleConditions(SysLog sysLog, Date startOperTime) {
        Date endOperTime = sysLog.getOperTime();
        String ipAddtress = sysLog.getIpAddtress();
        Long userId = sysLog.getUserId();
        String funcName = sysLog.getFuncName();
        String actionType = sysLog.getActionType();
        return sysLogService.getSysLogsByMultipleConditions(startOperTime,endOperTime,ipAddtress,userId,funcName,actionType);
    }
    //查看日志的明细信息
    @GetMapping("/selectByPrimaryKey")
    public String selectByPrimaryKey(Long id) {
        SysLog sysLog = sysLogService.selectByPrimaryKey(id);
        return "sysLogPage";
    }
}