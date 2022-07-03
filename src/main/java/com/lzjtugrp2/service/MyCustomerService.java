package com.lzjtugrp2.service;

import com.lzjtugrp2.domain.CustomerInfo;

public interface MyCustomerService {
    int deleteByPrimaryKey(long id);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);
}
