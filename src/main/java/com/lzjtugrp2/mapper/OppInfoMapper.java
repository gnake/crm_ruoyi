package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.OppInfo;

/**
* @author gsh
* @description 针对表【crm_opp_info(商机管理表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.OppInfo
*/
public interface OppInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OppInfo record);

    int insertSelective(OppInfo record);

    OppInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OppInfo record);

    int updateByPrimaryKey(OppInfo record);

}
