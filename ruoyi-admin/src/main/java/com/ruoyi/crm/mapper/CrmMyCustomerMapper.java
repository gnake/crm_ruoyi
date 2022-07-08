package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.CrmMyCustomer;
import com.ruoyi.crm.domain.CrmVisitCustomer;

/**
 * 我的客户Mapper接口
 * 
 * @author 童楷涵
 * @date 2022-07-08
 */
public interface CrmMyCustomerMapper 
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
     * 删除我的客户
     * 
     * @param custId 我的客户主键
     * @return 结果
     */
    int deleteCrmMyCustomerByCustId(Long custId);

    /**
     * 批量删除我的客户
     * 
     * @param custIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmMyCustomerByCustIds(String[] custIds);

    /**
     * 批量删除我的客户
     * 
     * @param custIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmVisitCustomerByVisitCustIds(String[] custIds);
    
    /**
     * 批量新增我的客户
     * 
     * @param crmVisitCustomerList 我的客户列表
     * @return 结果
     */
    int batchCrmVisitCustomer(List<CrmVisitCustomer> crmVisitCustomerList);
    

    /**
     * 通过我的客户主键删除我的客户信息
     * 
     * @param custId 我的客户ID
     * @return 结果
     */
    int deleteCrmVisitCustomerByVisitCustId(Long custId);
}
