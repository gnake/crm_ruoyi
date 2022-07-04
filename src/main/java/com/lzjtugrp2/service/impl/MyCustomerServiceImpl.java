package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.CustomerInfo;
import com.lzjtugrp2.mapper.CustomerInfoMapper;
import com.lzjtugrp2.service.MyCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyCustomerServiceImpl implements MyCustomerService {
    @Autowired
    private CustomerInfoMapper customerInfoMapper;

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

    @Override
    public List<CustomerInfo> selectAll() {
        return customerInfoMapper.selectAll();
    }
}
