package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 趟检员信息对象 INSPECTOR
 *
 * @author dcx
 * @date 2023-04-26
 */
@ToString
@Data
@TableName("INSPECTOR")
public class Inspector extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 所属公司id */
    @Excel(name = "所属公司id")
    private Integer companyId;


    /** 所属公司名称 */
    @Excel(name = "所属公司名称")
    private String companyName;


    /** 姓名 */
    @Excel(name = "姓名")
    private String name;


    /** 联系电话 */
    @Excel(name = "联系电话")
    private String tel;


    /** 性别(0男 1女) */
    @Excel(name = "性别(0男 1女)")
    private String sex;


    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;


    /** 地址 */
    @Excel(name = "地址")
    private String address;


    /** 在岗状态 */
    @Excel(name = "在岗状态")
    private String onDutyStatus;


    /** 监测点id */
    @Excel(name = "监测点id")
    private Integer monitorId;


    /** 监测点名 */
    @Excel(name = "监测点名")
    private String monitorName;


}
