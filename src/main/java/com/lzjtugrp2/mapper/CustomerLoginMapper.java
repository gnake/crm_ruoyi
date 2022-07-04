package com.lzjtugrp2.mapper;

import com.lzjtugrp2.domain.SecurityUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerLoginMapper {
    SecurityUser findByUcodeAndPwd(String usercode, String password);

}
