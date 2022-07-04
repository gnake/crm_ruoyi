package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.SecurityUser;
import com.lzjtugrp2.mapper.CustomerLoginMapper;
import com.lzjtugrp2.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService{
    @Autowired
    private CustomerLoginMapper customerLoginMapper;

    public boolean findUserByDetail(String usercode,String password){
        SecurityUser securityUser = customerLoginMapper.findByUcodeAndPwd(usercode,password);
        if(securityUser == null){
            return false;
        }else {
            return true;
        }

    }

}
