package com.lzjtugrp2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 订单管理表
 * @TableName crm_order_info
 */
@Data
public class OrderInfo implements Serializable {
    /**
     * 主键
     */
    private Long orderId;

    /**
     * 商机名称
     */
    private Long oppId;

    /**
     * 负责人
     */
    private String orderChief;

    /**
     * 交付费用
     */
    private BigDecimal orderDeliveryCost;

    /**
     * 订单费用
     */
    private BigDecimal orderCost;

    /**
     * 订单说明
     */
    private String orderDes;

    /**
     * 状态
     */
    private String orderState;

    /**
     * 创建人
     */
    private String orderCreater;

    /**
     * 创建时间
     */
    private Date orderCreateTime;

    /**
     * 确认人
     */
    private String orderConfirmPerson;

    /**
     * 确认时间
     */
    private Date orderConfirmTime;

    /**
     * 销售人员
     */
    private String clueSalesman;

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
        OrderInfo other = (OrderInfo) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOppId() == null ? other.getOppId() == null : this.getOppId().equals(other.getOppId()))
            && (this.getOrderChief() == null ? other.getOrderChief() == null : this.getOrderChief().equals(other.getOrderChief()))
            && (this.getOrderDeliveryCost() == null ? other.getOrderDeliveryCost() == null : this.getOrderDeliveryCost().equals(other.getOrderDeliveryCost()))
            && (this.getOrderCost() == null ? other.getOrderCost() == null : this.getOrderCost().equals(other.getOrderCost()))
            && (this.getOrderDes() == null ? other.getOrderDes() == null : this.getOrderDes().equals(other.getOrderDes()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getOrderCreater() == null ? other.getOrderCreater() == null : this.getOrderCreater().equals(other.getOrderCreater()))
            && (this.getOrderCreateTime() == null ? other.getOrderCreateTime() == null : this.getOrderCreateTime().equals(other.getOrderCreateTime()))
            && (this.getOrderConfirmPerson() == null ? other.getOrderConfirmPerson() == null : this.getOrderConfirmPerson().equals(other.getOrderConfirmPerson()))
            && (this.getOrderConfirmTime() == null ? other.getOrderConfirmTime() == null : this.getOrderConfirmTime().equals(other.getOrderConfirmTime()))
            && (this.getClueSalesman() == null ? other.getClueSalesman() == null : this.getClueSalesman().equals(other.getClueSalesman()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOppId() == null) ? 0 : getOppId().hashCode());
        result = prime * result + ((getOrderChief() == null) ? 0 : getOrderChief().hashCode());
        result = prime * result + ((getOrderDeliveryCost() == null) ? 0 : getOrderDeliveryCost().hashCode());
        result = prime * result + ((getOrderCost() == null) ? 0 : getOrderCost().hashCode());
        result = prime * result + ((getOrderDes() == null) ? 0 : getOrderDes().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getOrderCreater() == null) ? 0 : getOrderCreater().hashCode());
        result = prime * result + ((getOrderCreateTime() == null) ? 0 : getOrderCreateTime().hashCode());
        result = prime * result + ((getOrderConfirmPerson() == null) ? 0 : getOrderConfirmPerson().hashCode());
        result = prime * result + ((getOrderConfirmTime() == null) ? 0 : getOrderConfirmTime().hashCode());
        result = prime * result + ((getClueSalesman() == null) ? 0 : getClueSalesman().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", oppId=").append(oppId);
        sb.append(", orderChief=").append(orderChief);
        sb.append(", orderDeliveryCost=").append(orderDeliveryCost);
        sb.append(", orderCost=").append(orderCost);
        sb.append(", orderDes=").append(orderDes);
        sb.append(", orderState=").append(orderState);
        sb.append(", orderCreater=").append(orderCreater);
        sb.append(", orderCreateTime=").append(orderCreateTime);
        sb.append(", orderConfirmPerson=").append(orderConfirmPerson);
        sb.append(", orderConfirmTime=").append(orderConfirmTime);
        sb.append(", clueSalesman=").append(clueSalesman);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}