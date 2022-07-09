package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.Customer_Intention;

/**
 * 意向跟进Mapper接口
 * 
 * @author 高国文
 * @date 2022-07-09
 */
public interface Customer_IntentionMapper 
{
    /**
     * 查询意向跟进
     * 
     * @param custId 意向跟进主键
     * @return 意向跟进
     */
        Customer_Intention selectCustomer_IntentionByCustId(Long custId);

    /**
     * 查询意向跟进列表
     * 
     * @param customer_Intention 意向跟进
     * @return 意向跟进集合
     */
    List<Customer_Intention> selectCustomer_IntentionList(Customer_Intention customer_Intention);

    /**
     * 新增意向跟进
     * 
     * @param customer_Intention 意向跟进
     * @return 结果
     */
    int insertCustomer_Intention(Customer_Intention customer_Intention);

    /**
     * 修改意向跟进
     * 
     * @param customer_Intention 意向跟进
     * @return 结果
     */
    int updateCustomer_Intention(Customer_Intention customer_Intention);

    /**
     * 删除意向跟进
     * 
     * @param custId 意向跟进主键
     * @return 结果
     */
    int deleteCustomer_IntentionByCustId(Long custId);

    /**
     * 批量删除意向跟进
     * 
     * @param custIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCustomer_IntentionByCustIds(String[] custIds);
}
