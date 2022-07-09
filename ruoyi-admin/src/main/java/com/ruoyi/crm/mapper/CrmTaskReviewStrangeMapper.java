package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.CrmTaskReviewStrange;

/**
 * 陌生拜访Mapper接口
 * 
 * @author 高国文
 * @date 2022-07-08
 */
public interface CrmTaskReviewStrangeMapper 
{
    /**
     * 查询陌生拜访
     * 
     * @param orgId 陌生拜访主键
     * @return 陌生拜访
     */
        CrmTaskReviewStrange selectCrmTaskReviewStrangeByOrgId(Long orgId);

    /**
     * 查询陌生拜访列表
     * 
     * @param crmTaskReviewStrange 陌生拜访
     * @return 陌生拜访集合
     */
    List<CrmTaskReviewStrange> selectCrmTaskReviewStrangeList(CrmTaskReviewStrange crmTaskReviewStrange);

    /**
     * 新增陌生拜访
     * 
     * @param crmTaskReviewStrange 陌生拜访
     * @return 结果
     */
    int insertCrmTaskReviewStrange(CrmTaskReviewStrange crmTaskReviewStrange);

    /**
     * 修改陌生拜访
     * 
     * @param crmTaskReviewStrange 陌生拜访
     * @return 结果
     */
    int updateCrmTaskReviewStrange(CrmTaskReviewStrange crmTaskReviewStrange);

    /**
     * 删除陌生拜访
     * 
     * @param orgId 陌生拜访主键
     * @return 结果
     */
    int deleteCrmTaskReviewStrangeByOrgId(Long orgId);

    /**
     * 批量删除陌生拜访
     * 
     * @param orgIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmTaskReviewStrangeByOrgIds(String[] orgIds);
}
