package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.SecurityUser;
import com.lzjtugrp2.mapper.SecurityUserMapper;
import com.lzjtugrp2.service.SecurityUserService;
import com.lzjtugrp2.utils.MD5Util;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserServiceImpl implements SecurityUserService {
    private SecurityUserMapper securityUserMapper;

    @Override
    public void login(SecurityUser securityUser) {
        String username = securityUser.getUserName();
        String password = securityUser.getUserPwd();
        password = MD5Util.getMD5(password);

    }
}
