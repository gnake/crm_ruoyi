package com.lzjtugrp2.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客户管理表
 * @TableName crm_customer_info
 */
@Data
public class CustomerInfo implements Serializable {
    /**
     * 主键
     */
    private Long custId;

    /**
     * 名称
     */
    private String custName;

    /**
     * 行业
     */
    private String custIndustry;

    /**
     * 省份
     */
    private String custProvince;

    /**
     * 城市
     */
    private String custCity;

    /**
     * 地址
     */
    private String custAddress;

    /**
     * 规模
     */
    private String custScale;

    /**
     * 性质
     */
    private String custNature;

    /**
     * 简要介绍
     */
    private String custIntroduce;

    /**
     * 状态
     */
    private String custState;

    /**
     * 创建人
     */
    private Long custCreateId;

    /**
     * 创建时间
     */
    private Date custCreateTime;

    /**
     * 提交人
     */
    private Long custSubmitId;

    /**
     * 提交时间
     */
    private Date custSubmitTime;

    /**
     * 确认人
     */
    private Long custConfirmId;

    /**
     * 确认时间
     */
    private Date custConfirmTime;

    /**
     * 进展状态
     */
    private String custProgressState;

    /**
     * 级别
     */
    private String custLevel;

    /**
     * 公司网站
     */
    private String custCompanyWeb;

    /**
     * 潜在客户
     */
    private Long orgId;

    /**
     * 计划拜访时间
     */
    private Date custVisitAgainTime;

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
        CustomerInfo other = (CustomerInfo) that;
        return (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustIndustry() == null ? other.getCustIndustry() == null : this.getCustIndustry().equals(other.getCustIndustry()))
            && (this.getCustProvince() == null ? other.getCustProvince() == null : this.getCustProvince().equals(other.getCustProvince()))
            && (this.getCustCity() == null ? other.getCustCity() == null : this.getCustCity().equals(other.getCustCity()))
            && (this.getCustAddress() == null ? other.getCustAddress() == null : this.getCustAddress().equals(other.getCustAddress()))
            && (this.getCustScale() == null ? other.getCustScale() == null : this.getCustScale().equals(other.getCustScale()))
            && (this.getCustNature() == null ? other.getCustNature() == null : this.getCustNature().equals(other.getCustNature()))
            && (this.getCustIntroduce() == null ? other.getCustIntroduce() == null : this.getCustIntroduce().equals(other.getCustIntroduce()))
            && (this.getCustState() == null ? other.getCustState() == null : this.getCustState().equals(other.getCustState()))
            && (this.getCustCreateId() == null ? other.getCustCreateId() == null : this.getCustCreateId().equals(other.getCustCreateId()))
            && (this.getCustCreateTime() == null ? other.getCustCreateTime() == null : this.getCustCreateTime().equals(other.getCustCreateTime()))
            && (this.getCustSubmitId() == null ? other.getCustSubmitId() == null : this.getCustSubmitId().equals(other.getCustSubmitId()))
            && (this.getCustSubmitTime() == null ? other.getCustSubmitTime() == null : this.getCustSubmitTime().equals(other.getCustSubmitTime()))
            && (this.getCustConfirmId() == null ? other.getCustConfirmId() == null : this.getCustConfirmId().equals(other.getCustConfirmId()))
            && (this.getCustConfirmTime() == null ? other.getCustConfirmTime() == null : this.getCustConfirmTime().equals(other.getCustConfirmTime()))
            && (this.getCustProgressState() == null ? other.getCustProgressState() == null : this.getCustProgressState().equals(other.getCustProgressState()))
            && (this.getCustLevel() == null ? other.getCustLevel() == null : this.getCustLevel().equals(other.getCustLevel()))
            && (this.getCustCompanyWeb() == null ? other.getCustCompanyWeb() == null : this.getCustCompanyWeb().equals(other.getCustCompanyWeb()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getCustVisitAgainTime() == null ? other.getCustVisitAgainTime() == null : this.getCustVisitAgainTime().equals(other.getCustVisitAgainTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustIndustry() == null) ? 0 : getCustIndustry().hashCode());
        result = prime * result + ((getCustProvince() == null) ? 0 : getCustProvince().hashCode());
        result = prime * result + ((getCustCity() == null) ? 0 : getCustCity().hashCode());
        result = prime * result + ((getCustAddress() == null) ? 0 : getCustAddress().hashCode());
        result = prime * result + ((getCustScale() == null) ? 0 : getCustScale().hashCode());
        result = prime * result + ((getCustNature() == null) ? 0 : getCustNature().hashCode());
        result = prime * result + ((getCustIntroduce() == null) ? 0 : getCustIntroduce().hashCode());
        result = prime * result + ((getCustState() == null) ? 0 : getCustState().hashCode());
        result = prime * result + ((getCustCreateId() == null) ? 0 : getCustCreateId().hashCode());
        result = prime * result + ((getCustCreateTime() == null) ? 0 : getCustCreateTime().hashCode());
        result = prime * result + ((getCustSubmitId() == null) ? 0 : getCustSubmitId().hashCode());
        result = prime * result + ((getCustSubmitTime() == null) ? 0 : getCustSubmitTime().hashCode());
        result = prime * result + ((getCustConfirmId() == null) ? 0 : getCustConfirmId().hashCode());
        result = prime * result + ((getCustConfirmTime() == null) ? 0 : getCustConfirmTime().hashCode());
        result = prime * result + ((getCustProgressState() == null) ? 0 : getCustProgressState().hashCode());
        result = prime * result + ((getCustLevel() == null) ? 0 : getCustLevel().hashCode());
        result = prime * result + ((getCustCompanyWeb() == null) ? 0 : getCustCompanyWeb().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getCustVisitAgainTime() == null) ? 0 : getCustVisitAgainTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custIndustry=").append(custIndustry);
        sb.append(", custProvince=").append(custProvince);
        sb.append(", custCity=").append(custCity);
        sb.append(", custAddress=").append(custAddress);
        sb.append(", custScale=").append(custScale);
        sb.append(", custNature=").append(custNature);
        sb.append(", custIntroduce=").append(custIntroduce);
        sb.append(", custState=").append(custState);
        sb.append(", custCreateId=").append(custCreateId);
        sb.append(", custCreateTime=").append(custCreateTime);
        sb.append(", custSubmitId=").append(custSubmitId);
        sb.append(", custSubmitTime=").append(custSubmitTime);
        sb.append(", custConfirmId=").append(custConfirmId);
        sb.append(", custConfirmTime=").append(custConfirmTime);
        sb.append(", custProgressState=").append(custProgressState);
        sb.append(", custLevel=").append(custLevel);
        sb.append(", custCompanyWeb=").append(custCompanyWeb);
        sb.append(", orgId=").append(orgId);
        sb.append(", custVisitAgainTime=").append(custVisitAgainTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}