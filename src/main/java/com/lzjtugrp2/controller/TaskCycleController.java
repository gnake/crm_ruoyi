package com.lzjtugrp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("task")
public class TaskCycleController {
    @GetMapping("/taskCycle")
    public String taskcycle(){
        return "taskCycle";
    }
    //新增
    @GetMapping("/taskcycleadd")
    public String insert(){
        return "taskCycle";
    }
    //编辑
//    @GetMapping
    public String update(){
        return "taskCycle";
    }
    //复制
//    @GetMapping
    public String copy(){
        return "taskCycle";
    }
    //查看
//    @GetMapping
    public String select(){
        return "taskCycle";
    }
    //删除
//    @GetMapping
    public String delete(){
        return "taskCycle";
    }
}
