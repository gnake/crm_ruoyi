package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.MyTasksVisit;
import com.ruoyi.crm.domain.CrmTaskReviewStrange;

/**
 * 陌生拜访Mapper接口
 * 
 * @author swj
 * @date 2022-07-10
 */
public interface MyTasksVisitMapper 
{
    /**
     * 查询陌生拜访
     * 
     * @param taskId 陌生拜访主键
     * @return 陌生拜访
     */
        MyTasksVisit selectMyTasksVisitByTaskId(Long taskId);

    /**
     * 查询陌生拜访列表
     * 
     * @param myTasksVisit 陌生拜访
     * @return 陌生拜访集合
     */
    List<MyTasksVisit> selectMyTasksVisitList(MyTasksVisit myTasksVisit);

    /**
     * 新增陌生拜访
     * 
     * @param myTasksVisit 陌生拜访
     * @return 结果
     */
    int insertMyTasksVisit(MyTasksVisit myTasksVisit);

    /**
     * 修改陌生拜访
     * 
     * @param myTasksVisit 陌生拜访
     * @return 结果
     */
    int updateMyTasksVisit(MyTasksVisit myTasksVisit);

    /**
     * 删除陌生拜访
     * 
     * @param taskId 陌生拜访主键
     * @return 结果
     */
    int deleteMyTasksVisitByTaskId(Long taskId);

    /**
     * 批量删除陌生拜访
     * 
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteMyTasksVisitByTaskIds(String[] taskIds);

    /**
     * 批量删除陌生拜访
     * 
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmTaskReviewStrangeByOrgIds(String[] taskIds);
    
    /**
     * 批量新增陌生拜访
     * 
     * @param crmTaskReviewStrangeList 陌生拜访列表
     * @return 结果
     */
    int batchCrmTaskReviewStrange(List<CrmTaskReviewStrange> crmTaskReviewStrangeList);
    

    /**
     * 通过陌生拜访主键删除陌生拜访信息
     * 
     * @param taskId 陌生拜访ID
     * @return 结果
     */
    int deleteCrmTaskReviewStrangeByOrgId(Long taskId);
}
