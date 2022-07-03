package com.lzjtugrp2.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 编码类型
 * @TableName crm_sys_codetype
 */
@Data
public class SysCodetype implements Serializable {
    /**
     * 主键
     */
    private Long typeId;

    /**
     * 类型标识
     */
    private String typeIdent;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 类型分组
     */
    private String typeGroup;

    /**
     * 是否可编辑 0:不可编辑，1:可编辑
     */
    private Integer isEditable;

    /**
     * 是否失效 0:无效，1:有效
     */
    private Integer isEffective;

    /**
     * 是否SQL扩展 0:不可扩展，1:可扩展
     */
    private Integer isExtend;

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
        SysCodetype other = (SysCodetype) that;
        return (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getTypeIdent() == null ? other.getTypeIdent() == null : this.getTypeIdent().equals(other.getTypeIdent()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getTypeGroup() == null ? other.getTypeGroup() == null : this.getTypeGroup().equals(other.getTypeGroup()))
            && (this.getIsEditable() == null ? other.getIsEditable() == null : this.getIsEditable().equals(other.getIsEditable()))
            && (this.getIsEffective() == null ? other.getIsEffective() == null : this.getIsEffective().equals(other.getIsEffective()))
            && (this.getIsExtend() == null ? other.getIsExtend() == null : this.getIsExtend().equals(other.getIsExtend()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getTypeIdent() == null) ? 0 : getTypeIdent().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getTypeGroup() == null) ? 0 : getTypeGroup().hashCode());
        result = prime * result + ((getIsEditable() == null) ? 0 : getIsEditable().hashCode());
        result = prime * result + ((getIsEffective() == null) ? 0 : getIsEffective().hashCode());
        result = prime * result + ((getIsExtend() == null) ? 0 : getIsExtend().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeId=").append(typeId);
        sb.append(", typeIdent=").append(typeIdent);
        sb.append(", typeName=").append(typeName);
        sb.append(", typeGroup=").append(typeGroup);
        sb.append(", isEditable=").append(isEditable);
        sb.append(", isEffective=").append(isEffective);
        sb.append(", isExtend=").append(isExtend);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}