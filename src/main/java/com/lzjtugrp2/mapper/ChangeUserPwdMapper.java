package com.lzjtugrp2.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChangeUserPwdMapper {
    public void changePassword(String userName,String userPwd);
}
