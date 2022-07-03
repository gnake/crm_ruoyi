package com.lzjtugrp2.service;

import com.lzjtugrp2.domain.TaskCycle;

public interface TaskCycleService {
    int deleteByPrimaryKey(Long id);

    int insert(TaskCycle record);

    int insertSelective(TaskCycle record);

    TaskCycle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskCycle record);

    int updateByPrimaryKey(TaskCycle record);
}
