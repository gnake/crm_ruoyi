package com.lzjtugrp2.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 我的任务细项表
 * @TableName crm_my_tasks
 */
@Data
public class MyTasks implements Serializable {
    /**
     * 
     */
    private Long taskId;

    /**
     * 潜在客户(ORG_INFO) 关联
     */
    private Long orgId;

    /**
     * 客户管理(CUSTOMER_INFO) 关联
     */
    private Long custId;

    /**
     * 任务计划&总结(TASK_REVIEW) 关联
     */
    private Long taskReviewId;

    /**
     * 销售人员
     */
    private Long saleId;

    /**
     * 跟进状态
     */
    private String taskFollowState;

    /**
     * 任务类别
     */
    private String taskClass;

    /**
     * 创建任务时间
     */
    private Date taskCreateTime;

    /**
     * 任务完成时间
     */
    private Date taskFinishTime;

    /**
     * 客户状态
     */
    private String taskCustState;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MyTasks other = (MyTasks) that;
        return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getTaskReviewId() == null ? other.getTaskReviewId() == null : this.getTaskReviewId().equals(other.getTaskReviewId()))
            && (this.getSaleId() == null ? other.getSaleId() == null : this.getSaleId().equals(other.getSaleId()))
            && (this.getTaskFollowState() == null ? other.getTaskFollowState() == null : this.getTaskFollowState().equals(other.getTaskFollowState()))
            && (this.getTaskClass() == null ? other.getTaskClass() == null : this.getTaskClass().equals(other.getTaskClass()))
            && (this.getTaskCreateTime() == null ? other.getTaskCreateTime() == null : this.getTaskCreateTime().equals(other.getTaskCreateTime()))
            && (this.getTaskFinishTime() == null ? other.getTaskFinishTime() == null : this.getTaskFinishTime().equals(other.getTaskFinishTime()))
            && (this.getTaskCustState() == null ? other.getTaskCustState() == null : this.getTaskCustState().equals(other.getTaskCustState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getTaskReviewId() == null) ? 0 : getTaskReviewId().hashCode());
        result = prime * result + ((getSaleId() == null) ? 0 : getSaleId().hashCode());
        result = prime * result + ((getTaskFollowState() == null) ? 0 : getTaskFollowState().hashCode());
        result = prime * result + ((getTaskClass() == null) ? 0 : getTaskClass().hashCode());
        result = prime * result + ((getTaskCreateTime() == null) ? 0 : getTaskCreateTime().hashCode());
        result = prime * result + ((getTaskFinishTime() == null) ? 0 : getTaskFinishTime().hashCode());
        result = prime * result + ((getTaskCustState() == null) ? 0 : getTaskCustState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskId=").append(taskId);
        sb.append(", orgId=").append(orgId);
        sb.append(", custId=").append(custId);
        sb.append(", taskReviewId=").append(taskReviewId);
        sb.append(", saleId=").append(saleId);
        sb.append(", taskFollowState=").append(taskFollowState);
        sb.append(", taskClass=").append(taskClass);
        sb.append(", taskCreateTime=").append(taskCreateTime);
        sb.append(", taskFinishTime=").append(taskFinishTime);
        sb.append(", taskCustState=").append(taskCustState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}