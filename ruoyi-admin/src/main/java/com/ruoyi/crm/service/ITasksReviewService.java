package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.TasksReview;

/**
 * 工作总结Service接口
 * 
 * @author swj
 * @date 2022-07-10
 */
public interface ITasksReviewService 
{
    /**
     * 查询工作总结
     * 
     * @param taskReviewId 工作总结主键
     * @return 工作总结
     */
        TasksReview selectTasksReviewByTaskReviewId(Long taskReviewId);

    /**
     * 查询工作总结列表
     * 
     * @param tasksReview 工作总结
     * @return 工作总结集合
     */
    List<TasksReview> selectTasksReviewList(TasksReview tasksReview);

    /**
     * 新增工作总结
     * 
     * @param tasksReview 工作总结
     * @return 结果
     */
    int insertTasksReview(TasksReview tasksReview);

    /**
     * 修改工作总结
     * 
     * @param tasksReview 工作总结
     * @return 结果
     */
    int updateTasksReview(TasksReview tasksReview);

    /**
     * 批量删除工作总结
     * 
     * @param taskReviewIds 需要删除的工作总结主键集合
     * @return 结果
     */
    int deleteTasksReviewByTaskReviewIds(String taskReviewIds);

    /**
     * 删除工作总结信息
     * 
     * @param taskReviewId 工作总结主键
     * @return 结果
     */
    int deleteTasksReviewByTaskReviewId(Long taskReviewId);
}
