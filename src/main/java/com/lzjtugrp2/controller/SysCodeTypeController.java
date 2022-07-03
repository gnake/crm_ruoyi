package com.lzjtugrp2.controller;

import com.lzjtugrp2.domain.SysCodetype;
import com.lzjtugrp2.service.SysCodetypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("code")
public class SysCodeTypeController {
    @Resource
    private SysCodetypeService sysCodetypeService;

    @RequestMapping("toCodetypeListView")
    public String toCodetypeListView(){
        return "codetypeList";
    }
    @RequestMapping("addCodetype")
    @ResponseBody
    public String addCodeType(HttpServletRequest request){
        String typeIdent=request.getParameter("typeident");
        String typeName=request.getParameter("typename");
        String typeGroup=request.getParameter("typegroup");
        int isExtend=Integer.parseInt(request.getParameter("isextend"));
        SysCodetype sysCodetype = new SysCodetype();
        sysCodetype.setTypeIdent(typeIdent);
        sysCodetype.setTypeName(typeName);
        sysCodetype.setTypeGroup(typeGroup);
        sysCodetype.setIsExtend(isExtend);

        String msg="error";
        if(sysCodetypeService.insertSelective(sysCodetype)>0){
            msg = "success";
        }
        return msg;
    }


}
