package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.CrmTaskReviewStrangeVisit;

/**
 * 陌生拜访Mapper接口
 * 
 * @author ggw
 * @date 2022-07-07
 */
public interface CrmTaskReviewStrangeVisitMapper 
{
    /**
     * 查询陌生拜访
     * 
     * @param orgId 陌生拜访主键
     * @return 陌生拜访
     */
        CrmTaskReviewStrangeVisit selectCrmTaskReviewStrangeVisitByOrgId(Long orgId);

    /**
     * 查询陌生拜访列表
     * 
     * @param crmTaskReviewStrangeVisit 陌生拜访
     * @return 陌生拜访集合
     */
    List<CrmTaskReviewStrangeVisit> selectCrmTaskReviewStrangeVisitList(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit);

    /**
     * 新增陌生拜访
     * 
     * @param crmTaskReviewStrangeVisit 陌生拜访
     * @return 结果
     */
    int insertCrmTaskReviewStrangeVisit(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit);

    /**
     * 修改陌生拜访
     * 
     * @param crmTaskReviewStrangeVisit 陌生拜访
     * @return 结果
     */
    int updateCrmTaskReviewStrangeVisit(CrmTaskReviewStrangeVisit crmTaskReviewStrangeVisit);

    /**
     * 删除陌生拜访
     * 
     * @param orgId 陌生拜访主键
     * @return 结果
     */
    int deleteCrmTaskReviewStrangeVisitByOrgId(Long orgId);

    /**
     * 批量删除陌生拜访
     * 
     * @param orgIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmTaskReviewStrangeVisitByOrgIds(String[] orgIds);
}
