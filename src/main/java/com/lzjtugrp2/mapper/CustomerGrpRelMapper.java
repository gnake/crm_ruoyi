package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.CustomerGrpRel;

/**
* @author gsh
* @description 针对表【crm_customer_grp_rel(分组跟客户关联表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.CustomerGrpRel
*/
public interface CustomerGrpRelMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CustomerGrpRel record);

    int insertSelective(CustomerGrpRel record);

    CustomerGrpRel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerGrpRel record);

    int updateByPrimaryKey(CustomerGrpRel record);

}
