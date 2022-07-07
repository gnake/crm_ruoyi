package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.CrmOrgInfo;

/**
 * 潜在客户Service接口
 * 
 * @author zxl
 * @date 2022-07-07
 */
public interface ICrmOrgInfoService 
{
    /**
     * 查询潜在客户
     * 
     * @param orgId 潜在客户主键
     * @return 潜在客户
     */
    public CrmOrgInfo selectCrmOrgInfoByOrgId(Long orgId);

    /**
     * 查询潜在客户列表
     * 
     * @param crmOrgInfo 潜在客户
     * @return 潜在客户集合
     */
    public List<CrmOrgInfo> selectCrmOrgInfoList(CrmOrgInfo crmOrgInfo);

    /**
     * 新增潜在客户
     * 
     * @param crmOrgInfo 潜在客户
     * @return 结果
     */
    public int insertCrmOrgInfo(CrmOrgInfo crmOrgInfo);

    /**
     * 修改潜在客户
     * 
     * @param crmOrgInfo 潜在客户
     * @return 结果
     */
    public int updateCrmOrgInfo(CrmOrgInfo crmOrgInfo);

    /**
     * 批量删除潜在客户
     * 
     * @param orgIds 需要删除的潜在客户主键集合
     * @return 结果
     */
    public int deleteCrmOrgInfoByOrgIds(String orgIds);

    /**
     * 删除潜在客户信息
     * 
     * @param orgId 潜在客户主键
     * @return 结果
     */
    public int deleteCrmOrgInfoByOrgId(Long orgId);
}