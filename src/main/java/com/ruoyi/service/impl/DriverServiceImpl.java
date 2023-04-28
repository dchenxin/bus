package com.ruoyi.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.DriverMapper;
import com.ruoyi.domain.Driver;
import com.ruoyi.service.IDriverService;

/**
 * 驾驶员信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-25
 */
@Service
public class DriverServiceImpl extends ServiceImpl<DriverMapper, Driver> implements IDriverService {
    @Autowired
    private DriverMapper driverMapper;

}
