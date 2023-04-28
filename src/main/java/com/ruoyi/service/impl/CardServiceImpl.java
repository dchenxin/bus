package com.ruoyi.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.CardMapper;
import com.ruoyi.domain.Card;
import com.ruoyi.service.ICardService;

/**
 * 卡号信息Service业务层处理
 *
 * @author dcx
 * @date 2023-04-24
 */
@Service
public class CardServiceImpl extends ServiceImpl<CardMapper, Card> implements ICardService {
    @Autowired
    private CardMapper cardMapper;

}
