package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 卡号信息对象 CARD
 *
 * @author dcx
 * @date 2023-04-24
 */
@ToString
@Data
@TableName("CARD")
public class Card extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 姓名 */
    @Excel(name = "姓名")
    private String name;


    /** 员工卡ID */
    @Excel(name = "员工卡ID")
    private String cardId;


    /** 卡内号 */
    @Excel(name = "卡内号")
    private String cardNo;


    /** 状态ID */
    @Excel(name = "状态ID")
    private String statusId;


    /** 状态 */
    @Excel(name = "状态")
    private String status;


    /** 卡类型ID */
    @Excel(name = "卡类型ID")
    private String cardTypeId;


    /** 卡类型 */
    @Excel(name = "卡类型")
    private String carType;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;

}
