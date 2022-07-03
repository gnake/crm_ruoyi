package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.Visit;

/**
* @author gsh
* @description 针对表【crm_visit(拜访记录)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.Visit
*/
public interface VisitMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Visit record);

    int insertSelective(Visit record);

    Visit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Visit record);

    int updateByPrimaryKey(Visit record);

}
