package com.lzjtugrp2.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务周期定义表
 * @TableName crm_task_cycle
 */
@Data
public class TaskCycle implements Serializable {
    /**
     * 
     */
    private Long tcId;

    /**
     * 起始日期
     */
    private Date tcBegin;

    /**
     * 结束日期
     */
    private Date tcEnd;

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
        TaskCycle other = (TaskCycle) that;
        return (this.getTcId() == null ? other.getTcId() == null : this.getTcId().equals(other.getTcId()))
            && (this.getTcBegin() == null ? other.getTcBegin() == null : this.getTcBegin().equals(other.getTcBegin()))
            && (this.getTcEnd() == null ? other.getTcEnd() == null : this.getTcEnd().equals(other.getTcEnd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTcId() == null) ? 0 : getTcId().hashCode());
        result = prime * result + ((getTcBegin() == null) ? 0 : getTcBegin().hashCode());
        result = prime * result + ((getTcEnd() == null) ? 0 : getTcEnd().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tcId=").append(tcId);
        sb.append(", tcBegin=").append(tcBegin);
        sb.append(", tcEnd=").append(tcEnd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}