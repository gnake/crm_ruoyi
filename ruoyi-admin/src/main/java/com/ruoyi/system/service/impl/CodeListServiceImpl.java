package com.ruoyi.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.system.domain.CodeType;
import com.ruoyi.system.mapper.CodeListMapper;
import com.ruoyi.system.domain.CodeList;
import com.ruoyi.system.service.ICodeListService;
import com.ruoyi.common.core.text.Convert;

/**
 * 编码管理Service业务层处理
 *
 * @author gsh
 * @date 2022-07-07
 */
@Service
public class CodeListServiceImpl implements ICodeListService {
    @Autowired
    private CodeListMapper codeListMapper;

    /**
     * 查询编码管理
     *
     * @param codeId 编码管理主键
     * @return 编码管理
     */
    @Override
    public CodeList selectCodeListByCodeId(Long codeId) {
        return codeListMapper.selectCodeListByCodeId(codeId);
    }

    /**
     * 查询编码管理列表
     *
     * @param codeList 编码管理
     * @return 编码管理
     */
    @Override
    public List<CodeList> selectCodeListList(CodeList codeList) {
        final List<CodeList> codeLists = codeListMapper.selectCodeListList(codeList);
        List<CodeType> list = new ArrayList<>();
        final CodeType codeType = new CodeType();
        codeType.setTypeGroup("111");
        list.add(codeType);
        codeList.setCodeTypeList(list);
        return codeLists;
    }

    /**
     * 新增编码管理
     *
     * @param codeList 编码管理
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCodeList(CodeList codeList) {
        int rows = codeListMapper.insertCodeList(codeList);
        insertCodeType(codeList);
        return rows;
    }

    /**
     * 修改编码管理
     *
     * @param codeList 编码管理
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCodeList(CodeList codeList) {
        codeListMapper.deleteCodeTypeByTypeId(codeList.getCodeId());
        insertCodeType(codeList);
        return codeListMapper.updateCodeList(codeList);
    }

    /**
     * 批量删除编码管理
     *
     * @param codeIds 需要删除的编码管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCodeListByCodeIds(String codeIds) {
        codeListMapper.deleteCodeTypeByTypeIds(Convert.toStrArray(codeIds));
        return codeListMapper.deleteCodeListByCodeIds(Convert.toStrArray(codeIds));
    }

    /**
     * 删除编码管理信息
     *
     * @param codeId 编码管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCodeListByCodeId(Long codeId) {
        codeListMapper.deleteCodeTypeByTypeId(codeId);
        return codeListMapper.deleteCodeListByCodeId(codeId);
    }

    /**
     * 新增编码类型信息
     *
     * @param codeList 编码管理对象
     */
    public void insertCodeType(CodeList codeList) {
        List<CodeType> codeTypeList = codeList.getCodeTypeList();
        Long codeId = codeList.getCodeId();
        if (StringUtils.isNotNull(codeTypeList)) {
            List<CodeType> list = new ArrayList<CodeType>();
            for (CodeType codeType : codeTypeList) {
                codeType.setTypeId(codeId);
                list.add(codeType);
            }
            if (list.size() > 0) {
                codeListMapper.batchCodeType(list);
            }
        }
    }
}
