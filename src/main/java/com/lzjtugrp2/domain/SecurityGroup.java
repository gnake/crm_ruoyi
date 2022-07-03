package com.lzjtugrp2.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 组织部门表
 * @TableName crm_security_group
 */
@Data
public class SecurityGroup implements Serializable {
    /**
     * 组织ID
     */
    private Long grpId;

    /**
     * 组织编码
     */
    private String grpCode;

    /**
     * 组织名
     */
    private String grpName;

    /**
     * 组织父ID
     */
    private Long grpPid;

    /**
     * 组织描述
     */
    private String grpDesc;

    /**
     * 组织状态
     */
    private Integer grpState;

    /**
     * 组织排序
     */
    private Integer grpSort;

    /**
     * 组织类型
     */
    private String grpType;

    /**
     * 组织等级
     */
    private String grpRank;

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
        SecurityGroup other = (SecurityGroup) that;
        return (this.getGrpId() == null ? other.getGrpId() == null : this.getGrpId().equals(other.getGrpId()))
            && (this.getGrpCode() == null ? other.getGrpCode() == null : this.getGrpCode().equals(other.getGrpCode()))
            && (this.getGrpName() == null ? other.getGrpName() == null : this.getGrpName().equals(other.getGrpName()))
            && (this.getGrpPid() == null ? other.getGrpPid() == null : this.getGrpPid().equals(other.getGrpPid()))
            && (this.getGrpDesc() == null ? other.getGrpDesc() == null : this.getGrpDesc().equals(other.getGrpDesc()))
            && (this.getGrpState() == null ? other.getGrpState() == null : this.getGrpState().equals(other.getGrpState()))
            && (this.getGrpSort() == null ? other.getGrpSort() == null : this.getGrpSort().equals(other.getGrpSort()))
            && (this.getGrpType() == null ? other.getGrpType() == null : this.getGrpType().equals(other.getGrpType()))
            && (this.getGrpRank() == null ? other.getGrpRank() == null : this.getGrpRank().equals(other.getGrpRank()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGrpId() == null) ? 0 : getGrpId().hashCode());
        result = prime * result + ((getGrpCode() == null) ? 0 : getGrpCode().hashCode());
        result = prime * result + ((getGrpName() == null) ? 0 : getGrpName().hashCode());
        result = prime * result + ((getGrpPid() == null) ? 0 : getGrpPid().hashCode());
        result = prime * result + ((getGrpDesc() == null) ? 0 : getGrpDesc().hashCode());
        result = prime * result + ((getGrpState() == null) ? 0 : getGrpState().hashCode());
        result = prime * result + ((getGrpSort() == null) ? 0 : getGrpSort().hashCode());
        result = prime * result + ((getGrpType() == null) ? 0 : getGrpType().hashCode());
        result = prime * result + ((getGrpRank() == null) ? 0 : getGrpRank().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grpId=").append(grpId);
        sb.append(", grpCode=").append(grpCode);
        sb.append(", grpName=").append(grpName);
        sb.append(", grpPid=").append(grpPid);
        sb.append(", grpDesc=").append(grpDesc);
        sb.append(", grpState=").append(grpState);
        sb.append(", grpSort=").append(grpSort);
        sb.append(", grpType=").append(grpType);
        sb.append(", grpRank=").append(grpRank);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}