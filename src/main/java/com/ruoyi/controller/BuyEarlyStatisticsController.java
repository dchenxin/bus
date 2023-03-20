package com.ruoyi.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.google.common.collect.Lists;
import com.ruoyi.domain.BusinessStatistics;
import com.ruoyi.domain.vo.businessStatistics.BusinessStatisticsDataVo;
import com.ruoyi.domain.vo.businessStatistics.BusinessStatisticsTotalVo;
import com.ruoyi.domain.vo.businessStatistics.BusinessStatisticsVo;
import com.ruoyi.domain.vo.buyEarlyStatistics.BuyEarlyStatisticsVo;
import com.ruoyi.handler.BuyEarlyStatisticsHandler;
import com.ruoyi.utils.DoubleUtil;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
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
import com.ruoyi.domain.BuyEarlyStatistics;
import com.ruoyi.service.IBuyEarlyStatisticsService;
import com.ruoyi.mapper.BuyEarlyStatisticsMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 提前购票统计Controller
 *
 * @author luz
 * @date 2023-03-06
 */
@RestController
@RequestMapping("/module/buyEarlyStatistics")
@AllArgsConstructor
public class BuyEarlyStatisticsController extends BaseController {

    private  final BuyEarlyStatisticsHandler buyEarlyStatisticsHandler;

    /**
     * 获取提前购票数据统计
     */
    @GetMapping("/getBuyEarlyStatistics/{type}")
    public AjaxResult getBusinessStatistics(@PathVariable("type") String type) {
        List<BuyEarlyStatistics> buyEarlyStatisticsList = buyEarlyStatisticsHandler.execute(type);
        Assert.notEmpty(buyEarlyStatisticsList,"暂无提前购票数据");

        List<BuyEarlyStatisticsVo> result = Lists.newArrayList();
        Map<String, List<BuyEarlyStatistics>> map = buyEarlyStatisticsList.stream().collect(Collectors.groupingBy(BuyEarlyStatistics::getRegionName));
        map.keySet().forEach(s->{
            List<BuyEarlyStatistics> buyEarlyStatistics = map.get(s);
            BuyEarlyStatisticsVo vo =  BuyEarlyStatisticsVo.builder()
                    .regionName(s)
                    .earlyOneHour(buyEarlyStatistics.stream().mapToInt(BuyEarlyStatistics::getEarlyOneHour).sum())
                    .earlyEight(buyEarlyStatistics.stream().mapToInt(BuyEarlyStatistics::getEarlyEight).sum())
                    .earlySixteen(buyEarlyStatistics.stream().mapToInt(BuyEarlyStatistics::getEarlySixteen).sum())
                    .earlyOneDay(buyEarlyStatistics.stream().mapToInt(BuyEarlyStatistics::getEarlyOneDay).sum())
                    .earlyTwoDay(buyEarlyStatistics.stream().mapToInt(BuyEarlyStatistics::getEarlyTwoDay).sum())
                    .earlyTwoDayOver(buyEarlyStatistics.stream().mapToInt(BuyEarlyStatistics::getEarlyTwoDayOver).sum())
                    .build();
            result.add(vo);
        });
        return AjaxResult.success(result);
    }

//    /**
//     * 查询提前购票统计列表
//     */
//    @PreAuthorize("@ss.hasPermi('module:buyEarlyStatistics:list')")
//    @GetMapping("/list")
//        public TableDataInfo list(BuyEarlyStatistics buyEarlyStatistics) {
//        startPage();
//        List<BuyEarlyStatistics> list = buyEarlyStatisticsService.list(Wrappers.query(buyEarlyStatistics));
//        return getDataTable(list);
//    }
//
//    /**
//     * 导出提前购票统计列表
//     */
//    @PreAuthorize("@ss.hasPermi('module:buyEarlyStatistics:export')")
//    @Log(title = "提前购票统计", businessType = BusinessType.EXPORT)
//    @GetMapping("/export")
//    public AjaxResult export(BuyEarlyStatistics buyEarlyStatistics) {
//        List<BuyEarlyStatistics> list = buyEarlyStatisticsService.list(Wrappers.query(buyEarlyStatistics));
//        ExcelUtil<BuyEarlyStatistics> util = new ExcelUtil<BuyEarlyStatistics>(BuyEarlyStatistics.class);
//        return util.exportExcel(list, "buyEarlyStatistics");
//    }
//
//    /**
//     * 获取提前购票统计详细信息
//     */
//    @PreAuthorize("@ss.hasPermi('module:buyEarlyStatistics:query')")
//    @GetMapping(value = "/{id}")
//    public AjaxResult getInfo(@PathVariable("id") Integer id)
//    {
//        return AjaxResult.success(buyEarlyStatisticsService.getById(id));
//    }
//
//    /**
//     * 新增提前购票统计
//     */
//    @PreAuthorize("@ss.hasPermi('module:buyEarlyStatistics:add')")
//    @Log(title = "提前购票统计", businessType = BusinessType.INSERT)
//    @PostMapping
//    public AjaxResult add(@RequestBody BuyEarlyStatistics buyEarlyStatistics)
//    {
//        return toAjax(buyEarlyStatisticsMapper.insert(buyEarlyStatistics));
//    }
//
//    /**
//     * 修改提前购票统计
//     */
//    @PreAuthorize("@ss.hasPermi('module:buyEarlyStatistics:edit')")
//    @Log(title = "提前购票统计", businessType = BusinessType.UPDATE)
//    @PutMapping
//    public AjaxResult edit(@RequestBody BuyEarlyStatistics buyEarlyStatistics)
//    {
//        return toAjax(buyEarlyStatisticsMapper.updateById(buyEarlyStatistics));
//    }
//
//    /**
//     * 删除提前购票统计
//     */
//    @PreAuthorize("@ss.hasPermi('module:buyEarlyStatistics:remove')")
//    @Log(title = "提前购票统计", businessType = BusinessType.DELETE)
//    @DeleteMapping("/{ids}")
//    public AjaxResult remove(@PathVariable Integer[] ids) {
//        return toAjax(buyEarlyStatisticsMapper.deleteBatchIds(Arrays.asList(ids)));
//    }
}
