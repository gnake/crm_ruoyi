package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SecurityUser;
import com.lzjtugrp2.exception.CRMException;
import com.lzjtugrp2.service.SecurityUserService;
import org.springframework.stereotype.Controller;

@Controller
public class SecurityUserController {
    private SecurityUserService securityUserService;

    public void login(SecurityUser securityUser) {
        try {
            securityUserService.login(securityUser);
        } catch (CRMException e) {
        }
    }
}
