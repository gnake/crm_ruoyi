package com.lzjtugrp2.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 任务计划&总结表
 * @TableName crm_task_review
 */
@Data
public class TaskReview implements Serializable {
    /**
     * 
     */
    private Long taskReviewId;

    /**
     * 任务周期定义(TASK_CYCLE) 关联
     */
    private Long tcId;

    /**
     * 销售人员
     */
    private String saleId;

    /**
     * 总结状态
     */
    private String taskReviewState;

    /**
     * 总结说明
     */
    private String taskReviewDesc;

    /**
     * 拜访总数
     */
    private Integer taskReviewVisitsTotal;

    /**
     * 陌生拜访记录
     */
    private Integer taskReviewStrange;

    /**
     * 回访拜访记录
     */
    private Integer taskReviewReturnvisit;

    /**
     * 新增意向客户
     */
    private Integer taskReviewNewIntencust;

    /**
     * 回访历史客户
     */
    private Integer taskReviewReturnvisitHist;

    /**
     * 流失客户
     */
    private Integer taskReviewLoss;

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
        TaskReview other = (TaskReview) that;
        return (this.getTaskReviewId() == null ? other.getTaskReviewId() == null : this.getTaskReviewId().equals(other.getTaskReviewId()))
            && (this.getTcId() == null ? other.getTcId() == null : this.getTcId().equals(other.getTcId()))
            && (this.getSaleId() == null ? other.getSaleId() == null : this.getSaleId().equals(other.getSaleId()))
            && (this.getTaskReviewState() == null ? other.getTaskReviewState() == null : this.getTaskReviewState().equals(other.getTaskReviewState()))
            && (this.getTaskReviewDesc() == null ? other.getTaskReviewDesc() == null : this.getTaskReviewDesc().equals(other.getTaskReviewDesc()))
            && (this.getTaskReviewVisitsTotal() == null ? other.getTaskReviewVisitsTotal() == null : this.getTaskReviewVisitsTotal().equals(other.getTaskReviewVisitsTotal()))
            && (this.getTaskReviewStrange() == null ? other.getTaskReviewStrange() == null : this.getTaskReviewStrange().equals(other.getTaskReviewStrange()))
            && (this.getTaskReviewReturnvisit() == null ? other.getTaskReviewReturnvisit() == null : this.getTaskReviewReturnvisit().equals(other.getTaskReviewReturnvisit()))
            && (this.getTaskReviewNewIntencust() == null ? other.getTaskReviewNewIntencust() == null : this.getTaskReviewNewIntencust().equals(other.getTaskReviewNewIntencust()))
            && (this.getTaskReviewReturnvisitHist() == null ? other.getTaskReviewReturnvisitHist() == null : this.getTaskReviewReturnvisitHist().equals(other.getTaskReviewReturnvisitHist()))
            && (this.getTaskReviewLoss() == null ? other.getTaskReviewLoss() == null : this.getTaskReviewLoss().equals(other.getTaskReviewLoss()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskReviewId() == null) ? 0 : getTaskReviewId().hashCode());
        result = prime * result + ((getTcId() == null) ? 0 : getTcId().hashCode());
        result = prime * result + ((getSaleId() == null) ? 0 : getSaleId().hashCode());
        result = prime * result + ((getTaskReviewState() == null) ? 0 : getTaskReviewState().hashCode());
        result = prime * result + ((getTaskReviewDesc() == null) ? 0 : getTaskReviewDesc().hashCode());
        result = prime * result + ((getTaskReviewVisitsTotal() == null) ? 0 : getTaskReviewVisitsTotal().hashCode());
        result = prime * result + ((getTaskReviewStrange() == null) ? 0 : getTaskReviewStrange().hashCode());
        result = prime * result + ((getTaskReviewReturnvisit() == null) ? 0 : getTaskReviewReturnvisit().hashCode());
        result = prime * result + ((getTaskReviewNewIntencust() == null) ? 0 : getTaskReviewNewIntencust().hashCode());
        result = prime * result + ((getTaskReviewReturnvisitHist() == null) ? 0 : getTaskReviewReturnvisitHist().hashCode());
        result = prime * result + ((getTaskReviewLoss() == null) ? 0 : getTaskReviewLoss().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskReviewId=").append(taskReviewId);
        sb.append(", tcId=").append(tcId);
        sb.append(", saleId=").append(saleId);
        sb.append(", taskReviewState=").append(taskReviewState);
        sb.append(", taskReviewDesc=").append(taskReviewDesc);
        sb.append(", taskReviewVisitsTotal=").append(taskReviewVisitsTotal);
        sb.append(", taskReviewStrange=").append(taskReviewStrange);
        sb.append(", taskReviewReturnvisit=").append(taskReviewReturnvisit);
        sb.append(", taskReviewNewIntencust=").append(taskReviewNewIntencust);
        sb.append(", taskReviewReturnvisitHist=").append(taskReviewReturnvisitHist);
        sb.append(", taskReviewLoss=").append(taskReviewLoss);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}