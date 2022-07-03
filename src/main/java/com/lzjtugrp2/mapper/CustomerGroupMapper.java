package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.CustomerGroup;

/**
* @author gsh
* @description 针对表【crm_customer_group(客户分组表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.CustomerGroup
*/
public interface CustomerGroupMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CustomerGroup record);

    int insertSelective(CustomerGroup record);

    CustomerGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerGroup record);

    int updateByPrimaryKey(CustomerGroup record);

}
