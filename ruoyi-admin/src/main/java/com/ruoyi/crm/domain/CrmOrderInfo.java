package com.ruoyi.crm.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单管理对象 CRM_ORDER_INFO
 * 
 * @author 高国文
 * @date 2022-07-08
 */
public class CrmOrderInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long orderId;

    /** 商机名称 */
    @Excel(name = "商机名称")
    private Long oppId;

    /** 负责人 */
    @Excel(name = "负责人")
    private String orderChief;

    /** 交付费用 */
    @Excel(name = "交付费用")
    private BigDecimal orderDeliveryCost;

    /** 订单费用 */
    @Excel(name = "订单费用")
    private BigDecimal orderCost;

    /** 订单说明 */
    @Excel(name = "订单说明")
    private String orderDes;

    /** 状态 */
    @Excel(name = "状态")
    private String orderState;

    /** 创建人 */
    @Excel(name = "创建人")
    private String orderCreater;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderCreateTime;

    /** 确认人 */
    @Excel(name = "确认人")
    private String orderConfirmPerson;

    /** 确认时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "确认时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderConfirmTime;

    /** 销售人员 */
    @Excel(name = "销售人员")
    private String clueSalesman;

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setOppId(Long oppId) 
    {
        this.oppId = oppId;
    }

    public Long getOppId() 
    {
        return oppId;
    }
    public void setOrderChief(String orderChief) 
    {
        this.orderChief = orderChief;
    }

    public String getOrderChief() 
    {
        return orderChief;
    }
    public void setOrderDeliveryCost(BigDecimal orderDeliveryCost) 
    {
        this.orderDeliveryCost = orderDeliveryCost;
    }

    public BigDecimal getOrderDeliveryCost() 
    {
        return orderDeliveryCost;
    }
    public void setOrderCost(BigDecimal orderCost) 
    {
        this.orderCost = orderCost;
    }

    public BigDecimal getOrderCost() 
    {
        return orderCost;
    }
    public void setOrderDes(String orderDes) 
    {
        this.orderDes = orderDes;
    }

    public String getOrderDes() 
    {
        return orderDes;
    }
    public void setOrderState(String orderState) 
    {
        this.orderState = orderState;
    }

    public String getOrderState() 
    {
        return orderState;
    }
    public void setOrderCreater(String orderCreater) 
    {
        this.orderCreater = orderCreater;
    }

    public String getOrderCreater() 
    {
        return orderCreater;
    }
    public void setOrderCreateTime(Date orderCreateTime) 
    {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderCreateTime() 
    {
        return orderCreateTime;
    }
    public void setOrderConfirmPerson(String orderConfirmPerson) 
    {
        this.orderConfirmPerson = orderConfirmPerson;
    }

    public String getOrderConfirmPerson() 
    {
        return orderConfirmPerson;
    }
    public void setOrderConfirmTime(Date orderConfirmTime) 
    {
        this.orderConfirmTime = orderConfirmTime;
    }

    public Date getOrderConfirmTime() 
    {
        return orderConfirmTime;
    }
    public void setClueSalesman(String clueSalesman) 
    {
        this.clueSalesman = clueSalesman;
    }

    public String getClueSalesman() 
    {
        return clueSalesman;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("oppId", getOppId())
            .append("orderChief", getOrderChief())
            .append("orderDeliveryCost", getOrderDeliveryCost())
            .append("orderCost", getOrderCost())
            .append("orderDes", getOrderDes())
            .append("orderState", getOrderState())
            .append("orderCreater", getOrderCreater())
            .append("orderCreateTime", getOrderCreateTime())
            .append("orderConfirmPerson", getOrderConfirmPerson())
            .append("orderConfirmTime", getOrderConfirmTime())
            .append("clueSalesman", getClueSalesman())
            .toString();
    }
}
