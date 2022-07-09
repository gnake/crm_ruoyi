package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.Customer_IntentionMapper;
import com.ruoyi.crm.domain.Customer_Intention;
import com.ruoyi.crm.service.ICustomer_IntentionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 意向跟进Service业务层处理
 * 
 * @author 高国文
 * @date 2022-07-09
 */
@Service
public class Customer_IntentionServiceImpl implements ICustomer_IntentionService 
{
    @Autowired
    private Customer_IntentionMapper customer_IntentionMapper;

    /**
     * 查询意向跟进
     * 
     * @param custId 意向跟进主键
     * @return 意向跟进
     */
    @Override
    public Customer_Intention selectCustomer_IntentionByCustId(Long custId)
    {
        return customer_IntentionMapper.selectCustomer_IntentionByCustId(custId);
    }

    /**
     * 查询意向跟进列表
     * 
     * @param customer_Intention 意向跟进
     * @return 意向跟进
     */
    @Override
    public List<Customer_Intention> selectCustomer_IntentionList(Customer_Intention customer_Intention)
    {
        return customer_IntentionMapper.selectCustomer_IntentionList(customer_Intention);
    }

    /**
     * 新增意向跟进
     * 
     * @param customer_Intention 意向跟进
     * @return 结果
     */
    @Override
    public int insertCustomer_Intention(Customer_Intention customer_Intention)
    {
        return customer_IntentionMapper.insertCustomer_Intention(customer_Intention);
    }

    /**
     * 修改意向跟进
     * 
     * @param customer_Intention 意向跟进
     * @return 结果
     */
    @Override
    public int updateCustomer_Intention(Customer_Intention customer_Intention)
    {
        return customer_IntentionMapper.updateCustomer_Intention(customer_Intention);
    }

    /**
     * 批量删除意向跟进
     * 
     * @param custIds 需要删除的意向跟进主键
     * @return 结果
     */
    @Override
    public int deleteCustomer_IntentionByCustIds(String custIds)
    {
        return customer_IntentionMapper.deleteCustomer_IntentionByCustIds(Convert.toStrArray(custIds));
    }

    /**
     * 删除意向跟进信息
     * 
     * @param custId 意向跟进主键
     * @return 结果
     */
    @Override
    public int deleteCustomer_IntentionByCustId(Long custId)
    {
        return customer_IntentionMapper.deleteCustomer_IntentionByCustId(custId);
    }
}
