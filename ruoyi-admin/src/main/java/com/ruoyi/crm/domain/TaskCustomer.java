package com.ruoyi.crm.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 意向跟进对象 MY_TASKS
 * 
 * @author swj
 * @date 2022-07-10
 */
public class TaskCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long taskId;

    /** 潜在客户(ORG_INFO) 关联 */
    private Long orgId;

    /** 客户管理(CUSTOMER_INFO) 关联 */
    @Excel(name = "客户管理(CUSTOMER_INFO) 关联")
    private Long custId;

    /** 任务计划&总结(TASK_REVIEW) 关联 */
    private Long taskReviewId;

    /** 销售人员 */
    private Long saleId;

    /** 跟进状态 */
    @Excel(name = "跟进状态")
    private String taskFollowState;

    /** 任务类别 */
    private String taskClass;

    /** 创建任务时间 */
    private Date taskCreateTime;

    /** 任务完成时间 */
    private Date taskFinishTime;

    /** 客户状态 */
    private String taskCustState;

    /** 意向跟进信息 */
    private List<MyCustomer> myCustomerList;

    public void setTaskId(Long taskId) 
    {
        this.taskId = taskId;
    }

    public Long getTaskId() 
    {
        return taskId;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setCustId(Long custId) 
    {
        this.custId = custId;
    }

    public Long getCustId() 
    {
        return custId;
    }
    public void setTaskReviewId(Long taskReviewId) 
    {
        this.taskReviewId = taskReviewId;
    }

    public Long getTaskReviewId() 
    {
        return taskReviewId;
    }
    public void setSaleId(Long saleId) 
    {
        this.saleId = saleId;
    }

    public Long getSaleId() 
    {
        return saleId;
    }
    public void setTaskFollowState(String taskFollowState) 
    {
        this.taskFollowState = taskFollowState;
    }

    public String getTaskFollowState() 
    {
        return taskFollowState;
    }
    public void setTaskClass(String taskClass) 
    {
        this.taskClass = taskClass;
    }

    public String getTaskClass() 
    {
        return taskClass;
    }
    public void setTaskCreateTime(Date taskCreateTime) 
    {
        this.taskCreateTime = taskCreateTime;
    }

    public Date getTaskCreateTime() 
    {
        return taskCreateTime;
    }
    public void setTaskFinishTime(Date taskFinishTime) 
    {
        this.taskFinishTime = taskFinishTime;
    }

    public Date getTaskFinishTime() 
    {
        return taskFinishTime;
    }
    public void setTaskCustState(String taskCustState) 
    {
        this.taskCustState = taskCustState;
    }

    public String getTaskCustState() 
    {
        return taskCustState;
    }

    public List<MyCustomer> getMyCustomerList()
    {
        return myCustomerList;
    }

    public void setMyCustomerList(List<MyCustomer> myCustomerList)
    {
        this.myCustomerList = myCustomerList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskId", getTaskId())
            .append("orgId", getOrgId())
            .append("custId", getCustId())
            .append("taskReviewId", getTaskReviewId())
            .append("saleId", getSaleId())
            .append("taskFollowState", getTaskFollowState())
            .append("taskClass", getTaskClass())
            .append("taskCreateTime", getTaskCreateTime())
            .append("taskFinishTime", getTaskFinishTime())
            .append("taskCustState", getTaskCustState())
            .append("myCustomerList", getMyCustomerList())
            .toString();
    }
}
