package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CodeType;

/**
 * 编码类型Mapper接口
 * 
 * @author ruoyi
 * @date 2022-07-07
 */
public interface CodeTypeMapper 
{
    /**
     * 查询编码类型
     * 
     * @param typeId 编码类型主键
     * @return 编码类型
     */
    CodeType selectCodeTypeByTypeId(Long typeId);

    /**
     * 查询编码类型列表
     * 
     * @param codeType 编码类型
     * @return 编码类型集合
     */
    List<CodeType> selectCodeTypeList(CodeType codeType);

    /**
     * 新增编码类型
     * 
     * @param codeType 编码类型
     * @return 结果
     */
    int insertCodeType(CodeType codeType);

    /**
     * 修改编码类型
     * 
     * @param codeType 编码类型
     * @return 结果
     */
    int updateCodeType(CodeType codeType);

    /**
     * 删除编码类型
     * 
     * @param typeId 编码类型主键
     * @return 结果
     */
    int deleteCodeTypeByTypeId(Long typeId);

    /**
     * 批量删除编码类型
     * 
     * @param typeIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCodeTypeByTypeIds(String[] typeIds);
}
