package com.lzjtugrp2.service;

import com.lzjtugrp2.domain.SysCodetype;

import java.util.List;

public interface SysCodetypeService {

    List<SysCodetype> selectAll();

    int deleteByPrimaryKey(Long id);

    int insert(SysCodetype record);

    int insertSelective(SysCodetype record);

    SysCodetype selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCodetype record);

    int updateByPrimaryKey(SysCodetype record);

    SysCodetype selectById(Long typeId);
}

