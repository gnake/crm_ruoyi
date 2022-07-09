package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.CrmVisitCustomer;

/**
 * 我的客户Service接口
 * 
 * @author 童楷涵
 * @date 2022-07-09
 */
public interface ICrmVisitCustomerService 
{
    /**
     * 查询我的客户
     * 
     * @param visitId 我的客户主键
     * @return 我的客户
     */
        CrmVisitCustomer selectCrmVisitCustomerByVisitId(Long visitId);

    /**
     * 查询我的客户列表
     * 
     * @param crmVisitCustomer 我的客户
     * @return 我的客户集合
     */
    List<CrmVisitCustomer> selectCrmVisitCustomerList(CrmVisitCustomer crmVisitCustomer);

    /**
     * 新增我的客户
     * 
     * @param crmVisitCustomer 我的客户
     * @return 结果
     */
    int insertCrmVisitCustomer(CrmVisitCustomer crmVisitCustomer);

    /**
     * 修改我的客户
     * 
     * @param crmVisitCustomer 我的客户
     * @return 结果
     */
    int updateCrmVisitCustomer(CrmVisitCustomer crmVisitCustomer);

    /**
     * 批量删除我的客户
     * 
     * @param visitIds 需要删除的我的客户主键集合
     * @return 结果
     */
    int deleteCrmVisitCustomerByVisitIds(String visitIds);

    /**
     * 删除我的客户信息
     * 
     * @param visitId 我的客户主键
     * @return 结果
     */
    int deleteCrmVisitCustomerByVisitId(Long visitId);
}
