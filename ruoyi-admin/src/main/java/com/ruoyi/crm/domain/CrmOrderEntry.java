package com.ruoyi.crm.domain;

import java.math.BigDecimal;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工作总结对象 CRM_ORDER_ENTRY
 * 
 * @author 高国文
 * @date 2022-07-08
 */
public class CrmOrderEntry extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long entryId;

    /** 订单标识 */
    private Long orderId;

    /** 预订产品 */
    @Excel(name = "预订产品")
    private String entryOrderProduct;

    /** 产品型号 */
    @Excel(name = "产品型号")
    private String entryProductModel;

    /** 数量 */
    @Excel(name = "数量")
    private Long entryNumber;

    /** 单价 */
    @Excel(name = "单价")
    private BigDecimal entryUnitPrice;

    /** 折扣 */
    @Excel(name = "折扣")
    private BigDecimal entryDiscount;

    /** 实际价格 */
    @Excel(name = "实际价格")
    private BigDecimal entryRealPrice;

    /** 订单管理信息 */
    private List<CrmOrderInfo> crmOrderInfoList;

    public void setEntryId(Long entryId) 
    {
        this.entryId = entryId;
    }

    public Long getEntryId() 
    {
        return entryId;
    }
    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setEntryOrderProduct(String entryOrderProduct) 
    {
        this.entryOrderProduct = entryOrderProduct;
    }

    public String getEntryOrderProduct() 
    {
        return entryOrderProduct;
    }
    public void setEntryProductModel(String entryProductModel) 
    {
        this.entryProductModel = entryProductModel;
    }

    public String getEntryProductModel() 
    {
        return entryProductModel;
    }
    public void setEntryNumber(Long entryNumber) 
    {
        this.entryNumber = entryNumber;
    }

    public Long getEntryNumber() 
    {
        return entryNumber;
    }
    public void setEntryUnitPrice(BigDecimal entryUnitPrice) 
    {
        this.entryUnitPrice = entryUnitPrice;
    }

    public BigDecimal getEntryUnitPrice() 
    {
        return entryUnitPrice;
    }
    public void setEntryDiscount(BigDecimal entryDiscount) 
    {
        this.entryDiscount = entryDiscount;
    }

    public BigDecimal getEntryDiscount() 
    {
        return entryDiscount;
    }
    public void setEntryRealPrice(BigDecimal entryRealPrice) 
    {
        this.entryRealPrice = entryRealPrice;
    }

    public BigDecimal getEntryRealPrice() 
    {
        return entryRealPrice;
    }

    public List<CrmOrderInfo> getCrmOrderInfoList()
    {
        return crmOrderInfoList;
    }

    public void setCrmOrderInfoList(List<CrmOrderInfo> crmOrderInfoList)
    {
        this.crmOrderInfoList = crmOrderInfoList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("entryId", getEntryId())
            .append("orderId", getOrderId())
            .append("entryOrderProduct", getEntryOrderProduct())
            .append("entryProductModel", getEntryProductModel())
            .append("entryNumber", getEntryNumber())
            .append("entryUnitPrice", getEntryUnitPrice())
            .append("entryDiscount", getEntryDiscount())
            .append("entryRealPrice", getEntryRealPrice())
            .append("crmOrderInfoList", getCrmOrderInfoList())
            .toString();
    }
}
