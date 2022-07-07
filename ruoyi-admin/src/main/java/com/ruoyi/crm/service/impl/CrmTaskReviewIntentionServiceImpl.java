package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.CrmTaskReviewIntentionMapper;
import com.ruoyi.crm.domain.CrmTaskReviewIntention;
import com.ruoyi.crm.service.ICrmTaskReviewIntentionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 意向跟进Service业务层处理
 * 
 * @author ggw
 * @date 2022-07-07
 */
@Service
public class CrmTaskReviewIntentionServiceImpl implements ICrmTaskReviewIntentionService 
{
    @Autowired
    private CrmTaskReviewIntentionMapper crmTaskReviewIntentionMapper;

    /**
     * 查询意向跟进
     * 
     * @param custId 意向跟进主键
     * @return 意向跟进
     */
    @Override
    public CrmTaskReviewIntention selectCrmTaskReviewIntentionByCustId(Long custId)
    {
        return crmTaskReviewIntentionMapper.selectCrmTaskReviewIntentionByCustId(custId);
    }

    /**
     * 查询意向跟进列表
     * 
     * @param crmTaskReviewIntention 意向跟进
     * @return 意向跟进
     */
    @Override
    public List<CrmTaskReviewIntention> selectCrmTaskReviewIntentionList(CrmTaskReviewIntention crmTaskReviewIntention)
    {
        return crmTaskReviewIntentionMapper.selectCrmTaskReviewIntentionList(crmTaskReviewIntention);
    }

    /**
     * 新增意向跟进
     * 
     * @param crmTaskReviewIntention 意向跟进
     * @return 结果
     */
    @Override
    public int insertCrmTaskReviewIntention(CrmTaskReviewIntention crmTaskReviewIntention)
    {
        return crmTaskReviewIntentionMapper.insertCrmTaskReviewIntention(crmTaskReviewIntention);
    }

    /**
     * 修改意向跟进
     * 
     * @param crmTaskReviewIntention 意向跟进
     * @return 结果
     */
    @Override
    public int updateCrmTaskReviewIntention(CrmTaskReviewIntention crmTaskReviewIntention)
    {
        return crmTaskReviewIntentionMapper.updateCrmTaskReviewIntention(crmTaskReviewIntention);
    }

    /**
     * 批量删除意向跟进
     * 
     * @param custIds 需要删除的意向跟进主键
     * @return 结果
     */
    @Override
    public int deleteCrmTaskReviewIntentionByCustIds(String custIds)
    {
        return crmTaskReviewIntentionMapper.deleteCrmTaskReviewIntentionByCustIds(Convert.toStrArray(custIds));
    }

    /**
     * 删除意向跟进信息
     * 
     * @param custId 意向跟进主键
     * @return 结果
     */
    @Override
    public int deleteCrmTaskReviewIntentionByCustId(Long custId)
    {
        return crmTaskReviewIntentionMapper.deleteCrmTaskReviewIntentionByCustId(custId);
    }
}
