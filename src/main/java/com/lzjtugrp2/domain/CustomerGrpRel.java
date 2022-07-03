package com.lzjtugrp2.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 分组跟客户关联表
 * @TableName crm_customer_grp_rel
 */
@Data
public class CustomerGrpRel implements Serializable {
    /**
     * 
     */
    private Long grpId;

    /**
     * 
     */
    private Long custId;

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
        CustomerGrpRel other = (CustomerGrpRel) that;
        return (this.getGrpId() == null ? other.getGrpId() == null : this.getGrpId().equals(other.getGrpId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGrpId() == null) ? 0 : getGrpId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grpId=").append(grpId);
        sb.append(", custId=").append(custId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}