package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 终端信息对象 TERMINAL
 *
 * @author dcx
 * @date 2023-04-24
 */
@ToString
@Data
@TableName("TERMINAL")
public class Terminal extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 终端号 */
    @Excel(name = "终端号")
    private String terminalNo;


    /** 车牌号 */
    @Excel(name = "车牌号")
    private String carNo;


    /** sim卡号 */
    @Excel(name = "sim卡号")
    private String simNo;


    /** sim密码 */
    @Excel(name = "sim密码")
    private String simPassword;


    /** sim类型 */
    @Excel(name = "sim类型")
    private String simType;


    /** 终端型号 */
    @Excel(name = "终端型号")
    private String terminalType;


    /** 终端厂家 */
    @Excel(name = "终端厂家")
    private String terminalFactory;


    /** 所属线路 */
    @Excel(name = "所属线路")
    private Integer lineId;


    /** 线路名称 */
    @Excel(name = "线路名称")
    private String lineName;


    /** 所属公司id */
    @Excel(name = "所属公司id")
    private Integer companyId;


    /** 所属公司名称 */
    @Excel(name = "所属公司名称")
    private String companyName;


    /** 3G终端号 */
    @Excel(name = "3G终端号")
    private String threeNo;


    /** 3G设备厂家 */
    @Excel(name = "3G设备厂家")
    private String threeFactory;


    /** 3G设备SIM卡号 */
    @Excel(name = "3G设备SIM卡号")
    private String threeSimNo;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;


}
