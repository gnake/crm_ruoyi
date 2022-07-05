package com.lzjtugrp2.service;

import org.springframework.stereotype.Service;

public interface CustomerLoginService {
    boolean findByUcodeAndPwd(String usercode,String password) throws Exception;
}
