package com.lzjtugrp2.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 客户分组表
 * @TableName crm_customer_group
 */
@Data
public class CustomerGroup implements Serializable {
    /**
     * 分组ID
     */
    private Long grpId;

    /**
     * 上级ID
     */
    private Long grpSupId;

    /**
     * 编码
     */
    private String grpCode;

    /**
     * 名称
     */
    private String grpName;

    /**
     * 排序
     */
    private Integer grpSort;

    /**
     * 状态
     */
    private String grpState;

    /**
     * 描述
     */
    private String grpDesc;

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
        CustomerGroup other = (CustomerGroup) that;
        return (this.getGrpId() == null ? other.getGrpId() == null : this.getGrpId().equals(other.getGrpId()))
            && (this.getGrpSupId() == null ? other.getGrpSupId() == null : this.getGrpSupId().equals(other.getGrpSupId()))
            && (this.getGrpCode() == null ? other.getGrpCode() == null : this.getGrpCode().equals(other.getGrpCode()))
            && (this.getGrpName() == null ? other.getGrpName() == null : this.getGrpName().equals(other.getGrpName()))
            && (this.getGrpSort() == null ? other.getGrpSort() == null : this.getGrpSort().equals(other.getGrpSort()))
            && (this.getGrpState() == null ? other.getGrpState() == null : this.getGrpState().equals(other.getGrpState()))
            && (this.getGrpDesc() == null ? other.getGrpDesc() == null : this.getGrpDesc().equals(other.getGrpDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGrpId() == null) ? 0 : getGrpId().hashCode());
        result = prime * result + ((getGrpSupId() == null) ? 0 : getGrpSupId().hashCode());
        result = prime * result + ((getGrpCode() == null) ? 0 : getGrpCode().hashCode());
        result = prime * result + ((getGrpName() == null) ? 0 : getGrpName().hashCode());
        result = prime * result + ((getGrpSort() == null) ? 0 : getGrpSort().hashCode());
        result = prime * result + ((getGrpState() == null) ? 0 : getGrpState().hashCode());
        result = prime * result + ((getGrpDesc() == null) ? 0 : getGrpDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grpId=").append(grpId);
        sb.append(", grpSupId=").append(grpSupId);
        sb.append(", grpCode=").append(grpCode);
        sb.append(", grpName=").append(grpName);
        sb.append(", grpSort=").append(grpSort);
        sb.append(", grpState=").append(grpState);
        sb.append(", grpDesc=").append(grpDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}