package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.SysLog;
import com.lzjtugrp2.domain.dto.SysLogDTO;
import com.lzjtugrp2.mapper.SecurityUserMapper;
import com.lzjtugrp2.mapper.SysLogMapper;
import com.lzjtugrp2.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public SysLogDTO selectByPrimaryKey(Long id) {
        SysLog sysLog =  sysLogMapper.selectByPrimaryKey(id);
        SysLogDTO sysLogDTO = new SysLogDTO();
        String userCode = securityUserMapper.selectByPrimaryKey(sysLog.getUserId()).getUserCode();
        sysLogDTO.setSysId(sysLog.getSysId());
        sysLogDTO.setOperTime(sysLog.getOperTime());
        sysLogDTO.setIpAddtress(sysLog.getIpAddtress());
        sysLogDTO.setUserName(sysLog.getUserName());
        sysLogDTO.setUserCode(userCode);
        sysLogDTO.setFuncName(sysLog.getFuncName());
        sysLogDTO.setActionType(sysLog.getActionType());
        return sysLogDTO;
    }

    @Override
    public List<SysLogDTO> getSysLogsByMultipleConditions(SysLog sysLog) {
        ArrayList<SysLogDTO> sysLogDTOS = new ArrayList<>();
        ArrayList<SysLog> sysLogs = sysLogMapper.getSysLogsByMultipleConditions(sysLog);
        for (SysLog item : sysLogs) {
            String userCode = securityUserMapper.selectByPrimaryKey(item.getUserId()).getUserCode();
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

    @Override
    public List<SysLogDTO> selectAllSysLogDTO() {
        ArrayList<SysLogDTO> sysLogDTOS = new ArrayList<>();
        ArrayList<SysLog> sysLogs = sysLogMapper.selectAllSysLog();
        for (SysLog item : sysLogs) {
            String userCode = securityUserMapper.selectByPrimaryKey(item.getUserId()).getUserCode();
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

    @Override
    public void insertSysLog(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }

    @Override
    public void updateSysLog(SysLog sysLog) {
        sysLogMapper.updateByPrimaryKeySelective(sysLog);
    }

    @Override
    public void deleteBySysId(long sysId) {
        sysLogMapper.deleteByPrimaryKey(sysId);
    }
}
