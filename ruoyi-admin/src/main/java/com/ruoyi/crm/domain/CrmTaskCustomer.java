package com.ruoyi.crm.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 意向跟进对象 CRM_CUSTOMER_INFO
 * 
 * @author swj
 * @date 2022-07-08
 */
public class CrmTaskCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long custId;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String custName;

    /** 行业 */
    @Excel(name = "行业")
    private String custIndustry;

    /** 省份 */
    private String custProvince;

    /** 城市 */
    private String custCity;

    /** 地址 */
    private String custAddress;

    /** 规模 */
    @Excel(name = "规模")
    private String custScale;

    /** 性质 */
    @Excel(name = "性质")
    private String custNature;

    /** 简要介绍 */
    private String custIntroduce;

    /** 状态 */
    @Excel(name = "状态")
    private String custState;

    /** 创建人 */
    private Long custCreateId;

    /** 创建时间 */
    private Date custCreateTime;

    /** 提交人 */
    private Long custSubmitId;

    /** 提交时间 */
    private Date custSubmitTime;

    /** 确认人 */
    private Long custConfirmId;

    /** 确认时间 */
    private Date custConfirmTime;

    /** 进展状态 */
    @Excel(name = "进展状态")
    private String custProgressState;

    /** 级别 */
    private String custLevel;

    /** 公司网站 */
    private String custCompanyWeb;

    /** 潜在客户 */
    private Long orgId;

    /** 计划拜访时间 */
    private Date custVisitAgainTime;

    /** 我的客户信息 */
    private List<CrmVisitCustomer> crmVisitCustomerList;

    public void setCustId(Long custId) 
    {
        this.custId = custId;
    }

    public Long getCustId() 
    {
        return custId;
    }
    public void setCustName(String custName) 
    {
        this.custName = custName;
    }

    public String getCustName() 
    {
        return custName;
    }
    public void setCustIndustry(String custIndustry) 
    {
        this.custIndustry = custIndustry;
    }

    public String getCustIndustry() 
    {
        return custIndustry;
    }
    public void setCustProvince(String custProvince) 
    {
        this.custProvince = custProvince;
    }

    public String getCustProvince() 
    {
        return custProvince;
    }
    public void setCustCity(String custCity) 
    {
        this.custCity = custCity;
    }

    public String getCustCity() 
    {
        return custCity;
    }
    public void setCustAddress(String custAddress) 
    {
        this.custAddress = custAddress;
    }

    public String getCustAddress() 
    {
        return custAddress;
    }
    public void setCustScale(String custScale) 
    {
        this.custScale = custScale;
    }

    public String getCustScale() 
    {
        return custScale;
    }
    public void setCustNature(String custNature) 
    {
        this.custNature = custNature;
    }

    public String getCustNature() 
    {
        return custNature;
    }
    public void setCustIntroduce(String custIntroduce) 
    {
        this.custIntroduce = custIntroduce;
    }

    public String getCustIntroduce() 
    {
        return custIntroduce;
    }
    public void setCustState(String custState) 
    {
        this.custState = custState;
    }

    public String getCustState() 
    {
        return custState;
    }
    public void setCustCreateId(Long custCreateId) 
    {
        this.custCreateId = custCreateId;
    }

    public Long getCustCreateId() 
    {
        return custCreateId;
    }
    public void setCustCreateTime(Date custCreateTime) 
    {
        this.custCreateTime = custCreateTime;
    }

    public Date getCustCreateTime() 
    {
        return custCreateTime;
    }
    public void setCustSubmitId(Long custSubmitId) 
    {
        this.custSubmitId = custSubmitId;
    }

    public Long getCustSubmitId() 
    {
        return custSubmitId;
    }
    public void setCustSubmitTime(Date custSubmitTime) 
    {
        this.custSubmitTime = custSubmitTime;
    }

    public Date getCustSubmitTime() 
    {
        return custSubmitTime;
    }
    public void setCustConfirmId(Long custConfirmId) 
    {
        this.custConfirmId = custConfirmId;
    }

    public Long getCustConfirmId() 
    {
        return custConfirmId;
    }
    public void setCustConfirmTime(Date custConfirmTime) 
    {
        this.custConfirmTime = custConfirmTime;
    }

    public Date getCustConfirmTime() 
    {
        return custConfirmTime;
    }
    public void setCustProgressState(String custProgressState) 
    {
        this.custProgressState = custProgressState;
    }

    public String getCustProgressState() 
    {
        return custProgressState;
    }
    public void setCustLevel(String custLevel) 
    {
        this.custLevel = custLevel;
    }

    public String getCustLevel() 
    {
        return custLevel;
    }
    public void setCustCompanyWeb(String custCompanyWeb) 
    {
        this.custCompanyWeb = custCompanyWeb;
    }

    public String getCustCompanyWeb() 
    {
        return custCompanyWeb;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setCustVisitAgainTime(Date custVisitAgainTime) 
    {
        this.custVisitAgainTime = custVisitAgainTime;
    }

    public Date getCustVisitAgainTime() 
    {
        return custVisitAgainTime;
    }

    public List<CrmVisitCustomer> getCrmVisitCustomerList()
    {
        return crmVisitCustomerList;
    }

    public void setCrmVisitCustomerList(List<CrmVisitCustomer> crmVisitCustomerList)
    {
        this.crmVisitCustomerList = crmVisitCustomerList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("custId", getCustId())
            .append("custName", getCustName())
            .append("custIndustry", getCustIndustry())
            .append("custProvince", getCustProvince())
            .append("custCity", getCustCity())
            .append("custAddress", getCustAddress())
            .append("custScale", getCustScale())
            .append("custNature", getCustNature())
            .append("custIntroduce", getCustIntroduce())
            .append("custState", getCustState())
            .append("custCreateId", getCustCreateId())
            .append("custCreateTime", getCustCreateTime())
            .append("custSubmitId", getCustSubmitId())
            .append("custSubmitTime", getCustSubmitTime())
            .append("custConfirmId", getCustConfirmId())
            .append("custConfirmTime", getCustConfirmTime())
            .append("custProgressState", getCustProgressState())
            .append("custLevel", getCustLevel())
            .append("custCompanyWeb", getCustCompanyWeb())
            .append("orgId", getOrgId())
            .append("custVisitAgainTime", getCustVisitAgainTime())
            .append("crmVisitCustomerList", getCrmVisitCustomerList())
            .toString();
    }
}
