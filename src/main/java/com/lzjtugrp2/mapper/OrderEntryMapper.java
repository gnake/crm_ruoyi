package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.OrderEntry;

/**
* @author gsh
* @description 针对表【crm_order_entry(订单明细表)】的数据库操作Mapper
* @createDate 2022-07-02 09:09:08
* @Entity com.lzjtuGrp2.domain.OrderEntry
*/
public interface OrderEntryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrderEntry record);

    int insertSelective(OrderEntry record);

    OrderEntry selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderEntry record);

    int updateByPrimaryKey(OrderEntry record);

}
