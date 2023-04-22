package com.ruoyi.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.CompanyMapper;
import com.ruoyi.domain.Company;
import com.ruoyi.service.ICompanyService;

/**
 * 公司信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-21
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {
    @Autowired
    private CompanyMapper companyMapper;

}
