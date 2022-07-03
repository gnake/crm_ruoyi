package com.lzjtugrp2.service.impl;

import cn.hutool.db.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
    public List<SysLog> selectAllSysLoGPageQuery() {
        return sysLogMapper.selectAllSysLoG();
    }
    //执行分页查询
    public PageResult<SysLog> selectAllSysLog(Integer page, Integer rows) {
        Page ps = PageHelper.startPage(page,rows);

        List<SysLog> list = sysLogMapper.selectAllSysLoG();
        System.out.println("list = " + list);
        PageResult<SysLog> result = new PageResult<SysLog>();

        return result;
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
