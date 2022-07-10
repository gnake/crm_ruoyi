package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.MyTaskReview;

/**
 * 工作总结Service接口
 * 
 * @author swj
 * @date 2022-07-10
 */
public interface IMyTaskReviewService 
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
     * 批量删除工作总结
     * 
     * @param taskIds 需要删除的工作总结主键集合
     * @return 结果
     */
    int deleteMyTaskReviewByTaskIds(String taskIds);

    /**
     * 删除工作总结信息
     * 
     * @param taskId 工作总结主键
     * @return 结果
     */
    int deleteMyTaskReviewByTaskId(Long taskId);
}
