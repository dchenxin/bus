package com.ruoyi.controller;

import java.util.Arrays;
import java.util.List;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.domain.Card;
import com.ruoyi.service.ICardService;
import com.ruoyi.mapper.CardMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 卡号信息Controller
 *
 * @author dcx
 * @date 2023-04-24
 */
@RestController
@RequestMapping("/ruoyi/card")
public class CardController extends BaseController {
    @Autowired
    private ICardService cardService;

    @Autowired
    private CardMapper cardMapper;

    /**
     * 查询卡号信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:card:list')")
    @GetMapping("/list")
        public TableDataInfo list(Card card) {
        startPage();
        List<Card> list = cardService.list(Wrappers.query(card));
        return getDataTable(list);
    }
    
    /**
     * 导出卡号信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:card:export')")
    @Log(title = "卡号信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Card card) {
        List<Card> list = cardService.list(Wrappers.query(card));
        ExcelUtil<Card> util = new ExcelUtil<Card>(Card.class);
        return util.exportExcel(list, "card");
    }

    /**
     * 获取卡号信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:card:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cardService.getById(id));
    }

    /**
     * 新增卡号信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:card:add')")
    @Log(title = "卡号信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Card card)
    {
        return toAjax(cardMapper.insert(card));
    }

    /**
     * 修改卡号信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:card:edit')")
    @Log(title = "卡号信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Card card)
    {
        return toAjax(cardMapper.updateById(card));
    }

    /**
     * 删除卡号信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:card:remove')")
    @Log(title = "卡号信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(cardMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
