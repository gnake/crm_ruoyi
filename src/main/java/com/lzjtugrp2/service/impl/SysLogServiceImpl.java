package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.SysLog;
import com.lzjtugrp2.mapper.SysLogMapper;
import com.lzjtugrp2.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public List<SysLog> selectPageSysLog() {
        return sysLogMapper.selectPageSysLog();
    }

    @Override
    public SysLog selectByPrimaryKey(Long id) {
        return sysLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysLog> getSysLogsByMultipleConditions(Date startOperTime, Date endOperTime, String ipAddtress, Long userId, String funcName, String actionType) {
        return sysLogMapper.getSysLogsByMultipleConditions(startOperTime,endOperTime,ipAddtress,userId,funcName,actionType);
    }
}
