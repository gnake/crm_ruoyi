package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.MyTaskReview;
import com.ruoyi.crm.domain.TaskReview;

/**
 * 工作总结Mapper接口
 * 
 * @author swj
 * @date 2022-07-10
 */
public interface MyTaskReviewMapper 
{
    /**
     * 查询工作总结
     * 
     * @param taskId 工作总结主键
     * @return 工作总结
     */
        MyTaskReview selectMyTaskReviewByTaskId(Long taskId);

    /**
     * 查询工作总结列表
     * 
     * @param myTaskReview 工作总结
     * @return 工作总结集合
     */
    List<MyTaskReview> selectMyTaskReviewList(MyTaskReview myTaskReview);

    /**
     * 新增工作总结
     * 
     * @param myTaskReview 工作总结
     * @return 结果
     */
    int insertMyTaskReview(MyTaskReview myTaskReview);

    /**
     * 修改工作总结
     * 
     * @param myTaskReview 工作总结
     * @return 结果
     */
    int updateMyTaskReview(MyTaskReview myTaskReview);

    /**
     * 删除工作总结
     * 
     * @param taskId 工作总结主键
     * @return 结果
     */
    int deleteMyTaskReviewByTaskId(Long taskId);

    /**
     * 批量删除工作总结
     * 
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteMyTaskReviewByTaskIds(String[] taskIds);

    /**
     * 批量删除工作总结
     * 
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteTaskReviewByTaskReviewIds(String[] taskIds);
    
    /**
     * 批量新增工作总结
     * 
     * @param taskReviewList 工作总结列表
     * @return 结果
     */
    int batchTaskReview(List<TaskReview> taskReviewList);
    

    /**
     * 通过工作总结主键删除工作总结信息
     * 
     * @param taskId 工作总结ID
     * @return 结果
     */
    int deleteTaskReviewByTaskReviewId(Long taskId);
}
