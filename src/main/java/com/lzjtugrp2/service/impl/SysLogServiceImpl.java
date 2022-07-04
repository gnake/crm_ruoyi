package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.SecurityUser;
import com.lzjtugrp2.domain.SysLog;
import com.lzjtugrp2.domain.dto.SysLogDTO;
import com.lzjtugrp2.mapper.SecurityUserMapper;
import com.lzjtugrp2.mapper.SysLogMapper;
import com.lzjtugrp2.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Autowired
    private SecurityUserMapper securityUserMapper;

    @Override
    public List<SysLog> selectPageSysLog() {
        return sysLogMapper.selectAllSysLog();
    }

    @Override
    public SysLog selectByPrimaryKey(Long id) {
        return sysLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysLog> getSysLogsByMultipleConditions(Date startOperTime, Date endOperTime, String ipAddtress, Long userId, String funcName, String actionType) {
        return sysLogMapper.getSysLogsByMultipleConditions(startOperTime,endOperTime,ipAddtress,userId,funcName,actionType);
    }

    @Override
    public List<SysLogDTO> selectAllSysLogDTO() {
        ArrayList<SysLogDTO> sysLogDTOS = new ArrayList<>();
        ArrayList<SysLog> sysLogs = sysLogMapper.selectAllSysLog();
        for (SysLog item : sysLogs) {
            SecurityUser securityUser = securityUserMapper.selectByPrimaryKey(item.getUserId());
            String userCode = securityUser.getUserCode();
            SysLogDTO sysLogDTO = new SysLogDTO();
            sysLogDTO.setSysId(item.getSysId());
            sysLogDTO.setOperTime(item.getOperTime());
            sysLogDTO.setIpAddtress(item.getIpAddtress());
            sysLogDTO.setUserName(item.getUserName());
            sysLogDTO.setUserCode(userCode);
            sysLogDTO.setFuncName(item.getFuncName());
            sysLogDTO.setActionType(item.getActionType());
            sysLogDTOS.add(sysLogDTO);
        }
        return sysLogDTOS;
    }
}
