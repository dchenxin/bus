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
import com.ruoyi.domain.Line;
import com.ruoyi.service.ILineService;
import com.ruoyi.mapper.LineMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 线路信息Controller
 *
 * @author dcx
 * @date 2023-04-27
 */
@RestController
@RequestMapping("/ruoyi/line")
public class LineController extends BaseController {
    @Autowired
    private ILineService lineService;

    @Autowired
    private LineMapper lineMapper;

    /**
     * 查询线路信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:line:list')")
    @GetMapping("/list")
        public TableDataInfo list(Line line) {
        startPage();
        List<Line> list = lineService.list(Wrappers.query(line));
        return getDataTable(list);
    }
    
    /**
     * 导出线路信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:line:export')")
    @Log(title = "线路信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Line line) {
        List<Line> list = lineService.list(Wrappers.query(line));
        ExcelUtil<Line> util = new ExcelUtil<Line>(Line.class);
        return util.exportExcel(list, "line");
    }

    /**
     * 获取线路信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:line:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(lineService.getById(id));
    }

    /**
     * 新增线路信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:line:add')")
    @Log(title = "线路信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Line line)
    {
        return toAjax(lineMapper.insert(line));
    }

    /**
     * 修改线路信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:line:edit')")
    @Log(title = "线路信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Line line)
    {
        return toAjax(lineMapper.updateById(line));
    }

    /**
     * 删除线路信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:line:remove')")
    @Log(title = "线路信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(lineMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
