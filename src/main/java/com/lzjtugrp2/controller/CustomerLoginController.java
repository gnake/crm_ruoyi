package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SecurityUser;
import com.lzjtugrp2.service.CustomerLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CustomerLoginController {
    private CustomerLoginService customerLoginService;

    @GetMapping("/login")
    public String getIndex(String usercode, String password, HttpSession httpSession) throws Exception {
        SecurityUser loginUser = new SecurityUser();
        boolean userIsCurrent = customerLoginService.findUserByDetail(usercode, password);
        loginUser.setUserCode(usercode);
        loginUser.setUserPwd(password);
        if (userIsCurrent!=false) { //当前登录的用户存在
            httpSession.setAttribute("loginUser",loginUser);
            return "redirect:/toIndex";
        }else {
            return "login";
        }

    }

}
