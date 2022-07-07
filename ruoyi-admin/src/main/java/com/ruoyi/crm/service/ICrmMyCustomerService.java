package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.CrmMyCustomer;

/**
 * 我的客户Service接口
 * 
 * @author tkh
 * @date 2022-07-07
 */
public interface ICrmMyCustomerService 
{
    /**
     * 查询我的客户
     * 
     * @param custId 我的客户主键
     * @return 我的客户
     */
        CrmMyCustomer selectCrmMyCustomerByCustId(Long custId);

    /**
     * 查询我的客户列表
     * 
     * @param crmMyCustomer 我的客户
     * @return 我的客户集合
     */
    List<CrmMyCustomer> selectCrmMyCustomerList(CrmMyCustomer crmMyCustomer);

    /**
     * 新增我的客户
     * 
     * @param crmMyCustomer 我的客户
     * @return 结果
     */
    int insertCrmMyCustomer(CrmMyCustomer crmMyCustomer);

    /**
     * 修改我的客户
     * 
     * @param crmMyCustomer 我的客户
     * @return 结果
     */
    int updateCrmMyCustomer(CrmMyCustomer crmMyCustomer);

    /**
     * 批量删除我的客户
     * 
     * @param custIds 需要删除的我的客户主键集合
     * @return 结果
     */
    int deleteCrmMyCustomerByCustIds(String custIds);

    /**
     * 删除我的客户信息
     * 
     * @param custId 我的客户主键
     * @return 结果
     */
    int deleteCrmMyCustomerByCustId(Long custId);
}
