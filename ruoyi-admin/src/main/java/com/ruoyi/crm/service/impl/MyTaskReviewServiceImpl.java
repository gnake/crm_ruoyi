package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.TaskReview;
import com.ruoyi.crm.mapper.MyTaskReviewMapper;
import com.ruoyi.crm.domain.MyTaskReview;
import com.ruoyi.crm.service.IMyTaskReviewService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工作总结Service业务层处理
 * 
 * @author swj
 * @date 2022-07-10
 */
@Service
public class MyTaskReviewServiceImpl implements IMyTaskReviewService 
{
    @Autowired
    private MyTaskReviewMapper myTaskReviewMapper;

    /**
     * 查询工作总结
     * 
     * @param taskId 工作总结主键
     * @return 工作总结
     */
    @Override
    public MyTaskReview selectMyTaskReviewByTaskId(Long taskId)
    {
        return myTaskReviewMapper.selectMyTaskReviewByTaskId(taskId);
    }

    /**
     * 查询工作总结列表
     * 
     * @param myTaskReview 工作总结
     * @return 工作总结
     */
    @Override
    public List<MyTaskReview> selectMyTaskReviewList(MyTaskReview myTaskReview)
    {
        return myTaskReviewMapper.selectMyTaskReviewList(myTaskReview);
    }

    /**
     * 新增工作总结
     * 
     * @param myTaskReview 工作总结
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMyTaskReview(MyTaskReview myTaskReview)
    {
        int rows = myTaskReviewMapper.insertMyTaskReview(myTaskReview);
        insertTaskReview(myTaskReview);
        return rows;
    }

    /**
     * 修改工作总结
     * 
     * @param myTaskReview 工作总结
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMyTaskReview(MyTaskReview myTaskReview)
    {
        myTaskReviewMapper.deleteTaskReviewByTaskReviewId(myTaskReview.getTaskId());
        insertTaskReview(myTaskReview);
        return myTaskReviewMapper.updateMyTaskReview(myTaskReview);
    }

    /**
     * 批量删除工作总结
     * 
     * @param taskIds 需要删除的工作总结主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMyTaskReviewByTaskIds(String taskIds)
    {
        myTaskReviewMapper.deleteTaskReviewByTaskReviewIds(Convert.toStrArray(taskIds));
        return myTaskReviewMapper.deleteMyTaskReviewByTaskIds(Convert.toStrArray(taskIds));
    }

    /**
     * 删除工作总结信息
     * 
     * @param taskId 工作总结主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMyTaskReviewByTaskId(Long taskId)
    {
        myTaskReviewMapper.deleteTaskReviewByTaskReviewId(taskId);
        return myTaskReviewMapper.deleteMyTaskReviewByTaskId(taskId);
    }

    /**
     * 新增工作总结信息
     * 
     * @param myTaskReview 工作总结对象
     */
    public void insertTaskReview(MyTaskReview myTaskReview)
    {
        List<TaskReview> taskReviewList = myTaskReview.getTaskReviewList();
        Long taskId = myTaskReview.getTaskId();
        if (StringUtils.isNotNull(taskReviewList))
        {
            List<TaskReview> list = new ArrayList<TaskReview>();
            for (TaskReview taskReview : taskReviewList)
            {
                taskReview.setTaskReviewId(taskId);
                list.add(taskReview);
            }
            if (list.size() > 0)
            {
                myTaskReviewMapper.batchTaskReview(list);
            }
        }
    }
}
