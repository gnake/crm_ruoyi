package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.CrmOrderEntry;
import com.ruoyi.crm.domain.CrmOrderInfo;

/**
 * 工作总结Mapper接口
 * 
 * @author 高国文
 * @date 2022-07-08
 */
public interface CrmOrderEntryMapper 
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
     * 删除工作总结
     * 
     * @param entryId 工作总结主键
     * @return 结果
     */
    int deleteCrmOrderEntryByEntryId(Long entryId);

    /**
     * 批量删除工作总结
     * 
     * @param entryIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmOrderEntryByEntryIds(String[] entryIds);

    /**
     * 批量删除订单管理
     * 
     * @param entryIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmOrderInfoByOrderIds(String[] entryIds);
    
    /**
     * 批量新增订单管理
     * 
     * @param crmOrderInfoList 订单管理列表
     * @return 结果
     */
    int batchCrmOrderInfo(List<CrmOrderInfo> crmOrderInfoList);
    

    /**
     * 通过工作总结主键删除订单管理信息
     * 
     * @param entryId 工作总结ID
     * @return 结果
     */
    int deleteCrmOrderInfoByOrderId(Long entryId);
}
