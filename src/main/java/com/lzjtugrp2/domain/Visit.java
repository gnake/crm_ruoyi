package com.lzjtugrp2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 拜访记录
 * @TableName crm_visit
 */
@Data
public class Visit implements Serializable {
    /**
     * 主键
     */
    private Long visitId;

    /**
     * 拜访类型
     */
    private String visitType;

    /**
     * 客户ID 关联客户管理表
     */
    private Long visitCustId;

    /**
     * 接待人姓名
     */
    private String visitReceptionName;

    /**
     * 接待人性别
     */
    private String visitReceptionSex;

    /**
     * 接待人职位
     */
    private String visitReceptionJob;

    /**
     * 接待人电话
     */
    private String visitReceptionPhone;

    /**
     * 拜访人员
     */
    private Long visitUserId;

    /**
     * 同行人员
     */
    private String visitPeerName;

    /**
     * 拜访日期
     */
    private Date visitDate;

    /**
     * 交互内容
     */
    private String visitContent;

    /**
     * 客户关注点
     */
    private String visitCustFocus;

    /**
     * 沟通效果
     */
    private String visitEffect;

    /**
     * 待改进情况
     */
    private String visitImprovement;

    /**
     * 拜访费用
     */
    private BigDecimal visitCost;

    /**
     * 费用说明
     */
    private String visitCostExplain;

    /**
     * 状态
     */
    private String visitState;

    /**
     * 填写人
     */
    private Long visitFillId;

    /**
     * 填写时间
     */
    private Date visitFillTime;

    /**
     * 确认人
     */
    private Long visitConfirmId;

    /**
     * 确认时间
     */
    private Date visitConfirmTime;

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
        Visit other = (Visit) that;
        return (this.getVisitId() == null ? other.getVisitId() == null : this.getVisitId().equals(other.getVisitId()))
            && (this.getVisitType() == null ? other.getVisitType() == null : this.getVisitType().equals(other.getVisitType()))
            && (this.getVisitCustId() == null ? other.getVisitCustId() == null : this.getVisitCustId().equals(other.getVisitCustId()))
            && (this.getVisitReceptionName() == null ? other.getVisitReceptionName() == null : this.getVisitReceptionName().equals(other.getVisitReceptionName()))
            && (this.getVisitReceptionSex() == null ? other.getVisitReceptionSex() == null : this.getVisitReceptionSex().equals(other.getVisitReceptionSex()))
            && (this.getVisitReceptionJob() == null ? other.getVisitReceptionJob() == null : this.getVisitReceptionJob().equals(other.getVisitReceptionJob()))
            && (this.getVisitReceptionPhone() == null ? other.getVisitReceptionPhone() == null : this.getVisitReceptionPhone().equals(other.getVisitReceptionPhone()))
            && (this.getVisitUserId() == null ? other.getVisitUserId() == null : this.getVisitUserId().equals(other.getVisitUserId()))
            && (this.getVisitPeerName() == null ? other.getVisitPeerName() == null : this.getVisitPeerName().equals(other.getVisitPeerName()))
            && (this.getVisitDate() == null ? other.getVisitDate() == null : this.getVisitDate().equals(other.getVisitDate()))
            && (this.getVisitContent() == null ? other.getVisitContent() == null : this.getVisitContent().equals(other.getVisitContent()))
            && (this.getVisitCustFocus() == null ? other.getVisitCustFocus() == null : this.getVisitCustFocus().equals(other.getVisitCustFocus()))
            && (this.getVisitEffect() == null ? other.getVisitEffect() == null : this.getVisitEffect().equals(other.getVisitEffect()))
            && (this.getVisitImprovement() == null ? other.getVisitImprovement() == null : this.getVisitImprovement().equals(other.getVisitImprovement()))
            && (this.getVisitCost() == null ? other.getVisitCost() == null : this.getVisitCost().equals(other.getVisitCost()))
            && (this.getVisitCostExplain() == null ? other.getVisitCostExplain() == null : this.getVisitCostExplain().equals(other.getVisitCostExplain()))
            && (this.getVisitState() == null ? other.getVisitState() == null : this.getVisitState().equals(other.getVisitState()))
            && (this.getVisitFillId() == null ? other.getVisitFillId() == null : this.getVisitFillId().equals(other.getVisitFillId()))
            && (this.getVisitFillTime() == null ? other.getVisitFillTime() == null : this.getVisitFillTime().equals(other.getVisitFillTime()))
            && (this.getVisitConfirmId() == null ? other.getVisitConfirmId() == null : this.getVisitConfirmId().equals(other.getVisitConfirmId()))
            && (this.getVisitConfirmTime() == null ? other.getVisitConfirmTime() == null : this.getVisitConfirmTime().equals(other.getVisitConfirmTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVisitId() == null) ? 0 : getVisitId().hashCode());
        result = prime * result + ((getVisitType() == null) ? 0 : getVisitType().hashCode());
        result = prime * result + ((getVisitCustId() == null) ? 0 : getVisitCustId().hashCode());
        result = prime * result + ((getVisitReceptionName() == null) ? 0 : getVisitReceptionName().hashCode());
        result = prime * result + ((getVisitReceptionSex() == null) ? 0 : getVisitReceptionSex().hashCode());
        result = prime * result + ((getVisitReceptionJob() == null) ? 0 : getVisitReceptionJob().hashCode());
        result = prime * result + ((getVisitReceptionPhone() == null) ? 0 : getVisitReceptionPhone().hashCode());
        result = prime * result + ((getVisitUserId() == null) ? 0 : getVisitUserId().hashCode());
        result = prime * result + ((getVisitPeerName() == null) ? 0 : getVisitPeerName().hashCode());
        result = prime * result + ((getVisitDate() == null) ? 0 : getVisitDate().hashCode());
        result = prime * result + ((getVisitContent() == null) ? 0 : getVisitContent().hashCode());
        result = prime * result + ((getVisitCustFocus() == null) ? 0 : getVisitCustFocus().hashCode());
        result = prime * result + ((getVisitEffect() == null) ? 0 : getVisitEffect().hashCode());
        result = prime * result + ((getVisitImprovement() == null) ? 0 : getVisitImprovement().hashCode());
        result = prime * result + ((getVisitCost() == null) ? 0 : getVisitCost().hashCode());
        result = prime * result + ((getVisitCostExplain() == null) ? 0 : getVisitCostExplain().hashCode());
        result = prime * result + ((getVisitState() == null) ? 0 : getVisitState().hashCode());
        result = prime * result + ((getVisitFillId() == null) ? 0 : getVisitFillId().hashCode());
        result = prime * result + ((getVisitFillTime() == null) ? 0 : getVisitFillTime().hashCode());
        result = prime * result + ((getVisitConfirmId() == null) ? 0 : getVisitConfirmId().hashCode());
        result = prime * result + ((getVisitConfirmTime() == null) ? 0 : getVisitConfirmTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", visitId=").append(visitId);
        sb.append(", visitType=").append(visitType);
        sb.append(", visitCustId=").append(visitCustId);
        sb.append(", visitReceptionName=").append(visitReceptionName);
        sb.append(", visitReceptionSex=").append(visitReceptionSex);
        sb.append(", visitReceptionJob=").append(visitReceptionJob);
        sb.append(", visitReceptionPhone=").append(visitReceptionPhone);
        sb.append(", visitUserId=").append(visitUserId);
        sb.append(", visitPeerName=").append(visitPeerName);
        sb.append(", visitDate=").append(visitDate);
        sb.append(", visitContent=").append(visitContent);
        sb.append(", visitCustFocus=").append(visitCustFocus);
        sb.append(", visitEffect=").append(visitEffect);
        sb.append(", visitImprovement=").append(visitImprovement);
        sb.append(", visitCost=").append(visitCost);
        sb.append(", visitCostExplain=").append(visitCostExplain);
        sb.append(", visitState=").append(visitState);
        sb.append(", visitFillId=").append(visitFillId);
        sb.append(", visitFillTime=").append(visitFillTime);
        sb.append(", visitConfirmId=").append(visitConfirmId);
        sb.append(", visitConfirmTime=").append(visitConfirmTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}