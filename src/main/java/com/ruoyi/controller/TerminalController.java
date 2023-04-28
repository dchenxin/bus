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
import com.ruoyi.domain.Terminal;
import com.ruoyi.service.ITerminalService;
import com.ruoyi.mapper.TerminalMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 终端信息Controller
 *
 * @author dcx
 * @date 2023-04-24
 */
@RestController
@RequestMapping("/ruoyi/terminal")
public class TerminalController extends BaseController {
    @Autowired
    private ITerminalService terminalService;

    @Autowired
    private TerminalMapper terminalMapper;

    /**
     * 查询终端信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:terminal:list')")
    @GetMapping("/list")
        public TableDataInfo list(Terminal terminal) {
        startPage();
        List<Terminal> list = terminalService.list(Wrappers.query(terminal));
        return getDataTable(list);
    }
    
    /**
     * 导出终端信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:terminal:export')")
    @Log(title = "终端信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Terminal terminal) {
        List<Terminal> list = terminalService.list(Wrappers.query(terminal));
        ExcelUtil<Terminal> util = new ExcelUtil<Terminal>(Terminal.class);
        return util.exportExcel(list, "terminal");
    }

    /**
     * 获取终端信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:terminal:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(terminalService.getById(id));
    }

    /**
     * 新增终端信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:terminal:add')")
    @Log(title = "终端信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Terminal terminal)
    {
        return toAjax(terminalMapper.insert(terminal));
    }

    /**
     * 修改终端信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:terminal:edit')")
    @Log(title = "终端信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Terminal terminal)
    {
        return toAjax(terminalMapper.updateById(terminal));
    }

    /**
     * 删除终端信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi:terminal:remove')")
    @Log(title = "终端信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(terminalMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
