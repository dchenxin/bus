package com.ruoyi.controller;

import java.util.Arrays;
import java.util.List;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
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
import com.ruoyi.domain.Factory;
import com.ruoyi.service.IFactoryService;
import com.ruoyi.mapper.FactoryMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备厂商信息Controller
 *
 * @author dcx
 * @date 2023-04-24
 */
@RestController
@RequestMapping("/ruoyi/factory")
public class FactoryController extends BaseController {
    @Autowired
    private IFactoryService factoryService;

    @Autowired
    private FactoryMapper factoryMapper;

    /**
     * 查询设备厂商信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:factory:list')")
    @GetMapping("/list")
        public TableDataInfo list(Factory factory) {
        startPage();
        List<Factory> list = factoryService.list(Wrappers.query(factory));
        return getDataTable(list);
    }

    /**
     * 导出设备厂商信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:factory:export')")
    @Log(title = "设备厂商信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Factory factory) {
        List<Factory> list = factoryService.list(Wrappers.query(factory));
        ExcelUtil<Factory> util = new ExcelUtil<Factory>(Factory.class);
        return util.exportExcel(list, "factory");
    }

    /**
     * 获取设备厂商信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:factory:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(factoryService.getById(id));
    }

    /**
     * 新增设备厂商信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:factory:add')")
    @Log(title = "设备厂商信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Factory factory)
    {
        return toAjax(factoryMapper.insert(factory));
    }

    /**
     * 修改设备厂商信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:factory:edit')")
    @Log(title = "设备厂商信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Factory factory)
    {
        return toAjax(factoryMapper.updateById(factory));
    }

    /**
     * 删除设备厂商信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:factory:remove')")
    @Log(title = "设备厂商信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(factoryMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
