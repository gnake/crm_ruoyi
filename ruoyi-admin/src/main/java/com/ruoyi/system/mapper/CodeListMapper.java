package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CodeList;
import com.ruoyi.system.domain.CodeType;

/**
 * 编码管理Mapper接口
 * 
 * @author gsh
 * @date 2022-07-07
 */
public interface CodeListMapper 
{
    /**
     * 查询编码管理
     * 
     * @param codeId 编码管理主键
     * @return 编码管理
     */
    CodeList selectCodeListByCodeId(Long codeId);

    /**
     * 查询编码管理列表
     * 
     * @param codeList 编码管理
     * @return 编码管理集合
     */
    List<CodeList> selectCodeListList(CodeList codeList);

    /**
     * 新增编码管理
     * 
     * @param codeList 编码管理
     * @return 结果
     */
    int insertCodeList(CodeList codeList);

    /**
     * 修改编码管理
     * 
     * @param codeList 编码管理
     * @return 结果
     */
    int updateCodeList(CodeList codeList);

    /**
     * 删除编码管理
     * 
     * @param codeId 编码管理主键
     * @return 结果
     */
    int deleteCodeListByCodeId(Long codeId);

    /**
     * 批量删除编码管理
     * 
     * @param codeIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCodeListByCodeIds(String[] codeIds);

    /**
     * 批量删除编码类型
     * 
     * @param codeIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteCodeTypeByTypeIds(String[] codeIds);
    
    /**
     * 批量新增编码类型
     * 
     * @param codeTypeList 编码类型列表
     * @return 结果
     */
    int batchCodeType(List<CodeType> codeTypeList);
    

    /**
     * 通过编码管理主键删除编码类型信息
     * 
     * @param codeId 编码管理ID
     * @return 结果
     */
    int deleteCodeTypeByTypeId(Long codeId);
}
