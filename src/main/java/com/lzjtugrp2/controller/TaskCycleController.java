package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.TaskCycle;
import com.lzjtugrp2.service.TaskCycleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class TaskCycleController {
    @Resource
    private TaskCycleService taskcycleService;

    @GetMapping("/taskCycle")
    public String taskcycle(Model model){
        List<TaskCycle> taskList = taskcycleService.getAllTask();
        model.addAttribute("taskList", taskList);
        return "taskcycle";
    }
    //新增
    @GetMapping("/taskcycleadd")
    public String insert(){
        return "taskcycle";
    }
    //编辑
    @GetMapping("/update")
    public String update(){
        return "taskcycle";
    }
    //复制
    @GetMapping("/copy")
    public String copy(){
        return "taskcycle";
    }
    //查看
    @GetMapping("/select")
    public String select(){
        return "taskcycle";
    }
    //删除
    @GetMapping("/delete")
    public String delete(){
        return "taskcycle";
    }
}
