package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.CustomerInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author gsh
* @description 针对表【crm_customer_info(客户管理表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.CustomerInfo
*/
@Mapper
public interface CustomerInfoMapper {

    int deleteByPrimaryKey(long id);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    List<CustomerInfo> selectAll();
}
