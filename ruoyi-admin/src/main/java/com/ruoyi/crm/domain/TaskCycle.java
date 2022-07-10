package com.ruoyi.crm.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 任务周期对象 TASK_CYCLE
 * 
 * @author swj
 * @date 2022-07-10
 */
public class TaskCycle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long tcId;

    /** 起始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "起始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tcBegin;

    /** 结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tcEnd;

    public void setTcId(Long tcId) 
    {
        this.tcId = tcId;
    }

    public Long getTcId() 
    {
        return tcId;
    }
    public void setTcBegin(Date tcBegin) 
    {
        this.tcBegin = tcBegin;
    }

    public Date getTcBegin() 
    {
        return tcBegin;
    }
    public void setTcEnd(Date tcEnd) 
    {
        this.tcEnd = tcEnd;
    }

    public Date getTcEnd() 
    {
        return tcEnd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tcId", getTcId())
            .append("tcBegin", getTcBegin())
            .append("tcEnd", getTcEnd())
            .toString();
    }
}
