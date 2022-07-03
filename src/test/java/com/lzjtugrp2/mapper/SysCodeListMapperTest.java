package com.lzjtugrp2.mapper;


import com.lzjtugrp2.domain.SysCodelist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SysCodeListMapperTest {
    @Autowired
    private SysCodelistMapper sysCodelistMapper;

    @Test
    public void SelectAll() {
        sysCodelistMapper.selectAll();
    }

    @Test
    public void Insert(){
        SysCodelist sysCodelist = new SysCodelist();
        sysCodelist.setCodeValue("11111111111111111");
        int i = sysCodelistMapper.insertSelective(sysCodelist);
        System.out.println(i);
    }

}
