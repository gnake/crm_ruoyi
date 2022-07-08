package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.TaskReview;
import com.ruoyi.crm.domain.TaskCycle;

/**
 * 工作总结Mapper接口
 * 
 * @author swj
 * @date 2022-07-08
 */
public interface TaskReviewMapper 
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
     * 删除工作总结
     * 
     * @param taskReviewId 工作总结主键
     * @return 结果
     */
    int deleteTaskReviewByTaskReviewId(Long taskReviewId);

    /**
     * 批量删除工作总结
     * 
     * @param taskReviewIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteTaskReviewByTaskReviewIds(String[] taskReviewIds);

    /**
     * 批量删除任务周期
     * 
     * @param taskReviewIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteTaskCycleByTcIds(String[] taskReviewIds);
    
    /**
     * 批量新增任务周期
     * 
     * @param taskCycleList 任务周期列表
     * @return 结果
     */
    int batchTaskCycle(List<TaskCycle> taskCycleList);
    

    /**
     * 通过工作总结主键删除任务周期信息
     * 
     * @param taskReviewId 工作总结ID
     * @return 结果
     */
    int deleteTaskCycleByTcId(Long taskReviewId);
}
