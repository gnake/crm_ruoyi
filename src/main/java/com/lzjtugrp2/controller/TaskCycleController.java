package com.lzjtugrp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskCycleController {
    @GetMapping("/taskcycle")
    public String taskcycle(){
        return "taskcycle";
    }
}
