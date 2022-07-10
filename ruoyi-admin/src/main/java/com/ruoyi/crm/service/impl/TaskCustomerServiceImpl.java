package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.MyCustomer;
import com.ruoyi.crm.mapper.TaskCustomerMapper;
import com.ruoyi.crm.domain.TaskCustomer;
import com.ruoyi.crm.service.ITaskCustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 意向跟进Service业务层处理
 * 
 * @author swj
 * @date 2022-07-10
 */
@Service
public class TaskCustomerServiceImpl implements ITaskCustomerService 
{
    @Autowired
    private TaskCustomerMapper taskCustomerMapper;

    /**
     * 查询意向跟进
     * 
     * @param taskId 意向跟进主键
     * @return 意向跟进
     */
    @Override
    public TaskCustomer selectTaskCustomerByTaskId(Long taskId)
    {
        return taskCustomerMapper.selectTaskCustomerByTaskId(taskId);
    }

    /**
     * 查询意向跟进列表
     * 
     * @param taskCustomer 意向跟进
     * @return 意向跟进
     */
    @Override
    public List<TaskCustomer> selectTaskCustomerList(TaskCustomer taskCustomer)
    {
        return taskCustomerMapper.selectTaskCustomerList(taskCustomer);
    }

    /**
     * 新增意向跟进
     * 
     * @param taskCustomer 意向跟进
     * @return 结果
     */
    @Transactional
    @Override
    public int insertTaskCustomer(TaskCustomer taskCustomer)
    {
        int rows = taskCustomerMapper.insertTaskCustomer(taskCustomer);
        insertMyCustomer(taskCustomer);
        return rows;
    }

    /**
     * 修改意向跟进
     * 
     * @param taskCustomer 意向跟进
     * @return 结果
     */
    @Transactional
    @Override
    public int updateTaskCustomer(TaskCustomer taskCustomer)
    {
        taskCustomerMapper.deleteMyCustomerByCustId(taskCustomer.getTaskId());
        insertMyCustomer(taskCustomer);
        return taskCustomerMapper.updateTaskCustomer(taskCustomer);
    }

    /**
     * 批量删除意向跟进
     * 
     * @param taskIds 需要删除的意向跟进主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTaskCustomerByTaskIds(String taskIds)
    {
        taskCustomerMapper.deleteMyCustomerByCustIds(Convert.toStrArray(taskIds));
        return taskCustomerMapper.deleteTaskCustomerByTaskIds(Convert.toStrArray(taskIds));
    }

    /**
     * 删除意向跟进信息
     * 
     * @param taskId 意向跟进主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTaskCustomerByTaskId(Long taskId)
    {
        taskCustomerMapper.deleteMyCustomerByCustId(taskId);
        return taskCustomerMapper.deleteTaskCustomerByTaskId(taskId);
    }

    /**
     * 新增意向跟进信息
     * 
     * @param taskCustomer 意向跟进对象
     */
    public void insertMyCustomer(TaskCustomer taskCustomer)
    {
        List<MyCustomer> myCustomerList = taskCustomer.getMyCustomerList();
        Long taskId = taskCustomer.getTaskId();
        if (StringUtils.isNotNull(myCustomerList))
        {
            List<MyCustomer> list = new ArrayList<MyCustomer>();
            for (MyCustomer myCustomer : myCustomerList)
            {
                myCustomer.setCustId(taskId);
                list.add(myCustomer);
            }
            if (list.size() > 0)
            {
                taskCustomerMapper.batchMyCustomer(list);
            }
        }
    }
}
