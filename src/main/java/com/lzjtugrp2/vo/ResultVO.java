package com.lzjtugrp2.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResultVO<T> {
    private Boolean result; // 请求结果
    private Integer msgCode; // 响应状态码
    private String reason; // 失败原因
    private List<T> list; // 返回数据

    private ResultVO(Boolean result, Integer msgCode, List list, String reason) {
        this.result = result;
        this.msgCode = msgCode;
        this.list = list;
        this.reason = reason;
    }

    public static ResultVoBuilder builder() {
        return new ResultVoBuilder();
    }

    public static class ResultVoBuilder {
        private Boolean result;
        private Integer msgCode;
        private List list;
        private String reason;

        public ResultVoBuilder() {
        }

        public Boolean getResult() {
            return result;
        }

        public ResultVoBuilder setResult(Boolean result) {
            this.result = result;
            return this;
        }

        public Integer getMsgCode() {
            return msgCode;
        }

        public ResultVoBuilder setMsgCode(Integer msgCode) {
            this.msgCode = msgCode;
            return this;
        }

        public List getList() {
            return list;
        }

        public ResultVoBuilder setList(List list) {
            this.list = list;
            return this;
        }

        public String getReason() {
            return reason;
        }

        public ResultVoBuilder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public ResultVO build() {
            if (result == null) {
                throw new RuntimeException("返回结果必填！");
            }
            return new ResultVO(result, msgCode, list, reason);
        }
    }

//    public static void main(String[] args) {
//        ResultVO resultVO = ResultVO.builder().setResult(true)
//                .setReason("返回信息")
//                .build();
//        System.out.println(resultVO);
//    }

}
