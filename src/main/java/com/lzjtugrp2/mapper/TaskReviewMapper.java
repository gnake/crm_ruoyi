package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.TaskReview;

/**
* @author gsh
* @description 针对表【crm_task_review(任务计划&总结表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.TaskReview
*/
public interface TaskReviewMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TaskReview record);

    int insertSelective(TaskReview record);

    TaskReview selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskReview record);

    int updateByPrimaryKey(TaskReview record);

}
