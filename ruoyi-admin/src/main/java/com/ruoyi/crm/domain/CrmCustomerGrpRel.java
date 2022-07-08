package com.ruoyi.crm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分组跟客户关联对象 CRM_CUSTOMER_GRP_REL
 * 
 * @author gsh
 * @date 2022-07-07
 */
public class CrmCustomerGrpRel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long grpId;

    /** $column.columnComment */
    private Long custId;

    public void setGrpId(Long grpId) 
    {
        this.grpId = grpId;
    }

    public Long getGrpId() 
    {
        return grpId;
    }
    public void setCustId(Long custId) 
    {
        this.custId = custId;
    }

    public Long getCustId() 
    {
        return custId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("grpId", getGrpId())
            .append("custId", getCustId())
            .toString();
    }
}
