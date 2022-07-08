package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.CrmVisitCustomer;
import com.ruoyi.crm.mapper.CrmTaskCustomerMapper;
import com.ruoyi.crm.domain.CrmTaskCustomer;
import com.ruoyi.crm.service.ICrmTaskCustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 意向跟进Service业务层处理
 * 
 * @author swj
 * @date 2022-07-08
 */
@Service
public class CrmTaskCustomerServiceImpl implements ICrmTaskCustomerService 
{
    @Autowired
    private CrmTaskCustomerMapper crmTaskCustomerMapper;

    /**
     * 查询意向跟进
     * 
     * @param custId 意向跟进主键
     * @return 意向跟进
     */
    @Override
    public CrmTaskCustomer selectCrmTaskCustomerByCustId(Long custId)
    {
        return crmTaskCustomerMapper.selectCrmTaskCustomerByCustId(custId);
    }

    /**
     * 查询意向跟进列表
     * 
     * @param crmTaskCustomer 意向跟进
     * @return 意向跟进
     */
    @Override
    public List<CrmTaskCustomer> selectCrmTaskCustomerList(CrmTaskCustomer crmTaskCustomer)
    {
        return crmTaskCustomerMapper.selectCrmTaskCustomerList(crmTaskCustomer);
    }

    /**
     * 新增意向跟进
     * 
     * @param crmTaskCustomer 意向跟进
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCrmTaskCustomer(CrmTaskCustomer crmTaskCustomer)
    {
        int rows = crmTaskCustomerMapper.insertCrmTaskCustomer(crmTaskCustomer);
        insertCrmVisitCustomer(crmTaskCustomer);
        return rows;
    }

    /**
     * 修改意向跟进
     * 
     * @param crmTaskCustomer 意向跟进
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCrmTaskCustomer(CrmTaskCustomer crmTaskCustomer)
    {
        crmTaskCustomerMapper.deleteCrmVisitCustomerByVisitCustId(crmTaskCustomer.getCustId());
        insertCrmVisitCustomer(crmTaskCustomer);
        return crmTaskCustomerMapper.updateCrmTaskCustomer(crmTaskCustomer);
    }

    /**
     * 批量删除意向跟进
     * 
     * @param custIds 需要删除的意向跟进主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCrmTaskCustomerByCustIds(String custIds)
    {
        crmTaskCustomerMapper.deleteCrmVisitCustomerByVisitCustIds(Convert.toStrArray(custIds));
        return crmTaskCustomerMapper.deleteCrmTaskCustomerByCustIds(Convert.toStrArray(custIds));
    }

    /**
     * 删除意向跟进信息
     * 
     * @param custId 意向跟进主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCrmTaskCustomerByCustId(Long custId)
    {
        crmTaskCustomerMapper.deleteCrmVisitCustomerByVisitCustId(custId);
        return crmTaskCustomerMapper.deleteCrmTaskCustomerByCustId(custId);
    }

    /**
     * 新增我的客户信息
     * 
     * @param crmTaskCustomer 意向跟进对象
     */
    public void insertCrmVisitCustomer(CrmTaskCustomer crmTaskCustomer)
    {
        List<CrmVisitCustomer> crmVisitCustomerList = crmTaskCustomer.getCrmVisitCustomerList();
        Long custId = crmTaskCustomer.getCustId();
        if (StringUtils.isNotNull(crmVisitCustomerList))
        {
            List<CrmVisitCustomer> list = new ArrayList<CrmVisitCustomer>();
            for (CrmVisitCustomer crmVisitCustomer : crmVisitCustomerList)
            {
                crmVisitCustomer.setVisitCustId(custId);
                list.add(crmVisitCustomer);
            }
            if (list.size() > 0)
            {
                crmTaskCustomerMapper.batchCrmVisitCustomer(list);
            }
        }
    }
}
