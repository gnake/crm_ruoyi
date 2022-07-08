package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.CrmVisitCustomer;
import com.ruoyi.crm.mapper.CrmMyCustomerMapper;
import com.ruoyi.crm.domain.CrmMyCustomer;
import com.ruoyi.crm.service.ICrmMyCustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 我的客户Service业务层处理
 * 
 * @author 童楷涵
 * @date 2022-07-08
 */
@Service
public class CrmMyCustomerServiceImpl implements ICrmMyCustomerService 
{
    @Autowired
    private CrmMyCustomerMapper crmMyCustomerMapper;

    /**
     * 查询我的客户
     * 
     * @param custId 我的客户主键
     * @return 我的客户
     */
    @Override
    public CrmMyCustomer selectCrmMyCustomerByCustId(Long custId)
    {
        return crmMyCustomerMapper.selectCrmMyCustomerByCustId(custId);
    }

    /**
     * 查询我的客户列表
     * 
     * @param crmMyCustomer 我的客户
     * @return 我的客户
     */
    @Override
    public List<CrmMyCustomer> selectCrmMyCustomerList(CrmMyCustomer crmMyCustomer)
    {
        return crmMyCustomerMapper.selectCrmMyCustomerList(crmMyCustomer);
    }

    /**
     * 新增我的客户
     * 
     * @param crmMyCustomer 我的客户
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCrmMyCustomer(CrmMyCustomer crmMyCustomer)
    {
        int rows = crmMyCustomerMapper.insertCrmMyCustomer(crmMyCustomer);
        insertCrmVisitCustomer(crmMyCustomer);
        return rows;
    }

    /**
     * 修改我的客户
     * 
     * @param crmMyCustomer 我的客户
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCrmMyCustomer(CrmMyCustomer crmMyCustomer)
    {
        crmMyCustomerMapper.deleteCrmVisitCustomerByVisitCustId(crmMyCustomer.getCustId());
        insertCrmVisitCustomer(crmMyCustomer);
        return crmMyCustomerMapper.updateCrmMyCustomer(crmMyCustomer);
    }

    /**
     * 批量删除我的客户
     * 
     * @param custIds 需要删除的我的客户主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCrmMyCustomerByCustIds(String custIds)
    {
        crmMyCustomerMapper.deleteCrmVisitCustomerByVisitCustIds(Convert.toStrArray(custIds));
        return crmMyCustomerMapper.deleteCrmMyCustomerByCustIds(Convert.toStrArray(custIds));
    }

    /**
     * 删除我的客户信息
     * 
     * @param custId 我的客户主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCrmMyCustomerByCustId(Long custId)
    {
        crmMyCustomerMapper.deleteCrmVisitCustomerByVisitCustId(custId);
        return crmMyCustomerMapper.deleteCrmMyCustomerByCustId(custId);
    }

    /**
     * 新增我的客户信息
     * 
     * @param crmMyCustomer 我的客户对象
     */
    public void insertCrmVisitCustomer(CrmMyCustomer crmMyCustomer)
    {
        List<CrmVisitCustomer> crmVisitCustomerList = crmMyCustomer.getCrmVisitCustomerList();
        Long custId = crmMyCustomer.getCustId();
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
                crmMyCustomerMapper.batchCrmVisitCustomer(list);
            }
        }
    }
}
