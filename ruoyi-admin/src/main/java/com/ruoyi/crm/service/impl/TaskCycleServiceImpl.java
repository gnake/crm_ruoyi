package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.TaskCycleMapper;
import com.ruoyi.crm.domain.TaskCycle;
import com.ruoyi.crm.service.ITaskCycleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 任务周期Service业务层处理
 * 
 * @author swj
 * @date 2022-07-07
 */
@Service
public class TaskCycleServiceImpl implements ITaskCycleService 
{
    @Autowired
    private TaskCycleMapper taskCycleMapper;

    /**
     * 查询任务周期
     * 
     * @param tcId 任务周期主键
     * @return 任务周期
     */
    @Override
    public TaskCycle selectTaskCycleByTcId(Long tcId)
    {
        return taskCycleMapper.selectTaskCycleByTcId(tcId);
    }

    /**
     * 查询任务周期列表
     * 
     * @param taskCycle 任务周期
     * @return 任务周期
     */
    @Override
    public List<TaskCycle> selectTaskCycleList(TaskCycle taskCycle)
    {
        return taskCycleMapper.selectTaskCycleList(taskCycle);
    }

    /**
     * 新增任务周期
     * 
     * @param taskCycle 任务周期
     * @return 结果
     */
    @Override
    public int insertTaskCycle(TaskCycle taskCycle)
    {
        return taskCycleMapper.insertTaskCycle(taskCycle);
    }

    /**
     * 修改任务周期
     * 
     * @param taskCycle 任务周期
     * @return 结果
     */
    @Override
    public int updateTaskCycle(TaskCycle taskCycle)
    {
        return taskCycleMapper.updateTaskCycle(taskCycle);
    }

    /**
     * 批量删除任务周期
     * 
     * @param tcIds 需要删除的任务周期主键
     * @return 结果
     */
    @Override
    public int deleteTaskCycleByTcIds(String tcIds)
    {
        return taskCycleMapper.deleteTaskCycleByTcIds(Convert.toStrArray(tcIds));
    }

    /**
     * 删除任务周期信息
     * 
     * @param tcId 任务周期主键
     * @return 结果
     */
    @Override
    public int deleteTaskCycleByTcId(Long tcId)
    {
        return taskCycleMapper.deleteTaskCycleByTcId(tcId);
    }
}
