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
import com.ruoyi.domain.Car;
import com.ruoyi.service.ICarService;
import com.ruoyi.mapper.CarMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车辆信息Controller
 *
 * @author dcx
 * @date 2023-04-27
 */
@RestController
@RequestMapping("/ruoyi/car")
public class CarController extends BaseController {
    @Autowired
    private ICarService carService;

    @Autowired
    private CarMapper carMapper;

    /**
     * 查询车辆信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:car:list')")
    @GetMapping("/list")
        public TableDataInfo list(Car car) {
        startPage();
        List<Car> list = carService.list(Wrappers.query(car));
        return getDataTable(list);
    }
    
    /**
     * 导出车辆信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:car:export')")
    @Log(title = "车辆信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Car car) {
        List<Car> list = carService.list(Wrappers.query(car));
        ExcelUtil<Car> util = new ExcelUtil<Car>(Car.class);
        return util.exportExcel(list, "car");
    }

    /**
     * 获取车辆信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:car:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(carService.getById(id));
    }

    /**
     * 新增车辆信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:car:add')")
    @Log(title = "车辆信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Car car)
    {
        return toAjax(carMapper.insert(car));
    }

    /**
     * 修改车辆信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:car:edit')")
    @Log(title = "车辆信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Car car)
    {
        return toAjax(carMapper.updateById(car));
    }

    /**
     * 删除车辆信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:car:remove')")
    @Log(title = "车辆信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(carMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
