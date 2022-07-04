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
    public PageInfo<SysLog> selectPageSysLog(Model model, int pageNum, int pageSize) {
        //pageNum当前页；pageSize每页显示的数据数目
        PageHelper.startPage(pageNum,pageSize);
        List<SysLog> sysLogs = sysLogService.selectPageSysLog();
        System.out.println("sysLogs = " + sysLogs);
        //获得分页后的数据信息
        return new PageInfo<>(sysLogs);
    }
//    //根据输入进行多条件查询
//    @GetMapping("/getSysLogsByMultipleConditions")
//    @ResponseBody
//    public List<SysLog> getSysLogsByMultipleConditions(SysLog sysLog, Date startOperTime) {
//        Date endOperTime = sysLog.getOperTime();
//        String ipAddtress = sysLog.getIpAddtress();
//        Long userId = sysLog.getUserId();
//        String funcName = sysLog.getFuncName();
//        String actionType = sysLog.getActionType();
//        return sysLogService.getSysLogsByMultipleConditions(startOperTime,endOperTime,ipAddtress,userId,funcName,actionType);
//    }
    //查看日志的明细信息
    @GetMapping("/selectByPrimaryKey")
    public String selectByPrimaryKey(Long id) {
        SysLog sysLog = sysLogService.selectByPrimaryKey(id);
        return "sysLogPage";
    }
}