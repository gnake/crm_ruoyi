package com.lzjtugrp2.service;

import com.lzjtugrp2.domain.SysCodetype;

public interface SysCodetypeService {
    int deleteByPrimaryKey(Long id);

    int insert(SysCodetype record);

    int insertSelective(SysCodetype record);

    SysCodetype selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCodetype record);

    int updateByPrimaryKey(SysCodetype record);
}

