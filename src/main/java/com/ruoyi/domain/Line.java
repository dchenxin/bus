package com.ruoyi.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 线路信息对象 LINE
 *
 * @author dcx
 * @date 2023-04-27
 */
@ToString
@Data
@TableName("LINE")
public class Line extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 线路编号 */
    @Excel(name = "线路编号")
    private String no;


    /** 线路名 */
    @Excel(name = "线路名")
    private String name;


    /** 线路类型id */
    @Excel(name = "线路类型id")
    private String typeId;


    /** 线路类型 */
    @Excel(name = "线路类型")
    private String type;


    /** 起始站 */
    @Excel(name = "起始站")
    private String startStation;


    /** 终点站 */
    @Excel(name = "终点站")
    private String endStation;


    /** 所属公司id */
    @Excel(name = "所属公司id")
    private Integer companyId;


    /** 所属公司 */
    @Excel(name = "所属公司")
    private String companyName;


    /** 空驶里程数(单位/km) */
    @Excel(name = "空驶里程数(单位/km)")
    private String emptyDriveMileage;


    /** 日均趟次 */
    @Excel(name = "日均趟次")
    private Integer dayAverageNum;


    /** 是否发送发班时间(0否 1是) */
    @Excel(name = "是否发送发班时间(0否 1是)")
    private String isSendClassTime;


    /** 是否发送间隔报警 */
    @Excel(name = "是否发送间隔报警")
    private String isIntervalSendAlarm;


    /** 是否取消首末班补贴(0否 1是) */
    @Excel(name = "是否取消首末班补贴(0否 1是)")
    private String isCancelSubsidy;


    /** 上行夏令早班 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上行夏令早班", width = 30, dateFormat = "yyyy-MM-dd")
    private Date upSummerEarly;


    /** 上行夏令晚班 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上行夏令晚班", width = 30, dateFormat = "yyyy-MM-dd")
    private Date upSummerLate;


    /** 上行起始站编号 */
    @Excel(name = "上行起始站编号")
    private String upStartStationNo;


    /** 上行终点站编号 */
    @Excel(name = "上行终点站编号")
    private String upEndStationNo;


    /** 上行冬令早班 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上行冬令早班", width = 30, dateFormat = "yyyy-MM-dd")
    private Date upWinterEarly;


    /** 上行冬令晚班 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上行冬令晚班", width = 30, dateFormat = "yyyy-MM-dd")
    private Date upWinterLate;


    /** 上行大间隔站数 */
    @Excel(name = "上行大间隔站数")
    private Integer upIntervalStationMax;


    /** 上行小间隔站数 */
    @Excel(name = "上行小间隔站数")
    private Integer upIntervalStationMin;


    /** 上行里程数(单位/km) */
    @Excel(name = "上行里程数(单位/km)")
    private String upMileages;


    /** 上行运行时间(单位/分钟) */
    @Excel(name = "上行运行时间(单位/分钟)")
    private String upRunTime;


    /** 上行排班计划编号 */
    @Excel(name = "上行排班计划编号")
    private String upSchedulePlanNo;


    /** 上行允许误差分钟数(单位/分钟) */
    @Excel(name = "上行允许误差分钟数(单位/分钟)")
    private Integer upAllowMistake;


    /** 上行价格描述 */
    @Excel(name = "上行价格描述")
    private String upPriceDescribe;


    /** 下行夏令早班 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下行夏令早班", width = 30, dateFormat = "yyyy-MM-dd")
    private Date downSummerEarly;


    /** 下行夏令晚班 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下行夏令晚班", width = 30, dateFormat = "yyyy-MM-dd")
    private Date downSummerLate;


    /** 下行起始站编号 */
    @Excel(name = "下行起始站编号")
    private String downStartStationNo;


    /** 下行终点站编号 */
    @Excel(name = "下行终点站编号")
    private String downEndStationNo;


    /** 下行冬令早班 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下行冬令早班", width = 30, dateFormat = "yyyy-MM-dd")
    private Date downWinterEarly;


    /** 下行冬令晚班 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下行冬令晚班", width = 30, dateFormat = "yyyy-MM-dd")
    private Date downWinterLate;


    /** 下行大间隔站数 */
    @Excel(name = "下行大间隔站数")
    private Integer downIntervalStationMax;


    /** 下行小间隔站数 */
    @Excel(name = "下行小间隔站数")
    private Integer downIntervalStationMin;


    /** 下行里程数(单位/km) */
    @Excel(name = "下行里程数(单位/km)")
    private String downMileages;


    /** 下行运行时间(单位/分钟) */
    @Excel(name = "下行运行时间(单位/分钟)")
    private String downRunTime;


    /** 下行排班计划编号 */
    @Excel(name = "下行排班计划编号")
    private String downSchedulePlanNo;


    /** 下行允许误差分钟数(单位/分钟) */
    @Excel(name = "下行允许误差分钟数(单位/分钟)")
    private Integer downAllowMistake;


    /** 下行价格描述 */
    @Excel(name = "下行价格描述")
    private String downPriceDescribe;


}
