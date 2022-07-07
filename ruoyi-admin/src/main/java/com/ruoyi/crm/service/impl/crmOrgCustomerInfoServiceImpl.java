package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.crmOrgCustomerInfoMapper;
import com.ruoyi.crm.domain.crmOrgCustomerInfo;
import com.ruoyi.crm.service.IcrmOrgCustomerInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 潜在客户Service业务层处理
 * 
 * @author zxl
 * @date 2022-07-07
 */
@Service
public class crmOrgCustomerInfoServiceImpl implements IcrmOrgCustomerInfoService 
{
    @Autowired
    private crmOrgCustomerInfoMapper crmOrgCustomerInfoMapper;

    /**
     * 查询潜在客户
     * 
     * @param orgId 潜在客户主键
     * @return 潜在客户
     */
    @Override
    public crmOrgCustomerInfo selectcrmOrgCustomerInfoByOrgId(Long orgId)
    {
        return crmOrgCustomerInfoMapper.selectcrmOrgCustomerInfoByOrgId(orgId);
    }

    /**
     * 查询潜在客户列表
     * 
     * @param crmOrgCustomerInfo 潜在客户
     * @return 潜在客户
     */
    @Override
    public List<crmOrgCustomerInfo> selectcrmOrgCustomerInfoList(crmOrgCustomerInfo crmOrgCustomerInfo)
    {
        return crmOrgCustomerInfoMapper.selectcrmOrgCustomerInfoList(crmOrgCustomerInfo);
    }

    /**
     * 新增潜在客户
     * 
     * @param crmOrgCustomerInfo 潜在客户
     * @return 结果
     */
    @Override
    public int insertcrmOrgCustomerInfo(crmOrgCustomerInfo crmOrgCustomerInfo)
    {
        return crmOrgCustomerInfoMapper.insertcrmOrgCustomerInfo(crmOrgCustomerInfo);
    }

    /**
     * 修改潜在客户
     * 
     * @param crmOrgCustomerInfo 潜在客户
     * @return 结果
     */
    @Override
    public int updatecrmOrgCustomerInfo(crmOrgCustomerInfo crmOrgCustomerInfo)
    {
        return crmOrgCustomerInfoMapper.updatecrmOrgCustomerInfo(crmOrgCustomerInfo);
    }

    /**
     * 批量删除潜在客户
     * 
     * @param orgIds 需要删除的潜在客户主键
     * @return 结果
     */
    @Override
    public int deletecrmOrgCustomerInfoByOrgIds(String orgIds)
    {
        return crmOrgCustomerInfoMapper.deletecrmOrgCustomerInfoByOrgIds(Convert.toStrArray(orgIds));
    }

    /**
     * 删除潜在客户信息
     * 
     * @param orgId 潜在客户主键
     * @return 结果
     */
    @Override
    public int deletecrmOrgCustomerInfoByOrgId(Long orgId)
    {
        return crmOrgCustomerInfoMapper.deletecrmOrgCustomerInfoByOrgId(orgId);
    }
}
