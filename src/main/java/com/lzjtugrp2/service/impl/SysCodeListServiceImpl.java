package com.lzjtugrp2.service.impl;

import com.lzjtugrp2.domain.SysCodelist;
import com.lzjtugrp2.domain.SysCodetype;
import com.lzjtugrp2.domain.dto.SysCodeListDTO;
import com.lzjtugrp2.mapper.SysCodelistMapper;
import com.lzjtugrp2.mapper.SysCodetypeMapper;
import com.lzjtugrp2.service.SysCodeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysCodeListServiceImpl implements SysCodeListService {
    @Autowired
    private SysCodelistMapper sysCodelistMapper;

    @Autowired
    private SysCodetypeMapper sysCodetypeMapper;

    @Override
    public List<SysCodeListDTO> selectAll() {
        List<SysCodeListDTO> sysCodeListDTOS = new ArrayList<>();
        List<SysCodelist> sysCodelists = sysCodelistMapper.selectAll();
        for (SysCodelist sysCodelist : sysCodelists) {
            SysCodetype sysCodetype = sysCodetypeMapper.selectByPrimaryKey(sysCodelist.getTypeId());
            SysCodeListDTO sysCodeListDTO = new SysCodeListDTO();
            sysCodeListDTO.setCodeId(sysCodelist.getCodeId());
            sysCodeListDTO.setTypeIdent(sysCodetype.getTypeIdent());
            sysCodeListDTO.setCodeValue(sysCodelist.getCodeValue());
            sysCodeListDTO.setCodeSort(sysCodelist.getCodeSort());
            sysCodeListDTO.setCodeValue(sysCodetype.getTypeIdent());
            sysCodeListDTO.setTypeName(sysCodetype.getTypeName());
            sysCodeListDTO.setIsEffective(sysCodetype.getIsEffective());
            sysCodeListDTO.setIsEditable(sysCodetype.getIsEditable());
            sysCodeListDTO.setIsExtend(sysCodetype.getIsExtend());
            sysCodeListDTOS.add(sysCodeListDTO);
        }
        return sysCodeListDTOS;
    }

    @Override
    public int insert(SysCodelist sysCodelist) {
        int i = sysCodelistMapper.insertSelective(sysCodelist);
        return i;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        int i = sysCodelistMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int updateByPrimaryKeySelective(SysCodelist sysCodelist) {
        int i = sysCodelistMapper.updateByPrimaryKeySelective(sysCodelist);
        return i;
    }


}
