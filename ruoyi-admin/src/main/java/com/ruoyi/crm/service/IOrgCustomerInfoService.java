package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.OrgCustomerInfo;

/**
 * 潜在客户Service接口
 * 
 * @author zxl
 * @date 2022-07-07
 */
public interface IOrgCustomerInfoService 
{
    /**
     * 查询潜在客户
     * 
     * @param orgId 潜在客户主键
     * @return 潜在客户
     */
        OrgCustomerInfo selectOrgCustomerInfoByOrgId(Long orgId);

    /**
     * 查询潜在客户列表
     * 
     * @param orgCustomerInfo 潜在客户
     * @return 潜在客户集合
     */
    List<OrgCustomerInfo> selectOrgCustomerInfoList(OrgCustomerInfo orgCustomerInfo);

    /**
     * 新增潜在客户
     * 
     * @param orgCustomerInfo 潜在客户
     * @return 结果
     */
    int insertOrgCustomerInfo(OrgCustomerInfo orgCustomerInfo);

    /**
     * 修改潜在客户
     * 
     * @param orgCustomerInfo 潜在客户
     * @return 结果
     */
    int updateOrgCustomerInfo(OrgCustomerInfo orgCustomerInfo);

    /**
     * 批量删除潜在客户
     * 
     * @param orgIds 需要删除的潜在客户主键集合
     * @return 结果
     */
    int deleteOrgCustomerInfoByOrgIds(String orgIds);

    /**
     * 删除潜在客户信息
     * 
     * @param orgId 潜在客户主键
     * @return 结果
     */
    int deleteOrgCustomerInfoByOrgId(Long orgId);
}
