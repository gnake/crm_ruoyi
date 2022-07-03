package com.lzjtugrp2.exception;

public enum CRMExceptionEnum {
    LOGIN_USER_PASS("001-001", "用户名或密码错误"),//用户名或密码错误
    LOGIN_USER_CODE("001-002", "验证码输入错误");//验证码输入错误


    private String type;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    CRMExceptionEnum(String type, String message) {
        this.type = type;
        this.message = message;
    }
}
