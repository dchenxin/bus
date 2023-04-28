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
import com.ruoyi.domain.Fleet;
import com.ruoyi.service.IFleetService;
import com.ruoyi.mapper.FleetMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车队信息Controller
 *
 * @author dcx
 * @date 2023-04-24
 */
@RestController
@RequestMapping("/ruoyi/fleet")
public class FleetController extends BaseController {
    @Autowired
    private IFleetService fleetService;

    @Autowired
    private FleetMapper fleetMapper;

    /**
     * 查询车队信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:fleet:list')")
    @GetMapping("/list")
        public TableDataInfo list(Fleet fleet) {
        startPage();
        List<Fleet> list = fleetService.list(Wrappers.query(fleet));
        return getDataTable(list);
    }

    /**
     * 导出车队信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:fleet:export')")
    @Log(title = "车队信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Fleet fleet) {
        List<Fleet> list = fleetService.list(Wrappers.query(fleet));
        ExcelUtil<Fleet> util = new ExcelUtil<Fleet>(Fleet.class);
        return util.exportExcel(list, "fleet");
    }

    /**
     * 获取车队信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:fleet:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(fleetService.getById(id));
    }

    /**
     * 新增车队信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:fleet:add')")
    @Log(title = "车队信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Fleet fleet)
    {
        return toAjax(fleetMapper.insert(fleet));
    }

    /**
     * 修改车队信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:fleet:edit')")
    @Log(title = "车队信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Fleet fleet)
    {
        return toAjax(fleetMapper.updateById(fleet));
    }

    /**
     * 删除车队信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:fleet:remove')")
    @Log(title = "车队信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(fleetMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
