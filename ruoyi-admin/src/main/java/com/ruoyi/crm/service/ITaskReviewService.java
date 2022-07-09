package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.TaskReview;

/**
 * 工作总结Service接口
 * 
 * @author swj
 * @date 2022-07-08
 */
public interface ITaskReviewService 
{
    /**
     * 查询工作总结
     * 
     * @param taskReviewId 工作总结主键
     * @return 工作总结
     */
        TaskReview selectTaskReviewByTaskReviewId(Long taskReviewId);

    /**
     * 查询工作总结列表
     * 
     * @param taskReview 工作总结
     * @return 工作总结集合
     */
    List<TaskReview> selectTaskReviewList(TaskReview taskReview);

    /**
     * 新增工作总结
     * 
     * @param taskReview 工作总结
     * @return 结果
     */
    int insertTaskReview(TaskReview taskReview);

    /**
     * 修改工作总结
     * 
     * @param taskReview 工作总结
     * @return 结果
     */
    int updateTaskReview(TaskReview taskReview);

    /**
     * 批量删除工作总结
     * 
     * @param taskReviewIds 需要删除的工作总结主键集合
     * @return 结果
     */
    int deleteTaskReviewByTaskReviewIds(String taskReviewIds);

    /**
     * 删除工作总结信息
     * 
     * @param taskReviewId 工作总结主键
     * @return 结果
     */
    int deleteTaskReviewByTaskReviewId(Long taskReviewId);
}
