package com.lzjtugrp2.exception;

public class CRMException extends RuntimeException {
    private final CRMExceptionEnum CRMExceptionEnum;

    public CRMException(CRMExceptionEnum CRMExceptionEnum) {
        super(CRMExceptionEnum.getMessage());
        this.CRMExceptionEnum = CRMExceptionEnum;
    }
}
