package com.ruoyi.controller;

import java.util.Arrays;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ruoyi.domain.enums.CompanyTypeEnums;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.domain.Company;
import com.ruoyi.service.ICompanyService;
import com.ruoyi.mapper.CompanyMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公司信息Controller
 *
 * @author dcx
 * @date 2023-04-21
 */
@RestController
@RequestMapping("/ruoyi/company")
public class CompanyController extends BaseController {
    @Autowired
    private ICompanyService companyService;

    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 查询公司信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:company:list')")
    @GetMapping("/list")
        public TableDataInfo list(Company company) {
        startPage();
        List<Company> list = companyService.list(Wrappers.query(company));
        return getDataTable(list);
    }

    /**
     * 导出公司信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:company:export')")
    @Log(title = "公司信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Company company) {
        List<Company> list = companyService.list(Wrappers.query(company));
        ExcelUtil<Company> util = new ExcelUtil<Company>(Company.class);
        return util.exportExcel(list, "company");
    }

    /**
     * 获取公司信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:company:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(companyService.getById(id));
    }

    /**
     * 新增公司信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:company:add')")
    @Log(title = "公司信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Company company)
    {
        return toAjax(companyMapper.insert(company));
    }

    /**
     * 修改公司信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:company:edit')")
    @Log(title = "公司信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Company company)
    {
        return toAjax(companyMapper.updateById(company));
    }

    /**
     * 删除公司信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:company:remove')")
    @Log(title = "公司信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(companyMapper.deleteBatchIds(Arrays.asList(ids)));
    }

    /**
     * 获取一级公司
     */
    @GetMapping("/getParent")
    public AjaxResult getParent() {
        LambdaQueryWrapper<Company> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(Company::getTypeId, CompanyTypeEnums.ONE_COMPANY.getValue());
        return AjaxResult.success(companyMapper.selectList(wrapper));
    }
}
