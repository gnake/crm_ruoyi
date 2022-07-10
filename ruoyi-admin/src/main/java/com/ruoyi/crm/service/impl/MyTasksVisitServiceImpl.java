package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.CrmTaskReviewStrange;
import com.ruoyi.crm.mapper.MyTasksVisitMapper;
import com.ruoyi.crm.domain.MyTasksVisit;
import com.ruoyi.crm.service.IMyTasksVisitService;
import com.ruoyi.common.core.text.Convert;

/**
 * 陌生拜访Service业务层处理
 * 
 * @author swj
 * @date 2022-07-10
 */
@Service
public class MyTasksVisitServiceImpl implements IMyTasksVisitService 
{
    @Autowired
    private MyTasksVisitMapper myTasksVisitMapper;

    /**
     * 查询陌生拜访
     * 
     * @param taskId 陌生拜访主键
     * @return 陌生拜访
     */
    @Override
    public MyTasksVisit selectMyTasksVisitByTaskId(Long taskId)
    {
        return myTasksVisitMapper.selectMyTasksVisitByTaskId(taskId);
    }

    /**
     * 查询陌生拜访列表
     * 
     * @param myTasksVisit 陌生拜访
     * @return 陌生拜访
     */
    @Override
    public List<MyTasksVisit> selectMyTasksVisitList(MyTasksVisit myTasksVisit)
    {
        return myTasksVisitMapper.selectMyTasksVisitList(myTasksVisit);
    }

    /**
     * 新增陌生拜访
     * 
     * @param myTasksVisit 陌生拜访
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMyTasksVisit(MyTasksVisit myTasksVisit)
    {
        int rows = myTasksVisitMapper.insertMyTasksVisit(myTasksVisit);
        insertCrmTaskReviewStrange(myTasksVisit);
        return rows;
    }

    /**
     * 修改陌生拜访
     * 
     * @param myTasksVisit 陌生拜访
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMyTasksVisit(MyTasksVisit myTasksVisit)
    {
        myTasksVisitMapper.deleteCrmTaskReviewStrangeByOrgId(myTasksVisit.getTaskId());
        insertCrmTaskReviewStrange(myTasksVisit);
        return myTasksVisitMapper.updateMyTasksVisit(myTasksVisit);
    }

    /**
     * 批量删除陌生拜访
     * 
     * @param taskIds 需要删除的陌生拜访主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMyTasksVisitByTaskIds(String taskIds)
    {
        myTasksVisitMapper.deleteCrmTaskReviewStrangeByOrgIds(Convert.toStrArray(taskIds));
        return myTasksVisitMapper.deleteMyTasksVisitByTaskIds(Convert.toStrArray(taskIds));
    }

    /**
     * 删除陌生拜访信息
     * 
     * @param taskId 陌生拜访主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMyTasksVisitByTaskId(Long taskId)
    {
        myTasksVisitMapper.deleteCrmTaskReviewStrangeByOrgId(taskId);
        return myTasksVisitMapper.deleteMyTasksVisitByTaskId(taskId);
    }

    /**
     * 新增陌生拜访信息
     * 
     * @param myTasksVisit 陌生拜访对象
     */
    public void insertCrmTaskReviewStrange(MyTasksVisit myTasksVisit)
    {
        List<CrmTaskReviewStrange> crmTaskReviewStrangeList = myTasksVisit.getCrmTaskReviewStrangeList();
        Long taskId = myTasksVisit.getTaskId();
        if (StringUtils.isNotNull(crmTaskReviewStrangeList))
        {
            List<CrmTaskReviewStrange> list = new ArrayList<CrmTaskReviewStrange>();
            for (CrmTaskReviewStrange crmTaskReviewStrange : crmTaskReviewStrangeList)
            {
                crmTaskReviewStrange.setOrgId(taskId);
                list.add(crmTaskReviewStrange);
            }
            if (list.size() > 0)
            {
                myTasksVisitMapper.batchCrmTaskReviewStrange(list);
            }
        }
    }
}
