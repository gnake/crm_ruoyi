package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.TaskCycle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author gsh
* @description 针对表【crm_task_cycle(任务周期定义表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.TaskCycle
*/
@Mapper
public interface TaskCycleMapper {

    List<TaskCycle> getAllTask();

    int deleteByPrimaryKey(Long id);

    int insert(TaskCycle record);

    int insertSelective(TaskCycle record);

    TaskCycle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskCycle record);

    int updateByPrimaryKey(TaskCycle record);

}
