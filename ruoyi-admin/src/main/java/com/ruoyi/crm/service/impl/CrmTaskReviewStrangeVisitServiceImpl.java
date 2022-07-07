package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.CrmTaskReviewStrangeVisitMapper;
import com.ruoyi.crm.domain.CrmTaskReviewStrangeVisit;
import com.ruoyi.crm.service.ICrmTaskReviewStrangeVisitService;
import com.ruoyi.common.core.text.Convert;

/**
 * 陌生拜访Service业务层处理
 * 
 * @author ggw
 * @date 2022-07-07
 */
@Service
public class CrmTaskReviewStrangeVisitServiceImpl implements ICrmTaskReviewStrangeVisitService 
{
    @Autowired
    private CrmTaskReviewStrangeVisitMapper crmTaskReviewStrangeVisitMapper;

    /**
     * 查询陌生拜访
     * 
     * @param orgId 陌生拜访主键
     * @return 陌生拜访
     */
    @Override
    public CrmTaskReviewStrangeVisit selectCrmTaskReviewStrangeVisitByOrgId(Long orgId)
    {
        return crmTaskReviewStrangeVisitMapper.selectCrmTaskReviewStrangeVisitByOrgId(orgId);
    }

    /**
     * 查询陌生拜访列表
     * 
     * @param crmTaskReviewStrangeVisit 陌生拜访
     * @return 陌生拜访
     */
    @Override
    public List<CrmTaskReviewStrangeVisit> selectCrmTaskReviewStrangeVisitList(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit)
    {
        return crmTaskReviewStrangeVisitMapper.selectCrmTaskReviewStrangeVisitList(crmTaskReviewStrangeVisit);
    }

    /**
     * 新增陌生拜访
     * 
     * @param crmTaskReviewStrangeVisit 陌生拜访
     * @return 结果
     */
    @Override
    public int insertCrmTaskReviewStrangeVisit(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit)
    {
        return crmTaskReviewStrangeVisitMapper.insertCrmTaskReviewStrangeVisit(crmTaskReviewStrangeVisit);
    }

    /**
     * 修改陌生拜访
     * 
     * @param crmTaskReviewStrangeVisit 陌生拜访
     * @return 结果
     */
    @Override
    public int updateCrmTaskReviewStrangeVisit(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit)
    {
        return crmTaskReviewStrangeVisitMapper.updateCrmTaskReviewStrangeVisit(crmTaskReviewStrangeVisit);
    }

    /**
     * 批量删除陌生拜访
     * 
     * @param orgIds 需要删除的陌生拜访主键
     * @return 结果
     */
    @Override
    public int deleteCrmTaskReviewStrangeVisitByOrgIds(String orgIds)
    {
        return crmTaskReviewStrangeVisitMapper.deleteCrmTaskReviewStrangeVisitByOrgIds(Convert.toStrArray(orgIds));
    }

    /**
     * 删除陌生拜访信息
     * 
     * @param orgId 陌生拜访主键
     * @return 结果
     */
    @Override
    public int deleteCrmTaskReviewStrangeVisitByOrgId(Long orgId)
    {
        return crmTaskReviewStrangeVisitMapper.deleteCrmTaskReviewStrangeVisitByOrgId(orgId);
    }
}
