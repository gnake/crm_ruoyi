package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.CustomerInfo;
import com.ruoyi.system.mapper.CustomerInfoMapper;
import com.ruoyi.system.service.ICustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CustomerInfoMapper;
import com.ruoyi.system.domain.CustomerInfo;
import com.ruoyi.system.service.ICustomerInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-06
 */
@Service
public class CustomerInfoServiceImpl implements ICustomerInfoService
{
    @Autowired
    private CustomerInfoMapper customerInfoMapper;

    /**
     * 查询客户管理
     * 
     * @param custId 客户管理主键
     * @return 客户管理
     */
    @Override
    public CustomerInfo selectCustomerInfoByCustId(Long custId)
    {
        return customerInfoMapper.selectCustomerInfoByCustId(custId);
    }

    /**
     * 查询客户管理列表
     * 
     * @param customerInfo 客户管理
     * @return 客户管理
     */
    @Override
    public List<CustomerInfo> selectCustomerInfoList(CustomerInfo customerInfo)
    {
        return customerInfoMapper.selectCustomerInfoList(customerInfo);
    }

    /**
     * 新增客户管理
     * 
     * @param customerInfo 客户管理
     * @return 结果
     */
    @Override
    public int insertCustomerInfo(CustomerInfo customerInfo)
    {
        return customerInfoMapper.insertCustomerInfo(customerInfo);
    }

    /**
     * 修改客户管理
     * 
     * @param customerInfo 客户管理
     * @return 结果
     */
    @Override
    public int updateCustomerInfo(CustomerInfo customerInfo)
    {
        return customerInfoMapper.updateCustomerInfo(customerInfo);
    }

    /**
     * 批量删除客户管理
     * 
     * @param custIds 需要删除的客户管理主键
     * @return 结果
     */
    @Override
    public int deleteCustomerInfoByCustIds(String custIds)
    {
        return customerInfoMapper.deleteCustomerInfoByCustIds(Convert.toStrArray(custIds));
    }

    /**
     * 删除客户管理信息
     * 
     * @param custId 客户管理主键
     * @return 结果
     */
    @Override
    public int deleteCustomerInfoByCustId(Long custId)
    {
        return customerInfoMapper.deleteCustomerInfoByCustId(custId);
    }
}
