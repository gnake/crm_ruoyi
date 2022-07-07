package com.ruoyi.crm.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 我的客户对象 CRM_VISIT
 * 
 * @author tkh
 * @date 2022-07-07
 */
public class CrmVisit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long visitId;

    /** 拜访类型 */
    private String visitType;

    /** 客户ID 关联客户管理表 */
    private Long visitCustId;

    /** 接待人姓名 */
    private String visitReceptionName;

    /** 接待人性别 */
    private String visitReceptionSex;

    /** 接待人职位 */
    private String visitReceptionJob;

    /** 接待人电话 */
    private String visitReceptionPhone;

    /** 拜访人员 */
    @Excel(name = "拜访人员")
    private Long visitUserId;

    /** 同行人员 */
    private String visitPeerName;

    /** 拜访日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "拜访日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date visitDate;

    /** 交互内容 */
    private String visitContent;

    /** 客户关注点 */
    private String visitCustFocus;

    /** 沟通效果 */
    @Excel(name = "沟通效果")
    private String visitEffect;

    /** 待改进情况 */
    private String visitImprovement;

    /** 拜访费用 */
    private BigDecimal visitCost;

    /** 费用说明 */
    private String visitCostExplain;

    /** 状态 */
    private String visitState;

    /** 填写人 */
    private Long visitFillId;

    /** 填写时间 */
    private Date visitFillTime;

    /** 确认人 */
    private Long visitConfirmId;

    /** 确认时间 */
    private Date visitConfirmTime;

    public void setVisitId(Long visitId) 
    {
        this.visitId = visitId;
    }

    public Long getVisitId() 
    {
        return visitId;
    }
    public void setVisitType(String visitType) 
    {
        this.visitType = visitType;
    }

    public String getVisitType() 
    {
        return visitType;
    }
    public void setVisitCustId(Long visitCustId) 
    {
        this.visitCustId = visitCustId;
    }

    public Long getVisitCustId() 
    {
        return visitCustId;
    }
    public void setVisitReceptionName(String visitReceptionName) 
    {
        this.visitReceptionName = visitReceptionName;
    }

    public String getVisitReceptionName() 
    {
        return visitReceptionName;
    }
    public void setVisitReceptionSex(String visitReceptionSex) 
    {
        this.visitReceptionSex = visitReceptionSex;
    }

    public String getVisitReceptionSex() 
    {
        return visitReceptionSex;
    }
    public void setVisitReceptionJob(String visitReceptionJob) 
    {
        this.visitReceptionJob = visitReceptionJob;
    }

    public String getVisitReceptionJob() 
    {
        return visitReceptionJob;
    }
    public void setVisitReceptionPhone(String visitReceptionPhone) 
    {
        this.visitReceptionPhone = visitReceptionPhone;
    }

    public String getVisitReceptionPhone() 
    {
        return visitReceptionPhone;
    }
    public void setVisitUserId(Long visitUserId) 
    {
        this.visitUserId = visitUserId;
    }

    public Long getVisitUserId() 
    {
        return visitUserId;
    }
    public void setVisitPeerName(String visitPeerName) 
    {
        this.visitPeerName = visitPeerName;
    }

    public String getVisitPeerName() 
    {
        return visitPeerName;
    }
    public void setVisitDate(Date visitDate) 
    {
        this.visitDate = visitDate;
    }

    public Date getVisitDate() 
    {
        return visitDate;
    }
    public void setVisitContent(String visitContent) 
    {
        this.visitContent = visitContent;
    }

    public String getVisitContent() 
    {
        return visitContent;
    }
    public void setVisitCustFocus(String visitCustFocus) 
    {
        this.visitCustFocus = visitCustFocus;
    }

    public String getVisitCustFocus() 
    {
        return visitCustFocus;
    }
    public void setVisitEffect(String visitEffect) 
    {
        this.visitEffect = visitEffect;
    }

    public String getVisitEffect() 
    {
        return visitEffect;
    }
    public void setVisitImprovement(String visitImprovement) 
    {
        this.visitImprovement = visitImprovement;
    }

    public String getVisitImprovement() 
    {
        return visitImprovement;
    }
    public void setVisitCost(BigDecimal visitCost) 
    {
        this.visitCost = visitCost;
    }

    public BigDecimal getVisitCost() 
    {
        return visitCost;
    }
    public void setVisitCostExplain(String visitCostExplain) 
    {
        this.visitCostExplain = visitCostExplain;
    }

    public String getVisitCostExplain() 
    {
        return visitCostExplain;
    }
    public void setVisitState(String visitState) 
    {
        this.visitState = visitState;
    }

    public String getVisitState() 
    {
        return visitState;
    }
    public void setVisitFillId(Long visitFillId) 
    {
        this.visitFillId = visitFillId;
    }

    public Long getVisitFillId() 
    {
        return visitFillId;
    }
    public void setVisitFillTime(Date visitFillTime) 
    {
        this.visitFillTime = visitFillTime;
    }

    public Date getVisitFillTime() 
    {
        return visitFillTime;
    }
    public void setVisitConfirmId(Long visitConfirmId) 
    {
        this.visitConfirmId = visitConfirmId;
    }

    public Long getVisitConfirmId() 
    {
        return visitConfirmId;
    }
    public void setVisitConfirmTime(Date visitConfirmTime) 
    {
        this.visitConfirmTime = visitConfirmTime;
    }

    public Date getVisitConfirmTime() 
    {
        return visitConfirmTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("visitId", getVisitId())
            .append("visitType", getVisitType())
            .append("visitCustId", getVisitCustId())
            .append("visitReceptionName", getVisitReceptionName())
            .append("visitReceptionSex", getVisitReceptionSex())
            .append("visitReceptionJob", getVisitReceptionJob())
            .append("visitReceptionPhone", getVisitReceptionPhone())
            .append("visitUserId", getVisitUserId())
            .append("visitPeerName", getVisitPeerName())
            .append("visitDate", getVisitDate())
            .append("visitContent", getVisitContent())
            .append("visitCustFocus", getVisitCustFocus())
            .append("visitEffect", getVisitEffect())
            .append("visitImprovement", getVisitImprovement())
            .append("visitCost", getVisitCost())
            .append("visitCostExplain", getVisitCostExplain())
            .append("visitState", getVisitState())
            .append("visitFillId", getVisitFillId())
            .append("visitFillTime", getVisitFillTime())
            .append("visitConfirmId", getVisitConfirmId())
            .append("visitConfirmTime", getVisitConfirmTime())
            .toString();
    }
}
