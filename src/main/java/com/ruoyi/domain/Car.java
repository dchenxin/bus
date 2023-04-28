package com.ruoyi.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 车辆信息对象 CAR
 *
 * @author dcx
 * @date 2023-04-27
 */
@ToString
@Data
@TableName("CAR")
public class Car extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 车牌号 */
    @Excel(name = "车牌号")
    private String carNo;


    /** 车牌颜色 */
    @Excel(name = "车牌颜色")
    private String carColor;


    /** 车身颜色 */
    @Excel(name = "车身颜色")
    private String carBodyColor;


    /** 购买日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "购买日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date buyDate;


    /** 发动机功率(单位/kw) */
    @Excel(name = "发动机功率(单位/kw)")
    private String enginePower;


    /** 车辆型号 */
    @Excel(name = "车辆型号")
    private String carModel;


    /** 燃油类型 */
    @Excel(name = "燃油类型")
    private String fuelType;


    /** 燃油类型id */
    @Excel(name = "燃油类型id")
    private String fuelTypeId;


    /** 车架号 */
    @Excel(name = "车架号")
    private String frameNo;


    /** 座位数 */
    @Excel(name = "座位数")
    private Integer seats;


    /** 核载数 */
    @Excel(name = "核载数")
    private Integer realLoadNum;


    /** 发动机排量id */
    @Excel(name = "发动机排量id")
    private String engineDisplacementId;


    /** 发动机排量 */
    @Excel(name = "发动机排量")
    private String engineDisplacement;


    /** 生产商 */
    @Excel(name = "生产商")
    private String producer;


    /** 车辆长度(单位/米) */
    @Excel(name = "车辆长度(单位/米)")
    private String carLength;


    /** 驱动型号id */
    @Excel(name = "驱动型号id")
    private String driveModelId;


    /** 驱动型号 */
    @Excel(name = "驱动型号")
    private String driveModel;


    /** 出厂日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出厂日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date produceDate;


    /** 变速器类型id */
    @Excel(name = "变速器类型id")
    private String transmissionTypeId;


    /** 变速器类型 */
    @Excel(name = "变速器类型")
    private String transmissionType;


    /** 发动机编号 */
    @Excel(name = "发动机编号")
    private String engineNo;


    /** 价格(单位/万) */
    @Excel(name = "价格(单位/万)")
    private String price;


    /** 注册地 */
    @Excel(name = "注册地")
    private String registerPlace;


    /** 是否双层 */
    @Excel(name = "是否双层")
    private String isBilayer;


    /** 是否空调车 */
    @Excel(name = "是否空调车")
    private String isAircondition;


    /** 道路运输编号 */
    @Excel(name = "道路运输编号")
    private String roadTransportNo;


    /** 所属公司id */
    @Excel(name = "所属公司id")
    private Integer companyId;


    /** 所属公司名称 */
    @Excel(name = "所属公司名称")
    private String companyName;


    /** 所属线路id */
    @Excel(name = "所属线路id")
    private Integer lineId;


    /** 所属线路名称 */
    @Excel(name = "所属线路名称")
    private String lineName;


    /** 所属车队id */
    @Excel(name = "所属车队id")
    private Integer fleetId;


    /** 所属车队名 */
    @Excel(name = "所属车队名")
    private String fleetName;


    /** 车辆状态id */
    @Excel(name = "车辆状态id")
    private String carStatusId;


    /** 车辆状态 */
    @Excel(name = "车辆状态")
    private String carStatus;


    /** 随车电话 */
    @Excel(name = "随车电话")
    private String carTel;


    /** 上牌日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上牌日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registrationDate;


    /** 报废日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报废日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cancelDate;


    /** 超速预报值 */
    @Excel(name = "超速预报值")
    private Integer speedPrediction;


    /** 超速值 */
    @Excel(name = "超速值")
    private Integer speed;


}
