package com.ruoyi.crm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 潜在客户对象 crm_org_info
 * 
 * @author zxl
 * @date 2022-07-07
 */
public class CrmOrgInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long orgId;

    /** 组织名称 */
    @Excel(name = "组织名称")
    private String orgName;

    /** 组织性质 */
    @Excel(name = "组织性质")
    private String orgType;

    /** 简要介绍 */
    private String orgIntroduction;

    /** 联系人 */
    @Excel(name = "联系人")
    private String orgLinkmanName;

    /** 邮箱 */
    private String orgEmail;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String orgContactWay;

    /** 状态 */
    @Excel(name = "状态")
    private String orgState;

    /** 标签，0表未标记，1表已标记，2表无人接听，3表号码信息不符，4表空号，5表暂停服务，6表暂无需求，7表后续联系，8表态度恶劣 */
    @Excel(name = "标签，0表未标记，1表已标记，2表无人接听，3表号码信息不符，4表空号，5表暂停服务，6表暂无需求，7表后续联系，8表态度恶劣")
    private String orgLabels;

    /** 地址 */
    @Excel(name = "地址")
    private String orgAddress;

    /** 公司网站 */
    private String orgWebsite;

    /** 创建人 */
    private String orgCreater;

    /** 创建时间 */
    private String orgCreateTime;

    /** 更新时间 */
    private String orgUpdateTime;

    /** 公司分类 */
    private String orgClassification;

    /** 计划拜访时间 */
    private String orgVisitAgainTime;

    /** 客户管理(CRM_CUSTOMER_INFO) */
    private Long custId;

    /** 来源渠道 */
    private String orgSources;

    /** 跟进人员 */
    private String orgSalesman;

    /** 分类，0表示其他，1表企业实体，2表软件开发商，3表软件代理商，4表系统集成商 */
    private Integer orgClassify;

    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setOrgName(String orgName) 
    {
        this.orgName = orgName;
    }

    public String getOrgName() 
    {
        return orgName;
    }
    public void setOrgType(String orgType) 
    {
        this.orgType = orgType;
    }

    public String getOrgType() 
    {
        return orgType;
    }
    public void setOrgIntroduction(String orgIntroduction) 
    {
        this.orgIntroduction = orgIntroduction;
    }

    public String getOrgIntroduction() 
    {
        return orgIntroduction;
    }
    public void setOrgLinkmanName(String orgLinkmanName) 
    {
        this.orgLinkmanName = orgLinkmanName;
    }

    public String getOrgLinkmanName() 
    {
        return orgLinkmanName;
    }
    public void setOrgEmail(String orgEmail) 
    {
        this.orgEmail = orgEmail;
    }

    public String getOrgEmail() 
    {
        return orgEmail;
    }
    public void setOrgContactWay(String orgContactWay) 
    {
        this.orgContactWay = orgContactWay;
    }

    public String getOrgContactWay() 
    {
        return orgContactWay;
    }
    public void setOrgState(String orgState) 
    {
        this.orgState = orgState;
    }

    public String getOrgState() 
    {
        return orgState;
    }
    public void setOrgLabels(String orgLabels) 
    {
        this.orgLabels = orgLabels;
    }

    public String getOrgLabels() 
    {
        return orgLabels;
    }
    public void setOrgAddress(String orgAddress) 
    {
        this.orgAddress = orgAddress;
    }

    public String getOrgAddress() 
    {
        return orgAddress;
    }
    public void setOrgWebsite(String orgWebsite) 
    {
        this.orgWebsite = orgWebsite;
    }

    public String getOrgWebsite() 
    {
        return orgWebsite;
    }
    public void setOrgCreater(String orgCreater) 
    {
        this.orgCreater = orgCreater;
    }

    public String getOrgCreater() 
    {
        return orgCreater;
    }
    public void setOrgCreateTime(String orgCreateTime) 
    {
        this.orgCreateTime = orgCreateTime;
    }

    public String getOrgCreateTime() 
    {
        return orgCreateTime;
    }
    public void setOrgUpdateTime(String orgUpdateTime) 
    {
        this.orgUpdateTime = orgUpdateTime;
    }

    public String getOrgUpdateTime() 
    {
        return orgUpdateTime;
    }
    public void setOrgClassification(String orgClassification) 
    {
        this.orgClassification = orgClassification;
    }

    public String getOrgClassification() 
    {
        return orgClassification;
    }
    public void setOrgVisitAgainTime(String orgVisitAgainTime) 
    {
        this.orgVisitAgainTime = orgVisitAgainTime;
    }

    public String getOrgVisitAgainTime() 
    {
        return orgVisitAgainTime;
    }
    public void setCustId(Long custId) 
    {
        this.custId = custId;
    }

    public Long getCustId() 
    {
        return custId;
    }
    public void setOrgSources(String orgSources) 
    {
        this.orgSources = orgSources;
    }

    public String getOrgSources() 
    {
        return orgSources;
    }
    public void setOrgSalesman(String orgSalesman) 
    {
        this.orgSalesman = orgSalesman;
    }

    public String getOrgSalesman() 
    {
        return orgSalesman;
    }
    public void setOrgClassify(Integer orgClassify) 
    {
        this.orgClassify = orgClassify;
    }

    public Integer getOrgClassify() 
    {
        return orgClassify;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orgId", getOrgId())
            .append("orgName", getOrgName())
            .append("orgType", getOrgType())
            .append("orgIntroduction", getOrgIntroduction())
            .append("orgLinkmanName", getOrgLinkmanName())
            .append("orgEmail", getOrgEmail())
            .append("orgContactWay", getOrgContactWay())
            .append("orgState", getOrgState())
            .append("orgLabels", getOrgLabels())
            .append("orgAddress", getOrgAddress())
            .append("orgWebsite", getOrgWebsite())
            .append("orgCreater", getOrgCreater())
            .append("orgCreateTime", getOrgCreateTime())
            .append("orgUpdateTime", getOrgUpdateTime())
            .append("orgClassification", getOrgClassification())
            .append("orgVisitAgainTime", getOrgVisitAgainTime())
            .append("custId", getCustId())
            .append("orgSources", getOrgSources())
            .append("orgSalesman", getOrgSalesman())
            .append("orgClassify", getOrgClassify())
            .toString();
    }
}
