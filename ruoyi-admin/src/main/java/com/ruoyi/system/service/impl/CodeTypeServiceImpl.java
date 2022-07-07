package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CodeTypeMapper;
import com.ruoyi.system.domain.CodeType;
import com.ruoyi.system.service.ICodeTypeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 编码类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-07
 */
@Service
public class CodeTypeServiceImpl implements ICodeTypeService 
{
    @Autowired
    private CodeTypeMapper codeTypeMapper;

    /**
     * 查询编码类型
     * 
     * @param typeId 编码类型主键
     * @return 编码类型
     */
    @Override
    public CodeType selectCodeTypeByTypeId(Long typeId)
    {
        return codeTypeMapper.selectCodeTypeByTypeId(typeId);
    }

    /**
     * 查询编码类型列表
     * 
     * @param codeType 编码类型
     * @return 编码类型
     */
    @Override
    public List<CodeType> selectCodeTypeList(CodeType codeType)
    {
        return codeTypeMapper.selectCodeTypeList(codeType);
    }

    /**
     * 新增编码类型
     * 
     * @param codeType 编码类型
     * @return 结果
     */
    @Override
    public int insertCodeType(CodeType codeType)
    {
        return codeTypeMapper.insertCodeType(codeType);
    }

    /**
     * 修改编码类型
     * 
     * @param codeType 编码类型
     * @return 结果
     */
    @Override
    public int updateCodeType(CodeType codeType)
    {
        return codeTypeMapper.updateCodeType(codeType);
    }

    /**
     * 批量删除编码类型
     * 
     * @param typeIds 需要删除的编码类型主键
     * @return 结果
     */
    @Override
    public int deleteCodeTypeByTypeIds(String typeIds)
    {
        return codeTypeMapper.deleteCodeTypeByTypeIds(Convert.toStrArray(typeIds));
    }

    /**
     * 删除编码类型信息
     * 
     * @param typeId 编码类型主键
     * @return 结果
     */
    @Override
    public int deleteCodeTypeByTypeId(Long typeId)
    {
        return codeTypeMapper.deleteCodeTypeByTypeId(typeId);
    }
}
