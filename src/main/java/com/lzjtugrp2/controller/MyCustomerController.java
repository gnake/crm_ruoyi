package com.lzjtugrp2.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyCustomerController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String login(String username, String password, Model model){
        if(username.equals("admin") && password.equals("admin")){
            return "redirect:/toIndex";
        }else {
            model.addAttribute("error","账号密码错误");
            return "login";
        }
    }
    @GetMapping("/toIndex")
    public String toIndex(){
        return "index";
    }
}
