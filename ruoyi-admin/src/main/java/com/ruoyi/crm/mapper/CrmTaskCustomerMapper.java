package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.CrmTaskCustomer;
import com.ruoyi.crm.domain.CrmVisitCustomer;

/**
 * 意向跟进Mapper接口
 * 
 * @author swj
 * @date 2022-07-08
 */
public interface CrmTaskCustomerMapper 
{
    /**
     * 查询意向跟进
     * 
     * @param custId 意向跟进主键
     * @return 意向跟进
     */
        CrmTaskCustomer selectCrmTaskCustomerByCustId(Long custId);

    /**
     * 查询意向跟进列表
     * 
     * @param crmTaskCustomer 意向跟进
     * @return 意向跟进集合
     */
    List<CrmTaskCustomer> selectCrmTaskCustomerList(CrmTaskCustomer crmTaskCustomer);

    /**
     * 新增意向跟进
     * 
     * @param crmTaskCustomer 意向跟进
     * @return 结果
     */
    int insertCrmTaskCustomer(CrmTaskCustomer crmTaskCustomer);

    /**
     * 修改意向跟进
     * 
     * @param crmTaskCustomer 意向跟进
     * @return 结果
     */
    int updateCrmTaskCustomer(CrmTaskCustomer crmTaskCustomer);

    /**
     * 删除意向跟进
     * 
     * @param custId 意向跟进主键
     * @return 结果
     */
    int deleteCrmTaskCustomerByCustId(Long custId);

    /**
     * 批量删除意向跟进
     * 
     * @param custIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmTaskCustomerByCustIds(String[] custIds);

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
     * 通过意向跟进主键删除我的客户信息
     * 
     * @param custId 意向跟进ID
     * @return 结果
     */
    int deleteCrmVisitCustomerByVisitCustId(Long custId);
}
