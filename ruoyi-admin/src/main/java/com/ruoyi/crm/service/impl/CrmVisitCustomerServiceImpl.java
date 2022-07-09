package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.MyCustomer;
import com.ruoyi.crm.mapper.CrmVisitCustomerMapper;
import com.ruoyi.crm.domain.CrmVisitCustomer;
import com.ruoyi.crm.service.ICrmVisitCustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 我的客户Service业务层处理
 * 
 * @author 童楷涵
 * @date 2022-07-09
 */
@Service
public class CrmVisitCustomerServiceImpl implements ICrmVisitCustomerService 
{
    @Autowired
    private CrmVisitCustomerMapper crmVisitCustomerMapper;

    /**
     * 查询我的客户
     * 
     * @param visitId 我的客户主键
     * @return 我的客户
     */
    @Override
    public CrmVisitCustomer selectCrmVisitCustomerByVisitId(Long visitId)
    {
        return crmVisitCustomerMapper.selectCrmVisitCustomerByVisitId(visitId);
    }

    /**
     * 查询我的客户列表
     * 
     * @param crmVisitCustomer 我的客户
     * @return 我的客户
     */
    @Override
    public List<CrmVisitCustomer> selectCrmVisitCustomerList(CrmVisitCustomer crmVisitCustomer)
    {
        return crmVisitCustomerMapper.selectCrmVisitCustomerList(crmVisitCustomer);
    }

    /**
     * 新增我的客户
     * 
     * @param crmVisitCustomer 我的客户
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCrmVisitCustomer(CrmVisitCustomer crmVisitCustomer)
    {
        int rows = crmVisitCustomerMapper.insertCrmVisitCustomer(crmVisitCustomer);
        insertMyCustomer(crmVisitCustomer);
        return rows;
    }

    /**
     * 修改我的客户
     * 
     * @param crmVisitCustomer 我的客户
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCrmVisitCustomer(CrmVisitCustomer crmVisitCustomer)
    {
        crmVisitCustomerMapper.deleteMyCustomerByCustId(crmVisitCustomer.getVisitId());
        insertMyCustomer(crmVisitCustomer);
        return crmVisitCustomerMapper.updateCrmVisitCustomer(crmVisitCustomer);
    }

    /**
     * 批量删除我的客户
     * 
     * @param visitIds 需要删除的我的客户主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCrmVisitCustomerByVisitIds(String visitIds)
    {
        crmVisitCustomerMapper.deleteMyCustomerByCustIds(Convert.toStrArray(visitIds));
        return crmVisitCustomerMapper.deleteCrmVisitCustomerByVisitIds(Convert.toStrArray(visitIds));
    }

    /**
     * 删除我的客户信息
     * 
     * @param visitId 我的客户主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCrmVisitCustomerByVisitId(Long visitId)
    {
        crmVisitCustomerMapper.deleteMyCustomerByCustId(visitId);
        return crmVisitCustomerMapper.deleteCrmVisitCustomerByVisitId(visitId);
    }

    /**
     * 新增意向跟进信息
     * 
     * @param crmVisitCustomer 我的客户对象
     */
    public void insertMyCustomer(CrmVisitCustomer crmVisitCustomer)
    {
        List<MyCustomer> myCustomerList = crmVisitCustomer.getMyCustomerList();
        Long visitId = crmVisitCustomer.getVisitId();
        if (StringUtils.isNotNull(myCustomerList))
        {
            List<MyCustomer> list = new ArrayList<MyCustomer>();
            for (MyCustomer myCustomer : myCustomerList)
            {
                myCustomer.setCustId(visitId);
                list.add(myCustomer);
            }
            if (list.size() > 0)
            {
                crmVisitCustomerMapper.batchMyCustomer(list);
            }
        }
    }
}
