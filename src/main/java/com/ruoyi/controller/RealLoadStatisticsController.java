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
import com.ruoyi.domain.RealLoadStatistics;
import com.ruoyi.service.IRealLoadStatisticsService;
import com.ruoyi.mapper.RealLoadStatisticsMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 实载率统计Controller
 *
 * @author luz
 * @date 2023-03-06
 */
@RestController
@RequestMapping("/module/realLoadStatistics")
public class RealLoadStatisticsController extends BaseController {
    @Autowired
    private IRealLoadStatisticsService realLoadStatisticsService;

    @Autowired
    private RealLoadStatisticsMapper realLoadStatisticsMapper;

    /**
     * 查询实载率统计列表
     */
    @PreAuthorize("@ss.hasPermi('module:realLoadStatistics:list')")
    @GetMapping("/list")
        public TableDataInfo list(RealLoadStatistics realLoadStatistics) {
        startPage();
        List<RealLoadStatistics> list = realLoadStatisticsService.list(Wrappers.query(realLoadStatistics));
        return getDataTable(list);
    }

    /**
     * 导出实载率统计列表
     */
    @PreAuthorize("@ss.hasPermi('module:realLoadStatistics:export')")
    @Log(title = "实载率统计", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(RealLoadStatistics realLoadStatistics) {
        List<RealLoadStatistics> list = realLoadStatisticsService.list(Wrappers.query(realLoadStatistics));
        ExcelUtil<RealLoadStatistics> util = new ExcelUtil<RealLoadStatistics>(RealLoadStatistics.class);
        return util.exportExcel(list, "realLoadStatistics");
    }

    /**
     * 获取实载率统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('module:realLoadStatistics:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(realLoadStatisticsService.getById(id));
    }

    /**
     * 新增实载率统计
     */
    @PreAuthorize("@ss.hasPermi('module:realLoadStatistics:add')")
    @Log(title = "实载率统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RealLoadStatistics realLoadStatistics)
    {
        return toAjax(realLoadStatisticsMapper.insert(realLoadStatistics));
    }

    /**
     * 修改实载率统计
     */
    @PreAuthorize("@ss.hasPermi('module:realLoadStatistics:edit')")
    @Log(title = "实载率统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RealLoadStatistics realLoadStatistics)
    {
        return toAjax(realLoadStatisticsMapper.updateById(realLoadStatistics));
    }

    /**
     * 删除实载率统计
     */
    @PreAuthorize("@ss.hasPermi('module:realLoadStatistics:remove')")
    @Log(title = "实载率统计", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(realLoadStatisticsMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
