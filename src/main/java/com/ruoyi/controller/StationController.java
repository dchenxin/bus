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
import com.ruoyi.domain.Station;
import com.ruoyi.service.IStationService;
import com.ruoyi.mapper.StationMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 站点信息Controller
 *
 * @author dcx
 * @date 2023-04-24
 */
@RestController
@RequestMapping("/ruoyi/station")
public class StationController extends BaseController {
    @Autowired
    private IStationService stationService;

    @Autowired
    private StationMapper stationMapper;

    /**
     * 查询站点信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:station:list')")
    @GetMapping("/list")
        public TableDataInfo list(Station station) {
        startPage();
        List<Station> list = stationService.list(Wrappers.query(station));
        return getDataTable(list);
    }

    /**
     * 导出站点信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:station:export')")
    @Log(title = "站点信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Station station) {
        List<Station> list = stationService.list(Wrappers.query(station));
        ExcelUtil<Station> util = new ExcelUtil<Station>(Station.class);
        return util.exportExcel(list, "station");
    }

    /**
     * 获取站点信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:station:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(stationService.getById(id));
    }

    /**
     * 新增站点信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:station:add')")
    @Log(title = "站点信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Station station)
    {
        return toAjax(stationMapper.insert(station));
    }

    /**
     * 修改站点信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:station:edit')")
    @Log(title = "站点信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Station station)
    {
        return toAjax(stationMapper.updateById(station));
    }

    /**
     * 删除站点信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:station:remove')")
    @Log(title = "站点信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(stationMapper.deleteBatchIds(Arrays.asList(ids)));
    }

    /**
     * 下载站点模板
     * @return
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:station:import')")
    @GetMapping("/importTemplate")
    public AjaxResult importTemplate() {
        ExcelUtil<Station> util = new ExcelUtil<Station>(Station.class);
        return util.importTemplateExcel("站点数据");
    }

    /**
     * 站点导入
     * @return
     */
    @Log(title = "站点导入", businessType = BusinessType.IMPORT)
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file) throws Exception {
        ExcelUtil<Station> util = new ExcelUtil<Station>(Station.class);
        List<Station> orderList = util.importExcel(file.getInputStream());
        return stationService.convertStationInfoData(orderList);
    }
}
