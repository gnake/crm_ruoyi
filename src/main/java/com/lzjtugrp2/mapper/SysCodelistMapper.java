package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.SysCodelist;

/**
* @author gsh
* @description 针对表【crm_sys_codelist(编码管理)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.SysCodelist
*/
public interface SysCodelistMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysCodelist record);

    int insertSelective(SysCodelist record);

    SysCodelist selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCodelist record);

    int updateByPrimaryKey(SysCodelist record);

}