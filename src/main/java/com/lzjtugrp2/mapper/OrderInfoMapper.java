package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.OrderInfo;

/**
* @author gsh
* @description 针对表【crm_order_info(订单管理表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.OrderInfo
*/
public interface OrderInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

}
