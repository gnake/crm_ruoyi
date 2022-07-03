package com.lzjtugrp2.service;

import com.lzjtugrp2.domain.SysCodelist;
import com.lzjtugrp2.domain.dto.SysCodeListDTO;

import java.util.List;

public interface SysCodeListService {

    List<SysCodeListDTO> selectAll();

    int insert(SysCodelist sysCodelist);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCodelist record);
}
