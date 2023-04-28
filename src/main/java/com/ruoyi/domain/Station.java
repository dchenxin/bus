package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 站点信息对象 STATION
 *
 * @author dcx
 * @date 2023-04-24
 */
@ToString
@Data
@TableName("STATION")
public class Station extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 站点名称 */
    @Excel(name = "站点名称")
    private String name;


    /** 站点编号 */
    @Excel(name = "站点编号")
    private String no;


    /** 经度 */
    @Excel(name = "经度")
    private String lon;


    /** 纬度 */
    @Excel(name = "纬度")
    private String lat;


    /** 方向角 */
    @Excel(name = "方向角")
    private Integer directionAngle;


    /** 线路编号 */
    @Excel(name = "线路编号")
    private String lineNo;


    /** 线路方向(1上行  2下行) */
    @Excel(name = "线路方向(1上行  2下行)",width = 20)
    private String lineDirection;


}
