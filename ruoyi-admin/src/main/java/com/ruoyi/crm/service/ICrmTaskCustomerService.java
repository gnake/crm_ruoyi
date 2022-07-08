package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.CrmTaskCustomer;

/**
 * 意向跟进Service接口
 * 
 * @author swj
 * @date 2022-07-08
 */
public interface ICrmTaskCustomerService 
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
     * 批量删除意向跟进
     * 
     * @param custIds 需要删除的意向跟进主键集合
     * @return 结果
     */
    int deleteCrmTaskCustomerByCustIds(String custIds);

    /**
     * 删除意向跟进信息
     * 
     * @param custId 意向跟进主键
     * @return 结果
     */
    int deleteCrmTaskCustomerByCustId(Long custId);
}
