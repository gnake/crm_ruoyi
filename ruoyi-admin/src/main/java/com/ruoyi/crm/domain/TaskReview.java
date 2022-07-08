package com.ruoyi.crm.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工作总结对象 TASK_REVIEW
 * 
 * @author swj
 * @date 2022-07-08
 */
public class TaskReview extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long taskReviewId;

    /** 任务周期定义(TASK_CYCLE) 关联 */
    @Excel(name = "任务周期定义(TASK_CYCLE) 关联")
    private Long tcId;

    /** 销售人员 */
    @Excel(name = "销售人员")
    private String saleId;

    /** 总结状态 */
    @Excel(name = "总结状态")
    private String taskReviewState;

    /** 总结说明 */
    @Excel(name = "总结说明")
    private String taskReviewDesc;

    /** 拜访总数 */
    @Excel(name = "拜访总数")
    private Long taskReviewVisitsTotal;

    /** 陌生拜访记录 */
    @Excel(name = "陌生拜访记录")
    private Long taskReviewStrange;

    /** 回访拜访记录 */
    @Excel(name = "回访拜访记录")
    private Long taskReviewReturnvisit;

    /** 新增意向客户 */
    @Excel(name = "新增意向客户")
    private Long taskReviewNewIntencust;

    /** 回访历史客户 */
    @Excel(name = "回访历史客户")
    private Long taskReviewReturnvisitHist;

    /** 流失客户 */
    @Excel(name = "流失客户")
    private Long taskReviewLoss;

    /** 任务周期信息 */
    private List<TaskCycle> taskCycleList;

    public void setTaskReviewId(Long taskReviewId) 
    {
        this.taskReviewId = taskReviewId;
    }

    public Long getTaskReviewId() 
    {
        return taskReviewId;
    }
    public void setTcId(Long tcId) 
    {
        this.tcId = tcId;
    }

    public Long getTcId() 
    {
        return tcId;
    }
    public void setSaleId(String saleId) 
    {
        this.saleId = saleId;
    }

    public String getSaleId() 
    {
        return saleId;
    }
    public void setTaskReviewState(String taskReviewState) 
    {
        this.taskReviewState = taskReviewState;
    }

    public String getTaskReviewState() 
    {
        return taskReviewState;
    }
    public void setTaskReviewDesc(String taskReviewDesc) 
    {
        this.taskReviewDesc = taskReviewDesc;
    }

    public String getTaskReviewDesc() 
    {
        return taskReviewDesc;
    }
    public void setTaskReviewVisitsTotal(Long taskReviewVisitsTotal) 
    {
        this.taskReviewVisitsTotal = taskReviewVisitsTotal;
    }

    public Long getTaskReviewVisitsTotal() 
    {
        return taskReviewVisitsTotal;
    }
    public void setTaskReviewStrange(Long taskReviewStrange) 
    {
        this.taskReviewStrange = taskReviewStrange;
    }

    public Long getTaskReviewStrange() 
    {
        return taskReviewStrange;
    }
    public void setTaskReviewReturnvisit(Long taskReviewReturnvisit) 
    {
        this.taskReviewReturnvisit = taskReviewReturnvisit;
    }

    public Long getTaskReviewReturnvisit() 
    {
        return taskReviewReturnvisit;
    }
    public void setTaskReviewNewIntencust(Long taskReviewNewIntencust) 
    {
        this.taskReviewNewIntencust = taskReviewNewIntencust;
    }

    public Long getTaskReviewNewIntencust() 
    {
        return taskReviewNewIntencust;
    }
    public void setTaskReviewReturnvisitHist(Long taskReviewReturnvisitHist) 
    {
        this.taskReviewReturnvisitHist = taskReviewReturnvisitHist;
    }

    public Long getTaskReviewReturnvisitHist() 
    {
        return taskReviewReturnvisitHist;
    }
    public void setTaskReviewLoss(Long taskReviewLoss) 
    {
        this.taskReviewLoss = taskReviewLoss;
    }

    public Long getTaskReviewLoss() 
    {
        return taskReviewLoss;
    }

    public List<TaskCycle> getTaskCycleList()
    {
        return taskCycleList;
    }

    public void setTaskCycleList(List<TaskCycle> taskCycleList)
    {
        this.taskCycleList = taskCycleList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskReviewId", getTaskReviewId())
            .append("tcId", getTcId())
            .append("saleId", getSaleId())
            .append("taskReviewState", getTaskReviewState())
            .append("taskReviewDesc", getTaskReviewDesc())
            .append("taskReviewVisitsTotal", getTaskReviewVisitsTotal())
            .append("taskReviewStrange", getTaskReviewStrange())
            .append("taskReviewReturnvisit", getTaskReviewReturnvisit())
            .append("taskReviewNewIntencust", getTaskReviewNewIntencust())
            .append("taskReviewReturnvisitHist", getTaskReviewReturnvisitHist())
            .append("taskReviewLoss", getTaskReviewLoss())
            .append("taskCycleList", getTaskCycleList())
            .toString();
    }
}
