package com.lzjtugrp2.service;

import com.lzjtugrp2.domain.SysCodelist;

import com.lzjtugrp2.domain.dto.SysCodeListDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SysCodeListServiceTest {
    @Autowired
    private SysCodeListService codeListService;

    @Test
    public void selectAll() {
        List<SysCodeListDTO> sysCodelists = codeListService.selectAll();
        System.out.println(sysCodelists);
    }
}
