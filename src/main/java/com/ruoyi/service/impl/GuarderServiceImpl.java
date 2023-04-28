package com.ruoyi.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.GuarderMapper;
import com.ruoyi.domain.Guarder;
import com.ruoyi.service.IGuarderService;

/**
 * 守线员信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-26
 */
@Service
public class GuarderServiceImpl extends ServiceImpl<GuarderMapper, Guarder> implements IGuarderService {
    @Autowired
    private GuarderMapper guarderMapper;

}
