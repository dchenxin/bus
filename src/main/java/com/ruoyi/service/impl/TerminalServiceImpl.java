package com.ruoyi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.TerminalMapper;
import com.ruoyi.domain.Terminal;
import com.ruoyi.service.ITerminalService;

/**
 * 终端信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-24
 */
@Service
public class TerminalServiceImpl extends ServiceImpl<TerminalMapper, Terminal> implements ITerminalService {
    @Autowired
    private TerminalMapper terminalMapper;

}
