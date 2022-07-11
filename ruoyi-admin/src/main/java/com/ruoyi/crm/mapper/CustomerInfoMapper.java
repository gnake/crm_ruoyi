package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.CustomerInfo;

/**
 * 客户信息Mapper接口
 * 
 * @author 李泽楷
 * @date 2022-07-11
 */
public interface CustomerInfoMapper 
{
    /**
     * 查询客户信息
     * 
     * @param custId 客户信息主键
     * @return 客户信息
     */
        CustomerInfo selectCustomerInfoByCustId(String custId);

    /**
     * 查询客户信息列表
     * 
     * @param customerInfo 客户信息
     * @return 客户信息集合
     */
    List<CustomerInfo> selectCustomerInfoList(CustomerInfo customerInfo);

    /**
     * 新增客户信息
     * 
     * @param customerInfo 客户信息
     * @return 结果
     */
    int insertCustomerInfo(CustomerInfo customerInfo);

    /**
     * 修改客户信息
     * 
     * @param customerInfo 客户信息
     * @return 结果
     */
    int updateCustomerInfo(CustomerInfo customerInfo);

    /**
     * 删除客户信息
     * 
     * @param custId 客户信息主键
     * @return 结果
     */
    int deleteCustomerInfoByCustId(String custId);

    /**
     * 批量删除客户信息
     * 
     * @param custIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCustomerInfoByCustIds(String[] custIds);
}
