package com.ruoyi.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.InspectorMapper;
import com.ruoyi.domain.Inspector;
import com.ruoyi.service.IInspectorService;

/**
 * 趟检员信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-26
 */
@Service
public class InspectorServiceImpl extends ServiceImpl<InspectorMapper, Inspector> implements IInspectorService {
    @Autowired
    private InspectorMapper inspectorMapper;

}
