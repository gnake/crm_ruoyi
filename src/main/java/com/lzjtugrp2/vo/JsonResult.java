package com.lzjtugrp2.vo;


public class JsonResult {
    private int state;//表示状态   0 表示失败  1  表示成功
    private String message;//表示返回客户端的消息
    private Object data;//表示封装具体的数据返回给客户端

    public JsonResult() {
    }
    public JsonResult(int state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }
    public JsonResult(int state, String message) {
        this.state = state;
        this.message = message;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getMessage() {
        return message;
    }
    //将类业务层的异常信息  可以通过e.getMessage(); 给 message属性赋值
    public void setMessage(Throwable e) {
        this.message = e.getMessage();
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}

