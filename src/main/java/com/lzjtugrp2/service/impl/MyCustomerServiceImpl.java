package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.CustomerInfo;
import com.lzjtugrp2.service.MyCustomerService;
import org.springframework.stereotype.Service;

@Service
public class MyCustomerServiceImpl implements MyCustomerService {
    @Override
    public int deleteByPrimaryKey(long id) {
        return 0;
    }

    @Override
    public int insert(CustomerInfo record) {
        return 0;
    }

    @Override
    public int insertSelective(CustomerInfo record) {
        return 0;
    }

    @Override
    public CustomerInfo selectByPrimaryKey(long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CustomerInfo record) {
        return 0;
    }
}
