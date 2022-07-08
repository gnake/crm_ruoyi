package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.TaskCycle;
import com.ruoyi.crm.mapper.TaskReviewMapper;
import com.ruoyi.crm.domain.TaskReview;
import com.ruoyi.crm.service.ITaskReviewService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工作总结Service业务层处理
 * 
 * @author swj
 * @date 2022-07-08
 */
@Service
public class TaskReviewServiceImpl implements ITaskReviewService 
{
    @Autowired
    private TaskReviewMapper taskReviewMapper;

    /**
     * 查询工作总结
     * 
     * @param taskReviewId 工作总结主键
     * @return 工作总结
     */
    @Override
    public TaskReview selectTaskReviewByTaskReviewId(Long taskReviewId)
    {
        return taskReviewMapper.selectTaskReviewByTaskReviewId(taskReviewId);
    }

    /**
     * 查询工作总结列表
     * 
     * @param taskReview 工作总结
     * @return 工作总结
     */
    @Override
    public List<TaskReview> selectTaskReviewList(TaskReview taskReview)
    {
        return taskReviewMapper.selectTaskReviewList(taskReview);
    }

    /**
     * 新增工作总结
     * 
     * @param taskReview 工作总结
     * @return 结果
     */
    @Transactional
    @Override
    public int insertTaskReview(TaskReview taskReview)
    {
        int rows = taskReviewMapper.insertTaskReview(taskReview);
        insertTaskCycle(taskReview);
        return rows;
    }

    /**
     * 修改工作总结
     * 
     * @param taskReview 工作总结
     * @return 结果
     */
    @Transactional
    @Override
    public int updateTaskReview(TaskReview taskReview)
    {
        taskReviewMapper.deleteTaskCycleByTcId(taskReview.getTaskReviewId());
        insertTaskCycle(taskReview);
        return taskReviewMapper.updateTaskReview(taskReview);
    }

    /**
     * 批量删除工作总结
     * 
     * @param taskReviewIds 需要删除的工作总结主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTaskReviewByTaskReviewIds(String taskReviewIds)
    {
        taskReviewMapper.deleteTaskCycleByTcIds(Convert.toStrArray(taskReviewIds));
        return taskReviewMapper.deleteTaskReviewByTaskReviewIds(Convert.toStrArray(taskReviewIds));
    }

    /**
     * 删除工作总结信息
     * 
     * @param taskReviewId 工作总结主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTaskReviewByTaskReviewId(Long taskReviewId)
    {
        taskReviewMapper.deleteTaskCycleByTcId(taskReviewId);
        return taskReviewMapper.deleteTaskReviewByTaskReviewId(taskReviewId);
    }

    /**
     * 新增任务周期信息
     * 
     * @param taskReview 工作总结对象
     */
    public void insertTaskCycle(TaskReview taskReview)
    {
        List<TaskCycle> taskCycleList = taskReview.getTaskCycleList();
        Long taskReviewId = taskReview.getTaskReviewId();
        if (StringUtils.isNotNull(taskCycleList))
        {
            List<TaskCycle> list = new ArrayList<TaskCycle>();
            for (TaskCycle taskCycle : taskCycleList)
            {
                taskCycle.setTcId(taskReviewId);
                list.add(taskCycle);
            }
            if (list.size() > 0)
            {
                taskReviewMapper.batchTaskCycle(list);
            }
        }
    }
}
