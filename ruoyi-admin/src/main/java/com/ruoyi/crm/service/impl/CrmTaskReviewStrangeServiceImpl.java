package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.CrmTaskReviewStrangeMapper;
import com.ruoyi.crm.domain.CrmTaskReviewStrange;
import com.ruoyi.crm.service.ICrmTaskReviewStrangeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 陌生拜访Service业务层处理
 * 
 * @author 高国文
 * @date 2022-07-08
 */
@Service
public class CrmTaskReviewStrangeServiceImpl implements ICrmTaskReviewStrangeService 
{
    @Autowired
    private CrmTaskReviewStrangeMapper crmTaskReviewStrangeMapper;

    /**
     * 查询陌生拜访
     * 
     * @param orgId 陌生拜访主键
     * @return 陌生拜访
     */
    @Override
    public CrmTaskReviewStrange selectCrmTaskReviewStrangeByOrgId(Long orgId)
    {
        return crmTaskReviewStrangeMapper.selectCrmTaskReviewStrangeByOrgId(orgId);
    }

    /**
     * 查询陌生拜访列表
     * 
     * @param crmTaskReviewStrange 陌生拜访
     * @return 陌生拜访
     */
    @Override
    public List<CrmTaskReviewStrange> selectCrmTaskReviewStrangeList(CrmTaskReviewStrange crmTaskReviewStrange)
    {
        return crmTaskReviewStrangeMapper.selectCrmTaskReviewStrangeList(crmTaskReviewStrange);
    }

    /**
     * 新增陌生拜访
     * 
     * @param crmTaskReviewStrange 陌生拜访
     * @return 结果
     */
    @Override
    public int insertCrmTaskReviewStrange(CrmTaskReviewStrange crmTaskReviewStrange)
    {
        return crmTaskReviewStrangeMapper.insertCrmTaskReviewStrange(crmTaskReviewStrange);
    }

    /**
     * 修改陌生拜访
     * 
     * @param crmTaskReviewStrange 陌生拜访
     * @return 结果
     */
    @Override
    public int updateCrmTaskReviewStrange(CrmTaskReviewStrange crmTaskReviewStrange)
    {
        return crmTaskReviewStrangeMapper.updateCrmTaskReviewStrange(crmTaskReviewStrange);
    }

    /**
     * 批量删除陌生拜访
     * 
     * @param orgIds 需要删除的陌生拜访主键
     * @return 结果
     */
    @Override
    public int deleteCrmTaskReviewStrangeByOrgIds(String orgIds)
    {
        return crmTaskReviewStrangeMapper.deleteCrmTaskReviewStrangeByOrgIds(Convert.toStrArray(orgIds));
    }

    /**
     * 删除陌生拜访信息
     * 
     * @param orgId 陌生拜访主键
     * @return 结果
     */
    @Override
    public int deleteCrmTaskReviewStrangeByOrgId(Long orgId)
    {
        return crmTaskReviewStrangeMapper.deleteCrmTaskReviewStrangeByOrgId(orgId);
    }
}
