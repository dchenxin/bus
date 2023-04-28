package com.ruoyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.FactoryMapper;
import com.ruoyi.domain.Factory;
import com.ruoyi.service.IFactoryService;

/**
 * 设备厂商信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-24
 */
@Service
public class FactoryServiceImpl extends ServiceImpl<FactoryMapper, Factory> implements IFactoryService {
    @Autowired
    private FactoryMapper factoryMapper;

}
