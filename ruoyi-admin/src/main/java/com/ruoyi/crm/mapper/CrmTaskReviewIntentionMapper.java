package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.CrmTaskReviewIntention;

/**
 * 意向跟进Mapper接口
 * 
 * @author ggw
 * @date 2022-07-07
 */
public interface CrmTaskReviewIntentionMapper 
{
    /**
     * 查询意向跟进
     * 
     * @param custId 意向跟进主键
     * @return 意向跟进
     */
        CrmTaskReviewIntention selectCrmTaskReviewIntentionByCustId(Long custId);

    /**
     * 查询意向跟进列表
     * 
     * @param crmTaskReviewIntention 意向跟进
     * @return 意向跟进集合
     */
    List<CrmTaskReviewIntention> selectCrmTaskReviewIntentionList(CrmTaskReviewIntention crmTaskReviewIntention);

    /**
     * 新增意向跟进
     * 
     * @param crmTaskReviewIntention 意向跟进
     * @return 结果
     */
    int insertCrmTaskReviewIntention(CrmTaskReviewIntention crmTaskReviewIntention);

    /**
     * 修改意向跟进
     * 
     * @param crmTaskReviewIntention 意向跟进
     * @return 结果
     */
    int updateCrmTaskReviewIntention(CrmTaskReviewIntention crmTaskReviewIntention);

    /**
     * 删除意向跟进
     * 
     * @param custId 意向跟进主键
     * @return 结果
     */
    int deleteCrmTaskReviewIntentionByCustId(Long custId);

    /**
     * 批量删除意向跟进
     * 
     * @param custIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmTaskReviewIntentionByCustIds(String[] custIds);
}
