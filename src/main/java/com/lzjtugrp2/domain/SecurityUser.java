package com.lzjtugrp2.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 系统用户表
 * @TableName crm_security_user
 */
@Data
public class SecurityUser implements Serializable {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 密码
     */
    private String userPwd;

    /**
     * 性别
     */
    private Integer userSex;

    /**
     * 描述
     */
    private String userDesc;

    /**
     * 状态
     */
    private String userState;

    /**
     * 邮箱
     */
    private String userMail;

    /**
     * 排序
     */
    private Integer userSort;

    /**
     * 手机
     */
    private String userPhone;

    /**
     * 显示个数
     */
    private Integer displayCount;

    /**
     * 组织ID，关联SECURITY_GROUP
     */
    private Long grpId;

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
        SecurityUser other = (SecurityUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserCode() == null ? other.getUserCode() == null : this.getUserCode().equals(other.getUserCode()))
            && (this.getUserPwd() == null ? other.getUserPwd() == null : this.getUserPwd().equals(other.getUserPwd()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserDesc() == null ? other.getUserDesc() == null : this.getUserDesc().equals(other.getUserDesc()))
            && (this.getUserState() == null ? other.getUserState() == null : this.getUserState().equals(other.getUserState()))
            && (this.getUserMail() == null ? other.getUserMail() == null : this.getUserMail().equals(other.getUserMail()))
            && (this.getUserSort() == null ? other.getUserSort() == null : this.getUserSort().equals(other.getUserSort()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getDisplayCount() == null ? other.getDisplayCount() == null : this.getDisplayCount().equals(other.getDisplayCount()))
            && (this.getGrpId() == null ? other.getGrpId() == null : this.getGrpId().equals(other.getGrpId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        result = prime * result + ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserDesc() == null) ? 0 : getUserDesc().hashCode());
        result = prime * result + ((getUserState() == null) ? 0 : getUserState().hashCode());
        result = prime * result + ((getUserMail() == null) ? 0 : getUserMail().hashCode());
        result = prime * result + ((getUserSort() == null) ? 0 : getUserSort().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getDisplayCount() == null) ? 0 : getDisplayCount().hashCode());
        result = prime * result + ((getGrpId() == null) ? 0 : getGrpId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userCode=").append(userCode);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userSex=").append(userSex);
        sb.append(", userDesc=").append(userDesc);
        sb.append(", userState=").append(userState);
        sb.append(", userMail=").append(userMail);
        sb.append(", userSort=").append(userSort);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", displayCount=").append(displayCount);
        sb.append(", grpId=").append(grpId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}