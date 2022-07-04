package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.SysLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* @author gsh
* @description 针对表【crm_sys_log(系统日志表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.SysLog
*/
@Mapper
public interface SysLogMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);

    List<SysLog> getSysLogsByMultipleConditions(Date startOperTime, Date endOperTime, String ipAddtress, Long userId, String funcName, String actionType);

    ArrayList<SysLog> selectAllSysLog();
}
