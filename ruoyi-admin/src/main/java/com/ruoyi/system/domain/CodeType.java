package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 编码类型对象 crm_sys_codetype
 * 
 * @author gsh
 * @date 2022-07-07
 */
public class CodeType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long typeId;

    /** 类型标识 */
    @Excel(name = "类型标识")
    private String typeIdent;

    /** 类型名称 */
    @Excel(name = "类型名称")
    private String typeName;

    /** 类型分组 */
    @Excel(name = "类型分组")
    private String typeGroup;

    /** 是否可编辑 */
    @Excel(name = "是否可编辑")
    private Integer isEditable;

    /** 是否失效 */
    @Excel(name = "是否失效")
    private Integer isEffective;

    /** 是否SQL扩展 */
    @Excel(name = "是否SQL扩展")
    private Integer isExtend;

    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }
    public void setTypeIdent(String typeIdent) 
    {
        this.typeIdent = typeIdent;
    }

    public String getTypeIdent() 
    {
        return typeIdent;
    }
    public void setTypeName(String typeName) 
    {
        this.typeName = typeName;
    }

    public String getTypeName() 
    {
        return typeName;
    }
    public void setTypeGroup(String typeGroup) 
    {
        this.typeGroup = typeGroup;
    }

    public String getTypeGroup() 
    {
        return typeGroup;
    }
    public void setIsEditable(Integer isEditable) 
    {
        this.isEditable = isEditable;
    }

    public Integer getIsEditable() 
    {
        return isEditable;
    }
    public void setIsEffective(Integer isEffective) 
    {
        this.isEffective = isEffective;
    }

    public Integer getIsEffective() 
    {
        return isEffective;
    }
    public void setIsExtend(Integer isExtend) 
    {
        this.isExtend = isExtend;
    }

    public Integer getIsExtend() 
    {
        return isExtend;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("typeId", getTypeId())
            .append("typeIdent", getTypeIdent())
            .append("typeName", getTypeName())
            .append("typeGroup", getTypeGroup())
            .append("isEditable", getIsEditable())
            .append("isEffective", getIsEffective())
            .append("isExtend", getIsExtend())
            .toString();
    }
}
