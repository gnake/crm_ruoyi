package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TaskCycle;

/**
 * 任务周期定义Mapper接口
 * 
 * @author ruoyi
 * @date 2022-07-07
 */
public interface TaskCycleMapper 
{
    /**
     * 查询任务周期定义
     * 
     * @param tcId 任务周期定义主键
     * @return 任务周期定义
     */
    public TaskCycle selectTaskCycleByTcId(Long tcId);

    /**
     * 查询任务周期定义列表
     * 
     * @param taskCycle 任务周期定义
     * @return 任务周期定义集合
     */
    public List<TaskCycle> selectTaskCycleList(TaskCycle taskCycle);

    /**
     * 新增任务周期定义
     * 
     * @param taskCycle 任务周期定义
     * @return 结果
     */
    public int insertTaskCycle(TaskCycle taskCycle);

    /**
     * 修改任务周期定义
     * 
     * @param taskCycle 任务周期定义
     * @return 结果
     */
    public int updateTaskCycle(TaskCycle taskCycle);

    /**
     * 删除任务周期定义
     * 
     * @param tcId 任务周期定义主键
     * @return 结果
     */
    public int deleteTaskCycleByTcId(Long tcId);

    /**
     * 批量删除任务周期定义
     * 
     * @param tcIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTaskCycleByTcIds(String[] tcIds);
}
