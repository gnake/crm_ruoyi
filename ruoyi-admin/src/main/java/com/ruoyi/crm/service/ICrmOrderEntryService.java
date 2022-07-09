package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.CrmOrderEntry;

/**
 * 工作总结Service接口
 * 
 * @author 高国文
 * @date 2022-07-08
 */
public interface ICrmOrderEntryService 
{
    /**
     * 查询工作总结
     * 
     * @param entryId 工作总结主键
     * @return 工作总结
     */
        CrmOrderEntry selectCrmOrderEntryByEntryId(Long entryId);

    /**
     * 查询工作总结列表
     * 
     * @param crmOrderEntry 工作总结
     * @return 工作总结集合
     */
    List<CrmOrderEntry> selectCrmOrderEntryList(CrmOrderEntry crmOrderEntry);

    /**
     * 新增工作总结
     * 
     * @param crmOrderEntry 工作总结
     * @return 结果
     */
    int insertCrmOrderEntry(CrmOrderEntry crmOrderEntry);

    /**
     * 修改工作总结
     * 
     * @param crmOrderEntry 工作总结
     * @return 结果
     */
    int updateCrmOrderEntry(CrmOrderEntry crmOrderEntry);

    /**
     * 批量删除工作总结
     * 
     * @param entryIds 需要删除的工作总结主键集合
     * @return 结果
     */
    int deleteCrmOrderEntryByEntryIds(String entryIds);

    /**
     * 删除工作总结信息
     * 
     * @param entryId 工作总结主键
     * @return 结果
     */
    int deleteCrmOrderEntryByEntryId(Long entryId);
}
