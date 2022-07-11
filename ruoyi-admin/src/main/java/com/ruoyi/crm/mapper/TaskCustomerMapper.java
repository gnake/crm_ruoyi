package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.TaskCustomer;
import com.ruoyi.crm.domain.MyCustomer;

/**
 * 意向跟进Mapper接口
 * 
 * @author swj
 * @date 2022-07-10
 */
public interface TaskCustomerMapper 
{
    /**
     * 查询意向跟进
     * 
     * @param taskId 意向跟进主键
     * @return 意向跟进
     */
        TaskCustomer selectTaskCustomerByTaskId(Long taskId);

    /**
     * 查询意向跟进列表
     * 
     * @param taskCustomer 意向跟进
     * @return 意向跟进集合
     */
    List<TaskCustomer> selectTaskCustomerList(TaskCustomer taskCustomer);

    /**
     * 新增意向跟进
     * 
     * @param taskCustomer 意向跟进
     * @return 结果
     */
    int insertTaskCustomer(TaskCustomer taskCustomer);

    /**
     * 修改意向跟进
     * 
     * @param taskCustomer 意向跟进
     * @return 结果
     */
    int updateTaskCustomer(TaskCustomer taskCustomer);

    /**
     * 删除意向跟进
     * 
     * @param taskId 意向跟进主键
     * @return 结果
     */
    int deleteTaskCustomerByTaskId(Long taskId);

    /**
     * 批量删除意向跟进
     * 
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteTaskCustomerByTaskIds(String[] taskIds);

    /**
     * 批量删除意向跟进
     * 
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteMyCustomerByCustIds(String[] taskIds);
    
    /**
     * 批量新增意向跟进
     * 
     * @param myCustomerList 意向跟进列表
     * @return 结果
     */
    int batchMyCustomer(List<MyCustomer> myCustomerList);
    

    /**
     * 通过意向跟进主键删除意向跟进信息
     * 
     * @param taskId 意向跟进ID
     * @return 结果
     */
    int deleteMyCustomerByCustId(Long taskId);
}
