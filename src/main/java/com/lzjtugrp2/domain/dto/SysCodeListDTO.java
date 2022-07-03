package com.lzjtugrp2.domain.dto;

import lombok.Data;

@Data
public class SysCodeListDTO {
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
    private int isEditable;

    /**
     * 是否失效 0:无效，1:有效
     */
    private int isEffective;

    /**
     * 是否SQL扩展 0:不可扩展，1:可扩展
     */
    private int isExtend;

}
