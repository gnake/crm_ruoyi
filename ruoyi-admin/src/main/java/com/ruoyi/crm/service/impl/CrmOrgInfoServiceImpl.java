package com.ruoyi.crm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.CrmOrgInfoMapper;
import com.ruoyi.crm.domain.CrmOrgInfo;
import com.ruoyi.crm.service.ICrmOrgInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 潜在客户Service业务层处理
 * 
 * @author zxl
 * @date 2022-07-07
 */
@Service
public class CrmOrgInfoServiceImpl implements ICrmOrgInfoService 
{
    @Autowired
    private CrmOrgInfoMapper crmOrgInfoMapper;

    /**
     * 查询潜在客户
     * 
     * @param orgId 潜在客户主键
     * @return 潜在客户
     */
    @Override
    public CrmOrgInfo selectCrmOrgInfoByOrgId(Long orgId)
    {
        return crmOrgInfoMapper.selectCrmOrgInfoByOrgId(orgId);
    }

    /**
     * 查询潜在客户列表
     * 
     * @param crmOrgInfo 潜在客户
     * @return 潜在客户
     */
    @Override
    public List<CrmOrgInfo> selectCrmOrgInfoList(CrmOrgInfo crmOrgInfo)
    {
        return crmOrgInfoMapper.selectCrmOrgInfoList(crmOrgInfo);
    }

    /**
     * 新增潜在客户
     * 
     * @param crmOrgInfo 潜在客户
     * @return 结果
     */
    @Override
    public int insertCrmOrgInfo(CrmOrgInfo crmOrgInfo)
    {
        return crmOrgInfoMapper.insertCrmOrgInfo(crmOrgInfo);
    }

    /**
     * 修改潜在客户
     * 
     * @param crmOrgInfo 潜在客户
     * @return 结果
     */
    @Override
    public int updateCrmOrgInfo(CrmOrgInfo crmOrgInfo)
    {
        return crmOrgInfoMapper.updateCrmOrgInfo(crmOrgInfo);
    }

    /**
     * 批量删除潜在客户
     * 
     * @param orgIds 需要删除的潜在客户主键
     * @return 结果
     */
    @Override
    public int deleteCrmOrgInfoByOrgIds(String orgIds)
    {
        return crmOrgInfoMapper.deleteCrmOrgInfoByOrgIds(Convert.toStrArray(orgIds));
    }

    /**
     * 删除潜在客户信息
     * 
     * @param orgId 潜在客户主键
     * @return 结果
     */
    @Override
    public int deleteCrmOrgInfoByOrgId(Long orgId)
    {
        return crmOrgInfoMapper.deleteCrmOrgInfoByOrgId(orgId);
    }
}
