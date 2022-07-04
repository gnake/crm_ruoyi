package com.lzjtugrp2.service;

import com.lzjtugrp2.domain.SysLog;
import com.lzjtugrp2.domain.dto.SysLogDTO;

import java.util.List;

public interface SysLogService {
    List<SysLog> selectPageSysLog();

    SysLogDTO selectByPrimaryKey(Long id);

    List<SysLogDTO> getSysLogsByMultipleConditions(SysLog sysLog);

    List<SysLogDTO> selectAllSysLogDTO();
}
