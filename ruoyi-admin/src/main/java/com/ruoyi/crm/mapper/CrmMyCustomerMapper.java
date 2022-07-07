package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.CrmMyCustomer;
import com.ruoyi.crm.domain.CrmVisit;

/**
 * 我的客户Mapper接口
 * 
 * @author tkh
 * @date 2022-07-07
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
    int deleteCrmVisitByVisitCustIds(String[] custIds);
    
    /**
     * 批量新增我的客户
     * 
     * @param crmVisitList 我的客户列表
     * @return 结果
     */
    int batchCrmVisit(List<CrmVisit> crmVisitList);
    

    /**
     * 通过我的客户主键删除我的客户信息
     * 
     * @param custId 我的客户ID
     * @return 结果
     */
    int deleteCrmVisitByVisitCustId(Long custId);
}