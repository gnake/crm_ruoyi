package com.lzjtugrp2.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统日志表
 * @TableName crm_sys_log
 */
@Data
public class SysLog implements Serializable {
    /**
     * 主键
     */
    private Long sysId;

    /**
     * 操作时间
     */
    private Date operTime;

    /**
     * 所在地址
     */
    private String ipAddtress;

    /**
     * 用户表示
     */
    private Long userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 功能名称
     */
    private String funcName;

    /**
     * 操作类型
     */
    private String actionType;

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
        SysLog other = (SysLog) that;
        return (this.getSysId() == null ? other.getSysId() == null : this.getSysId().equals(other.getSysId()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getIpAddtress() == null ? other.getIpAddtress() == null : this.getIpAddtress().equals(other.getIpAddtress()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getFuncName() == null ? other.getFuncName() == null : this.getFuncName().equals(other.getFuncName()))
            && (this.getActionType() == null ? other.getActionType() == null : this.getActionType().equals(other.getActionType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSysId() == null) ? 0 : getSysId().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getIpAddtress() == null) ? 0 : getIpAddtress().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getFuncName() == null) ? 0 : getFuncName().hashCode());
        result = prime * result + ((getActionType() == null) ? 0 : getActionType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysId=").append(sysId);
        sb.append(", operTime=").append(operTime);
        sb.append(", ipAddtress=").append(ipAddtress);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", funcName=").append(funcName);
        sb.append(", actionType=").append(actionType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}