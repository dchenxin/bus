package com.ruoyi.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.LineMapper;
import com.ruoyi.domain.Line;
import com.ruoyi.service.ILineService;

/**
 * 线路信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-27
 */
@Service
public class LineServiceImpl extends ServiceImpl<LineMapper, Line> implements ILineService {
    @Autowired
    private LineMapper lineMapper;

}
