package com.ruoyi.crm.service;

import com.ruoyi.crm.domain.CustomerInfo;

import java.util.List;

/**
 * 客户管理Service接口
 * 
 * @author 李泽楷
 * @date 2022-07-07
 */
public interface ICustomerInfoService 
{
    /**
     * 查询客户管理
     * 
     * @param custId 客户管理主键
     * @return 客户管理
     */
    public CustomerInfo selectCustomerInfoByCustId(Long custId);

    /**
     * 查询客户管理列表
     * 
     * @param customerInfo 客户管理
     * @return 客户管理集合
     */
    public List<CustomerInfo> selectCustomerInfoList(CustomerInfo customerInfo);

    /**
     * 新增客户管理
     * 
     * @param customerInfo 客户管理
     * @return 结果
     */
    public int insertCustomerInfo(CustomerInfo customerInfo);

    /**
     * 修改客户管理
     * 
     * @param customerInfo 客户管理
     * @return 结果
     */
    public int updateCustomerInfo(CustomerInfo customerInfo);

    /**
     * 批量删除客户管理
     * 
     * @param custIds 需要删除的客户管理主键集合
     * @return 结果
     */
    public int deleteCustomerInfoByCustIds(String custIds);

    /**
     * 删除客户管理信息
     * 
     * @param custId 客户管理主键
     * @return 结果
     */
    public int deleteCustomerInfoByCustId(Long custId);
}
