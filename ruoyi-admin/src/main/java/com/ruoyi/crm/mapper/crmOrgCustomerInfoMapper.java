package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.crmOrgCustomerInfo;

/**
 * 潜在客户Mapper接口
 * 
 * @author zxl
 * @date 2022-07-07
 */
public interface crmOrgCustomerInfoMapper 
{
    /**
     * 查询潜在客户
     * 
     * @param orgId 潜在客户主键
     * @return 潜在客户
     */
        crmOrgCustomerInfo selectcrmOrgCustomerInfoByOrgId(Long orgId);

    /**
     * 查询潜在客户列表
     * 
     * @param crmOrgCustomerInfo 潜在客户
     * @return 潜在客户集合
     */
    List<crmOrgCustomerInfo> selectcrmOrgCustomerInfoList(crmOrgCustomerInfo crmOrgCustomerInfo);

    /**
     * 新增潜在客户
     * 
     * @param crmOrgCustomerInfo 潜在客户
     * @return 结果
     */
    int insertcrmOrgCustomerInfo(crmOrgCustomerInfo crmOrgCustomerInfo);

    /**
     * 修改潜在客户
     * 
     * @param crmOrgCustomerInfo 潜在客户
     * @return 结果
     */
    int updatecrmOrgCustomerInfo(crmOrgCustomerInfo crmOrgCustomerInfo);

    /**
     * 删除潜在客户
     * 
     * @param orgId 潜在客户主键
     * @return 结果
     */
    int deletecrmOrgCustomerInfoByOrgId(Long orgId);

    /**
     * 批量删除潜在客户
     * 
     * @param orgIds 需要删除的数据主键集合
     * @return 结果
     */
    int deletecrmOrgCustomerInfoByOrgIds(String[] orgIds);
}
