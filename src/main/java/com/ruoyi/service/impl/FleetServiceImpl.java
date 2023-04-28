package com.ruoyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.FleetMapper;
import com.ruoyi.domain.Fleet;
import com.ruoyi.service.IFleetService;

/**
 * 车队信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-24
 */
@Service
public class FleetServiceImpl extends ServiceImpl<FleetMapper, Fleet> implements IFleetService {
    @Autowired
    private FleetMapper fleetMapper;

}
