package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.MyTasks;

/**
* @author gsh
* @description 针对表【crm_my_tasks(我的任务细项表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.MyTasks
*/
public interface MyTasksMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MyTasks record);

    int insertSelective(MyTasks record);

    MyTasks selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MyTasks record);

    int updateByPrimaryKey(MyTasks record);

}
