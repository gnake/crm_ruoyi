package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.SysCodetype;
import com.lzjtugrp2.mapper.SysCodetypeMapper;
import com.lzjtugrp2.service.SysCodetypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysCodetypeServiceImpl implements SysCodetypeService {
    @Autowired
    private SysCodetypeMapper sysCodetypeMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysCodetypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysCodetype record) {
        return sysCodetypeMapper.insert(record);
    }

    @Override
    public int insertSelective(SysCodetype record) {
        return sysCodetypeMapper.insertSelective(record);
    }

    @Override
    public SysCodetype selectByPrimaryKey(Long id) {
        return sysCodetypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysCodetype record) {
        return sysCodetypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysCodetype record) {
        return sysCodetypeMapper.updateByPrimaryKey(record);
    }
}
