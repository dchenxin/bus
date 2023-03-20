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
import com.ruoyi.domain.ModelClickStatistics;
import com.ruoyi.service.IModelClickStatisticsService;
import com.ruoyi.mapper.ModelClickStatisticsMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 模块点击统计Controller
 *
 * @author luz
 * @date 2023-03-06
 */
@RestController
@RequestMapping("/module/modelClickStatistics")
public class ModelClickStatisticsController extends BaseController {
    @Autowired
    private IModelClickStatisticsService modelClickStatisticsService;

    @Autowired
    private ModelClickStatisticsMapper modelClickStatisticsMapper;

    /**
     * 查询模块点击统计列表
     */
    @PreAuthorize("@ss.hasPermi('module:modelClickStatistics:list')")
    @GetMapping("/list")
        public TableDataInfo list(ModelClickStatistics modelClickStatistics) {
        startPage();
        List<ModelClickStatistics> list = modelClickStatisticsService.list(Wrappers.query(modelClickStatistics));
        return getDataTable(list);
    }

    /**
     * 导出模块点击统计列表
     */
    @PreAuthorize("@ss.hasPermi('module:modelClickStatistics:export')")
    @Log(title = "模块点击统计", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ModelClickStatistics modelClickStatistics) {
        List<ModelClickStatistics> list = modelClickStatisticsService.list(Wrappers.query(modelClickStatistics));
        ExcelUtil<ModelClickStatistics> util = new ExcelUtil<ModelClickStatistics>(ModelClickStatistics.class);
        return util.exportExcel(list, "modelClickStatistics");
    }

    /**
     * 获取模块点击统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('module:modelClickStatistics:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(modelClickStatisticsService.getById(id));
    }

    /**
     * 新增模块点击统计
     */
    @PreAuthorize("@ss.hasPermi('module:modelClickStatistics:add')")
    @Log(title = "模块点击统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ModelClickStatistics modelClickStatistics)
    {
        return toAjax(modelClickStatisticsMapper.insert(modelClickStatistics));
    }

    /**
     * 修改模块点击统计
     */
    @PreAuthorize("@ss.hasPermi('module:modelClickStatistics:edit')")
    @Log(title = "模块点击统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ModelClickStatistics modelClickStatistics)
    {
        return toAjax(modelClickStatisticsMapper.updateById(modelClickStatistics));
    }

    /**
     * 删除模块点击统计
     */
    @PreAuthorize("@ss.hasPermi('module:modelClickStatistics:remove')")
    @Log(title = "模块点击统计", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(modelClickStatisticsMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
