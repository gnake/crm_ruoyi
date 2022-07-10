package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.MyTasksVisit;

/**
 * 陌生拜访Service接口
 * 
 * @author swj
 * @date 2022-07-10
 */
public interface IMyTasksVisitService 
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
     * 批量删除陌生拜访
     * 
     * @param taskIds 需要删除的陌生拜访主键集合
     * @return 结果
     */
    int deleteMyTasksVisitByTaskIds(String taskIds);

    /**
     * 删除陌生拜访信息
     * 
     * @param taskId 陌生拜访主键
     * @return 结果
     */
    int deleteMyTasksVisitByTaskId(Long taskId);
}
