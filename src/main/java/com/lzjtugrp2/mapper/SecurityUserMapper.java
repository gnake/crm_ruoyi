package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.SecurityUser;
import org.apache.ibatis.annotations.Mapper;

/**
* @author gsh
* @description 针对表【crm_security_user(系统用户表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.SecurityUser
*/
@Mapper
public interface SecurityUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SecurityUser record);

    int insertSelective(SecurityUser record);

    SecurityUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SecurityUser record);

    int updateByPrimaryKey(SecurityUser record);

}
