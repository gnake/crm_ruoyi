package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.TaskCycle;

/**
 * 任务周期Mapper接口
 * 
 * @author swj
 * @date 2022-07-07
 */
public interface TaskCycleMapper 
{
    /**
     * 查询任务周期
     * 
     * @param tcId 任务周期主键
     * @return 任务周期
     */
        TaskCycle selectTaskCycleByTcId(Long tcId);

    /**
     * 查询任务周期列表
     * 
     * @param taskCycle 任务周期
     * @return 任务周期集合
     */
    List<TaskCycle> selectTaskCycleList(TaskCycle taskCycle);

    /**
     * 新增任务周期
     * 
     * @param taskCycle 任务周期
     * @return 结果
     */
    int insertTaskCycle(TaskCycle taskCycle);

    /**
     * 修改任务周期
     * 
     * @param taskCycle 任务周期
     * @return 结果
     */
    int updateTaskCycle(TaskCycle taskCycle);

    /**
     * 删除任务周期
     * 
     * @param tcId 任务周期主键
     * @return 结果
     */
    int deleteTaskCycleByTcId(Long tcId);

    /**
     * 批量删除任务周期
     * 
     * @param tcIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteTaskCycleByTcIds(String[] tcIds);
}
