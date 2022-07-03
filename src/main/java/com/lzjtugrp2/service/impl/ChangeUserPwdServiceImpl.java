package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.mapper.ChangeUserPwdMapper;
import com.lzjtugrp2.service.ChangeUserPwdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangeUserPwdServiceImpl implements ChangeUserPwdService {
    @Autowired
    private ChangeUserPwdMapper changeUserPwdMapper;
    public void changePassword(String userName,String userPwd){
        changeUserPwdMapper.changePassword(userName,userPwd);
    }

}
