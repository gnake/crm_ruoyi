package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CodeList;

/**
 * 编码管理Service接口
 * 
 * @author gsh
 * @date 2022-07-07
 */
public interface ICodeListService 
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
     * 批量删除编码管理
     * 
     * @param codeIds 需要删除的编码管理主键集合
     * @return 结果
     */
    int deleteCodeListByCodeIds(String codeIds);

    /**
     * 删除编码管理信息
     * 
     * @param codeId 编码管理主键
     * @return 结果
     */
    int deleteCodeListByCodeId(Long codeId);
}
