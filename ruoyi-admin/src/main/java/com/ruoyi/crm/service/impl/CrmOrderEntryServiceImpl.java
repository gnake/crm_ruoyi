package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.CrmOrderInfo;
import com.ruoyi.crm.mapper.CrmOrderEntryMapper;
import com.ruoyi.crm.domain.CrmOrderEntry;
import com.ruoyi.crm.service.ICrmOrderEntryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工作总结Service业务层处理
 * 
 * @author 高国文
 * @date 2022-07-08
 */
@Service
public class CrmOrderEntryServiceImpl implements ICrmOrderEntryService 
{
    @Autowired
    private CrmOrderEntryMapper crmOrderEntryMapper;

    /**
     * 查询工作总结
     * 
     * @param entryId 工作总结主键
     * @return 工作总结
     */
    @Override
    public CrmOrderEntry selectCrmOrderEntryByEntryId(Long entryId)
    {
        return crmOrderEntryMapper.selectCrmOrderEntryByEntryId(entryId);
    }

    /**
     * 查询工作总结列表
     * 
     * @param crmOrderEntry 工作总结
     * @return 工作总结
     */
    @Override
    public List<CrmOrderEntry> selectCrmOrderEntryList(CrmOrderEntry crmOrderEntry)
    {
        return crmOrderEntryMapper.selectCrmOrderEntryList(crmOrderEntry);
    }

    /**
     * 新增工作总结
     * 
     * @param crmOrderEntry 工作总结
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCrmOrderEntry(CrmOrderEntry crmOrderEntry)
    {
        int rows = crmOrderEntryMapper.insertCrmOrderEntry(crmOrderEntry);
        insertCrmOrderInfo(crmOrderEntry);
        return rows;
    }

    /**
     * 修改工作总结
     * 
     * @param crmOrderEntry 工作总结
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCrmOrderEntry(CrmOrderEntry crmOrderEntry)
    {
        crmOrderEntryMapper.deleteCrmOrderInfoByOrderId(crmOrderEntry.getEntryId());
        insertCrmOrderInfo(crmOrderEntry);
        return crmOrderEntryMapper.updateCrmOrderEntry(crmOrderEntry);
    }

    /**
     * 批量删除工作总结
     * 
     * @param entryIds 需要删除的工作总结主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCrmOrderEntryByEntryIds(String entryIds)
    {
        crmOrderEntryMapper.deleteCrmOrderInfoByOrderIds(Convert.toStrArray(entryIds));
        return crmOrderEntryMapper.deleteCrmOrderEntryByEntryIds(Convert.toStrArray(entryIds));
    }

    /**
     * 删除工作总结信息
     * 
     * @param entryId 工作总结主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCrmOrderEntryByEntryId(Long entryId)
    {
        crmOrderEntryMapper.deleteCrmOrderInfoByOrderId(entryId);
        return crmOrderEntryMapper.deleteCrmOrderEntryByEntryId(entryId);
    }

    /**
     * 新增订单管理信息
     * 
     * @param crmOrderEntry 工作总结对象
     */
    public void insertCrmOrderInfo(CrmOrderEntry crmOrderEntry)
    {
        List<CrmOrderInfo> crmOrderInfoList = crmOrderEntry.getCrmOrderInfoList();
        Long entryId = crmOrderEntry.getEntryId();
        if (StringUtils.isNotNull(crmOrderInfoList))
        {
            List<CrmOrderInfo> list = new ArrayList<CrmOrderInfo>();
            for (CrmOrderInfo crmOrderInfo : crmOrderInfoList)
            {
                crmOrderInfo.setOrderId(entryId);
                list.add(crmOrderInfo);
            }
            if (list.size() > 0)
            {
                crmOrderEntryMapper.batchCrmOrderInfo(list);
            }
        }
    }
}
