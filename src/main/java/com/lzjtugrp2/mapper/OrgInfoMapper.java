package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.OrgInfo;

/**
* @author gsh
* @description 针对表【crm_org_info(潜在客户)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.OrgInfo
*/
public interface OrgInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrgInfo record);

    int insertSelective(OrgInfo record);

    OrgInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrgInfo record);

    int updateByPrimaryKey(OrgInfo record);

}
