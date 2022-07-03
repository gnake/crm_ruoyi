package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SecurityUser;
import com.lzjtugrp2.service.ChangeUserPwdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ChangeUserPasswdController {
    @Autowired
    private ChangeUserPwdService changeUserPwdService;

    @RequestMapping("/changePassword")
    public ModelAndView changePassword(ModelAndView modelAndView,HttpServletRequest request,HttpSession session){
        SecurityUser securityUser = (SecurityUser) session.getAttribute("user_session");
        String username = securityUser.getUserPwd();
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        if (password.equals(repassword)){
            changeUserPwdService.changePassword(username,password);
        }else {
            modelAndView.addObject("msg","密码不一致");
            modelAndView.setViewName("/changepassword.html");
        }
        return modelAndView;
    }


}
