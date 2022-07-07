package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.crm.domain.CrmVisit;
import com.ruoyi.crm.mapper.SysMyCustomerMapper;
import com.ruoyi.crm.domain.SysMyCustomer;
import com.ruoyi.crm.service.ISysMyCustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 我的客户Service业务层处理
 * 
 * @author tkh
 * @date 2022-07-07
 */
@Service
public class SysMyCustomerServiceImpl implements ISysMyCustomerService 
{
    @Autowired
    private SysMyCustomerMapper sysMyCustomerMapper;

    /**
     * 查询我的客户
     * 
     * @param custId 我的客户主键
     * @return 我的客户
     */
    @Override
    public SysMyCustomer selectSysMyCustomerByCustId(Long custId)
    {
        return sysMyCustomerMapper.selectSysMyCustomerByCustId(custId);
    }

    /**
     * 查询我的客户列表
     * 
     * @param sysMyCustomer 我的客户
     * @return 我的客户
     */
    @Override
    public List<SysMyCustomer> selectSysMyCustomerList(SysMyCustomer sysMyCustomer)
    {
        return sysMyCustomerMapper.selectSysMyCustomerList(sysMyCustomer);
    }

    /**
     * 新增我的客户
     * 
     * @param sysMyCustomer 我的客户
     * @return 结果
     */
    @Transactional
    @Override
    public int insertSysMyCustomer(SysMyCustomer sysMyCustomer)
    {
        int rows = sysMyCustomerMapper.insertSysMyCustomer(sysMyCustomer);
        insertCrmVisit(sysMyCustomer);
        return rows;
    }

    /**
     * 修改我的客户
     * 
     * @param sysMyCustomer 我的客户
     * @return 结果
     */
    @Transactional
    @Override
    public int updateSysMyCustomer(SysMyCustomer sysMyCustomer)
    {
        sysMyCustomerMapper.deleteCrmVisitByVisitCustId(sysMyCustomer.getCustId());
        insertCrmVisit(sysMyCustomer);
        return sysMyCustomerMapper.updateSysMyCustomer(sysMyCustomer);
    }

    /**
     * 批量删除我的客户
     * 
     * @param custIds 需要删除的我的客户主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteSysMyCustomerByCustIds(String custIds)
    {
        sysMyCustomerMapper.deleteCrmVisitByVisitCustIds(Convert.toStrArray(custIds));
        return sysMyCustomerMapper.deleteSysMyCustomerByCustIds(Convert.toStrArray(custIds));
    }

    /**
     * 删除我的客户信息
     * 
     * @param custId 我的客户主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteSysMyCustomerByCustId(Long custId)
    {
        sysMyCustomerMapper.deleteCrmVisitByVisitCustId(custId);
        return sysMyCustomerMapper.deleteSysMyCustomerByCustId(custId);
    }

    /**
     * 新增我的客户信息
     * 
     * @param sysMyCustomer 我的客户对象
     */
    public void insertCrmVisit(SysMyCustomer sysMyCustomer)
    {
        List<CrmVisit> crmVisitList = sysMyCustomer.getCrmVisitList();
        Long custId = sysMyCustomer.getCustId();
        if (StringUtils.isNotNull(crmVisitList))
        {
            List<CrmVisit> list = new ArrayList<CrmVisit>();
            for (CrmVisit crmVisit : crmVisitList)
            {
                crmVisit.setVisitCustId(custId);
                list.add(crmVisit);
            }
            if (list.size() > 0)
            {
                sysMyCustomerMapper.batchCrmVisit(list);
            }
        }
    }
}
