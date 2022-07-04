package com.lzjtugrp2.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SysLogDTO {
    /**
     * 主键
     */
    private Long sysId;

    /**
     * 操作时间
     */
    private Date operTime;

    /**
     * 所在地址
     */
    private String ipAddtress;

    /**
     * 用户表示
     */
    private Long userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 功能名称
     */
    private String funcName;

    /**
     * 操作类型
     */
    private String actionType;

    /**
     * 用户编码
     */
    private String userCode;
}
