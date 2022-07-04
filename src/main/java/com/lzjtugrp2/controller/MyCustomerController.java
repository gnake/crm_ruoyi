package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.CustomerInfo;
import com.lzjtugrp2.service.MyCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyCustomerController {
    @Autowired
    private MyCustomerService myCustomerService;

    @GetMapping("/customer")
    public String index() {
        return "mycustomer_editable";
    }

    @GetMapping("/selectAllCustomer")
    public String selectAll(Model model) {
        List<CustomerInfo> customerInfos = myCustomerService.selectAll();
        model.addAttribute("custormerInfo", customerInfos);
        return "mycustomer_editable";
    }
}
