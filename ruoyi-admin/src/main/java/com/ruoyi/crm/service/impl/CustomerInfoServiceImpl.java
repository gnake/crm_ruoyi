package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.CustomerInfoMapper;
import com.ruoyi.crm.domain.CustomerInfo;
import com.ruoyi.crm.service.ICustomerInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户信息Service业务层处理
 * 
 * @author 李泽楷
 * @date 2022-07-07
 */
@Service
public class CustomerInfoServiceImpl implements ICustomerInfoService 
{
    @Autowired
    private CustomerInfoMapper customerInfoMapper;

    /**
     * 查询客户信息
     * 
     * @param custId 客户信息主键
     * @return 客户信息
     */
    @Override
    public CustomerInfo selectCustomerInfoByCustId(Long custId)
    {
        return customerInfoMapper.selectCustomerInfoByCustId(custId);
    }

    /**
     * 查询客户信息列表
     * 
     * @param customerInfo 客户信息
     * @return 客户信息
     */
    @Override
    public List<CustomerInfo> selectCustomerInfoList(CustomerInfo customerInfo)
    {
        return customerInfoMapper.selectCustomerInfoList(customerInfo);
    }

    /**
     * 新增客户信息
     * 
     * @param customerInfo 客户信息
     * @return 结果
     */
    @Override
    public int insertCustomerInfo(CustomerInfo customerInfo)
    {
        return customerInfoMapper.insertCustomerInfo(customerInfo);
    }

    /**
     * 修改客户信息
     * 
     * @param customerInfo 客户信息
     * @return 结果
     */
    @Override
    public int updateCustomerInfo(CustomerInfo customerInfo)
    {
        return customerInfoMapper.updateCustomerInfo(customerInfo);
    }

    /**
     * 批量删除客户信息
     * 
     * @param custIds 需要删除的客户信息主键
     * @return 结果
     */
    @Override
    public int deleteCustomerInfoByCustIds(String custIds)
    {
        return customerInfoMapper.deleteCustomerInfoByCustIds(Convert.toStrArray(custIds));
    }

    /**
     * 删除客户信息信息
     * 
     * @param custId 客户信息主键
     * @return 结果
     */
    @Override
    public int deleteCustomerInfoByCustId(Long custId)
    {
        return customerInfoMapper.deleteCustomerInfoByCustId(custId);
    }
}
