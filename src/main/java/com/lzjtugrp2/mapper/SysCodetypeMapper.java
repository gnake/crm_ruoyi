package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.SysCodetype;

/**
* @author gsh
* @description 针对表【crm_sys_codetype(编码类型)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.SysCodetype
*/
public interface SysCodetypeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysCodetype record);

    int insertSelective(SysCodetype record);

    SysCodetype selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCodetype record);

    int updateByPrimaryKey(SysCodetype record);

}
