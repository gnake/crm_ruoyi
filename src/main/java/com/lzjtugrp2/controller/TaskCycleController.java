package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.TaskCycle;
import com.lzjtugrp2.service.TaskCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("task")
public class TaskCycleController {
    @Autowired
    private TaskCycleService taskcycleService;

    @GetMapping("/taskCycle")
    public String taskcycle(Model model){
        List<TaskCycle> taskList = taskcycleService.getAllTask();
        model.addAttribute("taskList", taskList);
        return "taskCycle";
    }
    //新增
    @GetMapping("/taskcycleadd")
    public String insert(){
        return "taskCycle";
    }
    //编辑
    @GetMapping("/update")
    public String update(){
        return "taskCycle";
    }
    //复制
    @GetMapping("/copy")
    public String copy(){
        return "taskCycle";
    }
    //查看
    @GetMapping("/select")
    public String select(){
        return "taskCycle";
    }
    //删除
    @GetMapping("/delete")
    public String delete(){
        return "taskCycle";
    }
}
