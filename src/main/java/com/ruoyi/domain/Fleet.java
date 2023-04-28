package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 车队信息对象 FLEET
 *
 * @author dcx
 * @date 2023-04-24
 */
@ToString
@Data
@TableName("FLEET")
public class Fleet extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 车队名称 */
    @Excel(name = "车队名称")
    private String name;


    /** 车队负责人名 */
    @Excel(name = "车队负责人名")
    private String headName;


    /** 车队电话 */
    @Excel(name = "车队电话")
    private String tel;


}
