package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.TaskCycle;
import com.ruoyi.crm.mapper.TasksReviewMapper;
import com.ruoyi.crm.domain.TasksReview;
import com.ruoyi.crm.service.ITasksReviewService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工作总结Service业务层处理
 * 
 * @author swj
 * @date 2022-07-10
 */
@Service
public class TasksReviewServiceImpl implements ITasksReviewService 
{
    @Autowired
    private TasksReviewMapper tasksReviewMapper;

    /**
     * 查询工作总结
     * 
     * @param taskReviewId 工作总结主键
     * @return 工作总结
     */
    @Override
    public TasksReview selectTasksReviewByTaskReviewId(Long taskReviewId)
    {
        return tasksReviewMapper.selectTasksReviewByTaskReviewId(taskReviewId);
    }

    /**
     * 查询工作总结列表
     * 
     * @param tasksReview 工作总结
     * @return 工作总结
     */
    @Override
    public List<TasksReview> selectTasksReviewList(TasksReview tasksReview)
    {
        return tasksReviewMapper.selectTasksReviewList(tasksReview);
    }

    /**
     * 新增工作总结
     * 
     * @param tasksReview 工作总结
     * @return 结果
     */
    @Transactional
    @Override
    public int insertTasksReview(TasksReview tasksReview)
    {
        int rows = tasksReviewMapper.insertTasksReview(tasksReview);
        insertTaskCycle(tasksReview);
        return rows;
    }

    /**
     * 修改工作总结
     * 
     * @param tasksReview 工作总结
     * @return 结果
     */
    @Transactional
    @Override
    public int updateTasksReview(TasksReview tasksReview)
    {
        tasksReviewMapper.deleteTaskCycleByTcId(tasksReview.getTaskReviewId());
        insertTaskCycle(tasksReview);
        return tasksReviewMapper.updateTasksReview(tasksReview);
    }

    /**
     * 批量删除工作总结
     * 
     * @param taskReviewIds 需要删除的工作总结主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTasksReviewByTaskReviewIds(String taskReviewIds)
    {
        tasksReviewMapper.deleteTaskCycleByTcIds(Convert.toStrArray(taskReviewIds));
        return tasksReviewMapper.deleteTasksReviewByTaskReviewIds(Convert.toStrArray(taskReviewIds));
    }

    /**
     * 删除工作总结信息
     * 
     * @param taskReviewId 工作总结主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTasksReviewByTaskReviewId(Long taskReviewId)
    {
        tasksReviewMapper.deleteTaskCycleByTcId(taskReviewId);
        return tasksReviewMapper.deleteTasksReviewByTaskReviewId(taskReviewId);
    }

    /**
     * 新增任务周期信息
     * 
     * @param tasksReview 工作总结对象
     */
    public void insertTaskCycle(TasksReview tasksReview)
    {
        List<TaskCycle> taskCycleList = tasksReview.getTaskCycleList();
        Long taskReviewId = tasksReview.getTaskReviewId();
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
                tasksReviewMapper.batchTaskCycle(list);
            }
        }
    }
}
