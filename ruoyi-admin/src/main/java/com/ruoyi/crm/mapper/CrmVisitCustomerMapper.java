package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.CrmVisitCustomer;
import com.ruoyi.crm.domain.MyCustomer;

/**
 * 我的客户Mapper接口
 * 
 * @author 童楷涵
 * @date 2022-07-09
 */
public interface CrmVisitCustomerMapper 
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
     * 删除我的客户
     * 
     * @param visitId 我的客户主键
     * @return 结果
     */
    int deleteCrmVisitCustomerByVisitId(Long visitId);

    /**
     * 批量删除我的客户
     * 
     * @param visitIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCrmVisitCustomerByVisitIds(String[] visitIds);

    /**
     * 批量删除意向跟进
     * 
     * @param visitIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteMyCustomerByCustIds(String[] visitIds);
    
    /**
     * 批量新增意向跟进
     * 
     * @param myCustomerList 意向跟进列表
     * @return 结果
     */
    int batchMyCustomer(List<MyCustomer> myCustomerList);
    

    /**
     * 通过我的客户主键删除意向跟进信息
     * 
     * @param visitId 我的客户ID
     * @return 结果
     */
    int deleteMyCustomerByCustId(Long visitId);
}
