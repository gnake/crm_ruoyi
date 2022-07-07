package com.ruoyi.system.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 编码管理对象 crm_sys_codelist
 * 
 * @author gsh
 * @date 2022-07-07
 */
public class CodeList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long codeId;

    /** 编码标识 */
    @Excel(name = "编码标识")
    private Long typeId;

    /** 编码值 */
    @Excel(name = "编码值")
    private String codeValue;

    /** 编码排序 */
    @Excel(name = "编码排序")
    private Long codeSort;

    /** 编码类型信息 */
    private List<CodeType> codeTypeList;

    public void setCodeId(Long codeId) 
    {
        this.codeId = codeId;
    }

    public Long getCodeId() 
    {
        return codeId;
    }
    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }
    public void setCodeValue(String codeValue) 
    {
        this.codeValue = codeValue;
    }

    public String getCodeValue() 
    {
        return codeValue;
    }
    public void setCodeSort(Long codeSort) 
    {
        this.codeSort = codeSort;
    }

    public Long getCodeSort() 
    {
        return codeSort;
    }

    public List<CodeType> getCodeTypeList()
    {
        return codeTypeList;
    }

    public void setCodeTypeList(List<CodeType> codeTypeList)
    {
        this.codeTypeList = codeTypeList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("codeId", getCodeId())
            .append("typeId", getTypeId())
            .append("codeValue", getCodeValue())
            .append("codeSort", getCodeSort())
            .append("codeTypeList", getCodeTypeList())
            .toString();
    }
}
