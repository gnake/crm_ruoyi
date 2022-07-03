package com.lzjtugrp2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商机管理表
 * @TableName crm_opp_info
 */
@Data
public class OppInfo implements Serializable {
    /**
     * 
     */
    private Long oppId;

    /**
     * 商机名称
     */
    private String oppName;

    /**
     * 线索标识
     */
    private String clueId;

    /**
     * 客户标识
     */
    private String custId;

    /**
     * 联系人标识
     */
    private String contId;

    /**
     * 商机说明
     */
    private String oppDes;

    /**
     * 关注产品
     */
    private String oppConcernProduct;

    /**
     * 预期投入
     */
    private BigDecimal oppExpectInvest;

    /**
     * 启动时间
     */
    private Date oppStartTime;

    /**
     * 状态
     */
    private String oppState;

    /**
     * 销售人员
     */
    private String clueSalesman;

    /**
     * 创建人
     */
    private String oppCreater;

    /**
     * 创建时间
     */
    private String oppCreateTime;

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
        OppInfo other = (OppInfo) that;
        return (this.getOppId() == null ? other.getOppId() == null : this.getOppId().equals(other.getOppId()))
            && (this.getOppName() == null ? other.getOppName() == null : this.getOppName().equals(other.getOppName()))
            && (this.getClueId() == null ? other.getClueId() == null : this.getClueId().equals(other.getClueId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getContId() == null ? other.getContId() == null : this.getContId().equals(other.getContId()))
            && (this.getOppDes() == null ? other.getOppDes() == null : this.getOppDes().equals(other.getOppDes()))
            && (this.getOppConcernProduct() == null ? other.getOppConcernProduct() == null : this.getOppConcernProduct().equals(other.getOppConcernProduct()))
            && (this.getOppExpectInvest() == null ? other.getOppExpectInvest() == null : this.getOppExpectInvest().equals(other.getOppExpectInvest()))
            && (this.getOppStartTime() == null ? other.getOppStartTime() == null : this.getOppStartTime().equals(other.getOppStartTime()))
            && (this.getOppState() == null ? other.getOppState() == null : this.getOppState().equals(other.getOppState()))
            && (this.getClueSalesman() == null ? other.getClueSalesman() == null : this.getClueSalesman().equals(other.getClueSalesman()))
            && (this.getOppCreater() == null ? other.getOppCreater() == null : this.getOppCreater().equals(other.getOppCreater()))
            && (this.getOppCreateTime() == null ? other.getOppCreateTime() == null : this.getOppCreateTime().equals(other.getOppCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOppId() == null) ? 0 : getOppId().hashCode());
        result = prime * result + ((getOppName() == null) ? 0 : getOppName().hashCode());
        result = prime * result + ((getClueId() == null) ? 0 : getClueId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getContId() == null) ? 0 : getContId().hashCode());
        result = prime * result + ((getOppDes() == null) ? 0 : getOppDes().hashCode());
        result = prime * result + ((getOppConcernProduct() == null) ? 0 : getOppConcernProduct().hashCode());
        result = prime * result + ((getOppExpectInvest() == null) ? 0 : getOppExpectInvest().hashCode());
        result = prime * result + ((getOppStartTime() == null) ? 0 : getOppStartTime().hashCode());
        result = prime * result + ((getOppState() == null) ? 0 : getOppState().hashCode());
        result = prime * result + ((getClueSalesman() == null) ? 0 : getClueSalesman().hashCode());
        result = prime * result + ((getOppCreater() == null) ? 0 : getOppCreater().hashCode());
        result = prime * result + ((getOppCreateTime() == null) ? 0 : getOppCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oppId=").append(oppId);
        sb.append(", oppName=").append(oppName);
        sb.append(", clueId=").append(clueId);
        sb.append(", custId=").append(custId);
        sb.append(", contId=").append(contId);
        sb.append(", oppDes=").append(oppDes);
        sb.append(", oppConcernProduct=").append(oppConcernProduct);
        sb.append(", oppExpectInvest=").append(oppExpectInvest);
        sb.append(", oppStartTime=").append(oppStartTime);
        sb.append(", oppState=").append(oppState);
        sb.append(", clueSalesman=").append(clueSalesman);
        sb.append(", oppCreater=").append(oppCreater);
        sb.append(", oppCreateTime=").append(oppCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}