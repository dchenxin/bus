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
import com.ruoyi.domain.Guarder;
import com.ruoyi.service.IGuarderService;
import com.ruoyi.mapper.GuarderMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 守线员信息Controller
 *
 * @author dcx
 * @date 2023-04-26
 */
@RestController
@RequestMapping("/ruoyi/guarder")
public class GuarderController extends BaseController {
    @Autowired
    private IGuarderService guarderService;

    @Autowired
    private GuarderMapper guarderMapper;

    /**
     * 查询守线员信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:guarder:list')")
    @GetMapping("/list")
        public TableDataInfo list(Guarder guarder) {
        startPage();
        List<Guarder> list = guarderService.list(Wrappers.query(guarder));
        return getDataTable(list);
    }

    /**
     * 导出守线员信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:guarder:export')")
    @Log(title = "守线员信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Guarder guarder) {
        List<Guarder> list = guarderService.list(Wrappers.query(guarder));
        ExcelUtil<Guarder> util = new ExcelUtil<Guarder>(Guarder.class);
        return util.exportExcel(list, "guarder");
    }

    /**
     * 获取守线员信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:guarder:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(guarderService.getById(id));
    }

    /**
     * 新增守线员信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:guarder:add')")
    @Log(title = "守线员信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Guarder guarder)
    {
        return toAjax(guarderMapper.insert(guarder));
    }

    /**
     * 修改守线员信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:guarder:edit')")
    @Log(title = "守线员信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Guarder guarder)
    {
        return toAjax(guarderMapper.updateById(guarder));
    }

    /**
     * 删除守线员信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:guarder:remove')")
    @Log(title = "守线员信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(guarderMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
