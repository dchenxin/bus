package com.ruoyi.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.CarMapper;
import com.ruoyi.domain.Car;
import com.ruoyi.service.ICarService;

/**
 * 车辆信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-27
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements ICarService {
    @Autowired
    private CarMapper carMapper;

}
