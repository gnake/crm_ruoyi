package com.lzjtugrp2.service;

import com.lzjtugrp2.domain.SysLog;

import java.util.Date;
import java.util.List;

public interface SysLogService {
    List<SysLog> selectPageSysLog();

    SysLog selectByPrimaryKey(Long id);

    List<SysLog> getSysLogsByMultipleConditions(Date startOperTime, Date endOperTime, String ipAddtress, Long userId, String funcName, String actionType);
}
