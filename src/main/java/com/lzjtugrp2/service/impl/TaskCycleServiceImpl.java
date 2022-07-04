package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.TaskCycle;
import com.lzjtugrp2.mapper.TaskCycleMapper;
import com.lzjtugrp2.service.TaskCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional

public class TaskCycleServiceImpl implements TaskCycleService {
    @Autowired
    private TaskCycleMapper taskcycleMapper;

    @Override
    public List<TaskCycle> getAllTask() {
        return taskcycleMapper.getAllTask();
    }
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }
    @Override
    public int insert(TaskCycle record) {
        return 0;
    }
    @Override
    public int insertSelective(TaskCycle record) {
        return 0;
    }
    @Override
    public TaskCycle selectByPrimaryKey(Long id) {
        return null;
    }
    @Override
    public int updateByPrimaryKeySelective(TaskCycle record) {
        return 0;
    }
    @Override
    public int updateByPrimaryKey(TaskCycle record) {
        return 0;
    }
}
