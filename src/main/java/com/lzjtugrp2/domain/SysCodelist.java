package com.lzjtugrp2.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 编码管理
 * @TableName crm_sys_codelist
 */
@Data
public class SysCodelist implements Serializable {
    /**
     * 主键
     */
    private Long codeId;

    /**
     * 编码标识,关联SYS_CODETYPE
     */
    private Long typeId;

    /**
     * 编码值
     */
    private String codeValue;

    /**
     * 编码排序
     */
    private Integer codeSort;

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
        SysCodelist other = (SysCodelist) that;
        return (this.getCodeId() == null ? other.getCodeId() == null : this.getCodeId().equals(other.getCodeId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getCodeValue() == null ? other.getCodeValue() == null : this.getCodeValue().equals(other.getCodeValue()))
            && (this.getCodeSort() == null ? other.getCodeSort() == null : this.getCodeSort().equals(other.getCodeSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCodeId() == null) ? 0 : getCodeId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getCodeValue() == null) ? 0 : getCodeValue().hashCode());
        result = prime * result + ((getCodeSort() == null) ? 0 : getCodeSort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", codeId=").append(codeId);
        sb.append(", typeId=").append(typeId);
        sb.append(", codeValue=").append(codeValue);
        sb.append(", codeSort=").append(codeSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}