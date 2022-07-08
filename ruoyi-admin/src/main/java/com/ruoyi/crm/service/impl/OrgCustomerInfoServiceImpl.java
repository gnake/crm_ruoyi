package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.OrgCustomerInfoMapper;
import com.ruoyi.crm.domain.OrgCustomerInfo;
import com.ruoyi.crm.service.IOrgCustomerInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 潜在客户Service业务层处理
 * 
 * @author swj
 * @date 2022-07-08
 */
@Service
public class OrgCustomerInfoServiceImpl implements IOrgCustomerInfoService 
{
    @Autowired
    private OrgCustomerInfoMapper orgCustomerInfoMapper;

    /**
     * 查询潜在客户
     * 
     * @param orgId 潜在客户主键
     * @return 潜在客户
     */
    @Override
    public OrgCustomerInfo selectOrgCustomerInfoByOrgId(Long orgId)
    {
        return orgCustomerInfoMapper.selectOrgCustomerInfoByOrgId(orgId);
    }

    /**
     * 查询潜在客户列表
     * 
     * @param orgCustomerInfo 潜在客户
     * @return 潜在客户
     */
    @Override
    public List<OrgCustomerInfo> selectOrgCustomerInfoList(OrgCustomerInfo orgCustomerInfo)
    {
        return orgCustomerInfoMapper.selectOrgCustomerInfoList(orgCustomerInfo);
    }

    /**
     * 新增潜在客户
     * 
     * @param orgCustomerInfo 潜在客户
     * @return 结果
     */
    @Override
    public int insertOrgCustomerInfo(OrgCustomerInfo orgCustomerInfo)
    {
        return orgCustomerInfoMapper.insertOrgCustomerInfo(orgCustomerInfo);
    }

    /**
     * 修改潜在客户
     * 
     * @param orgCustomerInfo 潜在客户
     * @return 结果
     */
    @Override
    public int updateOrgCustomerInfo(OrgCustomerInfo orgCustomerInfo)
    {
        return orgCustomerInfoMapper.updateOrgCustomerInfo(orgCustomerInfo);
    }

    /**
     * 批量删除潜在客户
     * 
     * @param orgIds 需要删除的潜在客户主键
     * @return 结果
     */
    @Override
    public int deleteOrgCustomerInfoByOrgIds(String orgIds)
    {
        return orgCustomerInfoMapper.deleteOrgCustomerInfoByOrgIds(Convert.toStrArray(orgIds));
    }

    /**
     * 删除潜在客户信息
     * 
     * @param orgId 潜在客户主键
     * @return 结果
     */
    @Override
    public int deleteOrgCustomerInfoByOrgId(Long orgId)
    {
        return orgCustomerInfoMapper.deleteOrgCustomerInfoByOrgId(orgId);
    }
}
