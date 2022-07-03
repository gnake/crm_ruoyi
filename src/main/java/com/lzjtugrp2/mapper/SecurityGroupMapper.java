package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.SecurityGroup;

/**
* @author gsh
* @description 针对表【crm_security_group(组织部门表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.SecurityGroup
*/
public interface SecurityGroupMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SecurityGroup record);

    int insertSelective(SecurityGroup record);

    SecurityGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SecurityGroup record);

    int updateByPrimaryKey(SecurityGroup record);

}
