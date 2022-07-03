package com.lzjtugrp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyCustomerController {

    @GetMapping("/customer")
    public String index(){
        return "mycustomer_editable";
    }
}
