package com.ruoyi.service;

import java.util.List;

import cn.hutool.core.collection.CollUtil;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.domain.Station;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 站点信息Service接口
 *
 * @author dcx
 * @date 2023-04-24
 */
public interface IStationService extends IService<Station> {

    /**
     * 导入数据
     * @param orderList
     * @return
     */
    public AjaxResult convertStationInfoData(List<Station> orderList) throws Exception;

}
