package com.lzjtugrp2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 订单明细表
 * @TableName crm_order_entry
 */
@Data
public class OrderEntry implements Serializable {
    /**
     * 主键
     */
    private Long entryId;

    /**
     * 订单标识，关联订单管理表
     */
    private Long orderId;

    /**
     * 预订产品
     */
    private String entryOrderProduct;

    /**
     * 产品型号
     */
    private String entryProductModel;

    /**
     * 数量
     */
    private Integer entryNumber;

    /**
     * 单价
     */
    private BigDecimal entryUnitPrice;

    /**
     * 折扣
     */
    private BigDecimal entryDiscount;

    /**
     * 实际价格
     */
    private BigDecimal entryRealPrice;

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
        OrderEntry other = (OrderEntry) that;
        return (this.getEntryId() == null ? other.getEntryId() == null : this.getEntryId().equals(other.getEntryId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getEntryOrderProduct() == null ? other.getEntryOrderProduct() == null : this.getEntryOrderProduct().equals(other.getEntryOrderProduct()))
            && (this.getEntryProductModel() == null ? other.getEntryProductModel() == null : this.getEntryProductModel().equals(other.getEntryProductModel()))
            && (this.getEntryNumber() == null ? other.getEntryNumber() == null : this.getEntryNumber().equals(other.getEntryNumber()))
            && (this.getEntryUnitPrice() == null ? other.getEntryUnitPrice() == null : this.getEntryUnitPrice().equals(other.getEntryUnitPrice()))
            && (this.getEntryDiscount() == null ? other.getEntryDiscount() == null : this.getEntryDiscount().equals(other.getEntryDiscount()))
            && (this.getEntryRealPrice() == null ? other.getEntryRealPrice() == null : this.getEntryRealPrice().equals(other.getEntryRealPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getEntryOrderProduct() == null) ? 0 : getEntryOrderProduct().hashCode());
        result = prime * result + ((getEntryProductModel() == null) ? 0 : getEntryProductModel().hashCode());
        result = prime * result + ((getEntryNumber() == null) ? 0 : getEntryNumber().hashCode());
        result = prime * result + ((getEntryUnitPrice() == null) ? 0 : getEntryUnitPrice().hashCode());
        result = prime * result + ((getEntryDiscount() == null) ? 0 : getEntryDiscount().hashCode());
        result = prime * result + ((getEntryRealPrice() == null) ? 0 : getEntryRealPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", entryId=").append(entryId);
        sb.append(", orderId=").append(orderId);
        sb.append(", entryOrderProduct=").append(entryOrderProduct);
        sb.append(", entryProductModel=").append(entryProductModel);
        sb.append(", entryNumber=").append(entryNumber);
        sb.append(", entryUnitPrice=").append(entryUnitPrice);
        sb.append(", entryDiscount=").append(entryDiscount);
        sb.append(", entryRealPrice=").append(entryRealPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}