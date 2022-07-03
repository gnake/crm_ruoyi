package com.lzjtugrp2.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 潜在客户
 * @TableName crm_org_info
 */
@Data
public class OrgInfo implements Serializable {
    /**
     * 主键
     */
    private Long orgId;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * 组织性质
     */
    private String orgType;

    /**
     * 简要介绍
     */
    private String orgIntroduction;

    /**
     * 联系人
     */
    private String orgLinkmanName;

    /**
     * 邮箱
     */
    private String orgEmail;

    /**
     * 联系方式
     */
    private String orgContactWay;

    /**
     * 状态
     */
    private String orgState;

    /**
     * 标签
     */
    private String orgLabels;

    /**
     * 地址
     */
    private String orgAddress;

    /**
     * 公司网站
     */
    private String orgWebsite;

    /**
     * 创建人
     */
    private String orgCreater;

    /**
     * 创建时间
     */
    private Date orgCreateTime;

    /**
     * 更新时间
     */
    private Date orgUpdateTime;

    /**
     * 公司分类
     */
    private String orgClassification;

    /**
     * 计划拜访时间
     */
    private Date orgVisitAgainTime;

    /**
     * 客户管理(CRM_CUSTOMER_INFO)
     */
    private Long custId;

    /**
     * 来源渠道
     */
    private String orgSources;

    /**
     * 跟进人员
     */
    private String orgSalesman;

    /**
     * 分类
     */
    private Integer orgClassify;

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
        OrgInfo other = (OrgInfo) that;
        return (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getOrgType() == null ? other.getOrgType() == null : this.getOrgType().equals(other.getOrgType()))
            && (this.getOrgIntroduction() == null ? other.getOrgIntroduction() == null : this.getOrgIntroduction().equals(other.getOrgIntroduction()))
            && (this.getOrgLinkmanName() == null ? other.getOrgLinkmanName() == null : this.getOrgLinkmanName().equals(other.getOrgLinkmanName()))
            && (this.getOrgEmail() == null ? other.getOrgEmail() == null : this.getOrgEmail().equals(other.getOrgEmail()))
            && (this.getOrgContactWay() == null ? other.getOrgContactWay() == null : this.getOrgContactWay().equals(other.getOrgContactWay()))
            && (this.getOrgState() == null ? other.getOrgState() == null : this.getOrgState().equals(other.getOrgState()))
            && (this.getOrgLabels() == null ? other.getOrgLabels() == null : this.getOrgLabels().equals(other.getOrgLabels()))
            && (this.getOrgAddress() == null ? other.getOrgAddress() == null : this.getOrgAddress().equals(other.getOrgAddress()))
            && (this.getOrgWebsite() == null ? other.getOrgWebsite() == null : this.getOrgWebsite().equals(other.getOrgWebsite()))
            && (this.getOrgCreater() == null ? other.getOrgCreater() == null : this.getOrgCreater().equals(other.getOrgCreater()))
            && (this.getOrgCreateTime() == null ? other.getOrgCreateTime() == null : this.getOrgCreateTime().equals(other.getOrgCreateTime()))
            && (this.getOrgUpdateTime() == null ? other.getOrgUpdateTime() == null : this.getOrgUpdateTime().equals(other.getOrgUpdateTime()))
            && (this.getOrgClassification() == null ? other.getOrgClassification() == null : this.getOrgClassification().equals(other.getOrgClassification()))
            && (this.getOrgVisitAgainTime() == null ? other.getOrgVisitAgainTime() == null : this.getOrgVisitAgainTime().equals(other.getOrgVisitAgainTime()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getOrgSources() == null ? other.getOrgSources() == null : this.getOrgSources().equals(other.getOrgSources()))
            && (this.getOrgSalesman() == null ? other.getOrgSalesman() == null : this.getOrgSalesman().equals(other.getOrgSalesman()))
            && (this.getOrgClassify() == null ? other.getOrgClassify() == null : this.getOrgClassify().equals(other.getOrgClassify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getOrgType() == null) ? 0 : getOrgType().hashCode());
        result = prime * result + ((getOrgIntroduction() == null) ? 0 : getOrgIntroduction().hashCode());
        result = prime * result + ((getOrgLinkmanName() == null) ? 0 : getOrgLinkmanName().hashCode());
        result = prime * result + ((getOrgEmail() == null) ? 0 : getOrgEmail().hashCode());
        result = prime * result + ((getOrgContactWay() == null) ? 0 : getOrgContactWay().hashCode());
        result = prime * result + ((getOrgState() == null) ? 0 : getOrgState().hashCode());
        result = prime * result + ((getOrgLabels() == null) ? 0 : getOrgLabels().hashCode());
        result = prime * result + ((getOrgAddress() == null) ? 0 : getOrgAddress().hashCode());
        result = prime * result + ((getOrgWebsite() == null) ? 0 : getOrgWebsite().hashCode());
        result = prime * result + ((getOrgCreater() == null) ? 0 : getOrgCreater().hashCode());
        result = prime * result + ((getOrgCreateTime() == null) ? 0 : getOrgCreateTime().hashCode());
        result = prime * result + ((getOrgUpdateTime() == null) ? 0 : getOrgUpdateTime().hashCode());
        result = prime * result + ((getOrgClassification() == null) ? 0 : getOrgClassification().hashCode());
        result = prime * result + ((getOrgVisitAgainTime() == null) ? 0 : getOrgVisitAgainTime().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getOrgSources() == null) ? 0 : getOrgSources().hashCode());
        result = prime * result + ((getOrgSalesman() == null) ? 0 : getOrgSalesman().hashCode());
        result = prime * result + ((getOrgClassify() == null) ? 0 : getOrgClassify().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgId=").append(orgId);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgType=").append(orgType);
        sb.append(", orgIntroduction=").append(orgIntroduction);
        sb.append(", orgLinkmanName=").append(orgLinkmanName);
        sb.append(", orgEmail=").append(orgEmail);
        sb.append(", orgContactWay=").append(orgContactWay);
        sb.append(", orgState=").append(orgState);
        sb.append(", orgLabels=").append(orgLabels);
        sb.append(", orgAddress=").append(orgAddress);
        sb.append(", orgWebsite=").append(orgWebsite);
        sb.append(", orgCreater=").append(orgCreater);
        sb.append(", orgCreateTime=").append(orgCreateTime);
        sb.append(", orgUpdateTime=").append(orgUpdateTime);
        sb.append(", orgClassification=").append(orgClassification);
        sb.append(", orgVisitAgainTime=").append(orgVisitAgainTime);
        sb.append(", custId=").append(custId);
        sb.append(", orgSources=").append(orgSources);
        sb.append(", orgSalesman=").append(orgSalesman);
        sb.append(", orgClassify=").append(orgClassify);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}