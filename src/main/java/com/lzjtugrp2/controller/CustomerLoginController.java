package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SecurityUser;
import com.lzjtugrp2.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class CustomerLoginController {
    @Autowired
    private CustomerLoginService customerLoginService;

    @RequestMapping ("/tologin")
    public String tologin(){
        return "tologin";
    }

    @PostMapping("/login")
    public String getIndex(@RequestBody SecurityUser user, HttpSession httpSession) throws Exception {
        SecurityUser loginUser = new SecurityUser();

        boolean userIsCurrent = customerLoginService.findByUcodeAndPwd(user.getUserCode(), user.getUserPwd());
        loginUser.setUserCode(user.getUserCode());
        loginUser.setUserPwd(user.getUserPwd());
        if (userIsCurrent) { //当前登录的用户存在
            httpSession.setAttribute("loginUser",loginUser);
            return "redirect:/toIndex";
        }else {
            return "tologin";
        }
    }
    @RequestMapping("/toIndex")
    public String toIndex(HttpSession session){
        SecurityUser user = (SecurityUser) session.getAttribute("loginUser");
        if (user != null)
            return "index";
        else
            return "tologin";
    }
}
