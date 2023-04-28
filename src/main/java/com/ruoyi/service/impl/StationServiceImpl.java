package com.ruoyi.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.StationMapper;
import com.ruoyi.domain.Station;
import com.ruoyi.service.IStationService;

/**
 * 站点信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-24
 */
@Service
public class StationServiceImpl extends ServiceImpl<StationMapper, Station> implements IStationService {
    @Autowired
    private StationMapper stationMapper;

    /**
     * 导入数据
     * @param orderList
     * @return
     */
    @Override
    public AjaxResult convertStationInfoData(List<Station> orderList) throws Exception{
        if (CollUtil.isEmpty(orderList)) return AjaxResult.error("数据为空");
        //定义一个下标，便于提示前端哪条导入失败
        this.saveBatch(orderList);
        return AjaxResult.success("导入成功");
    }

}
