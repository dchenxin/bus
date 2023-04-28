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
import com.ruoyi.domain.Inspector;
import com.ruoyi.service.IInspectorService;
import com.ruoyi.mapper.InspectorMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 趟检员信息Controller
 *
 * @author dcx
 * @date 2023-04-26
 */
@RestController
@RequestMapping("/ruoyi/inspector")
public class InspectorController extends BaseController {
    @Autowired
    private IInspectorService inspectorService;

    @Autowired
    private InspectorMapper inspectorMapper;

    /**
     * 查询趟检员信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:inspector:list')")
    @GetMapping("/list")
        public TableDataInfo list(Inspector inspector) {
        startPage();
        List<Inspector> list = inspectorService.list(Wrappers.query(inspector));
        return getDataTable(list);
    }
    
    /**
     * 导出趟检员信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:inspector:export')")
    @Log(title = "趟检员信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Inspector inspector) {
        List<Inspector> list = inspectorService.list(Wrappers.query(inspector));
        ExcelUtil<Inspector> util = new ExcelUtil<Inspector>(Inspector.class);
        return util.exportExcel(list, "inspector");
    }

    /**
     * 获取趟检员信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:inspector:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(inspectorService.getById(id));
    }

    /**
     * 新增趟检员信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:inspector:add')")
    @Log(title = "趟检员信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Inspector inspector)
    {
        return toAjax(inspectorMapper.insert(inspector));
    }

    /**
     * 修改趟检员信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:inspector:edit')")
    @Log(title = "趟检员信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Inspector inspector)
    {
        return toAjax(inspectorMapper.updateById(inspector));
    }

    /**
     * 删除趟检员信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:inspector:remove')")
    @Log(title = "趟检员信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(inspectorMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
