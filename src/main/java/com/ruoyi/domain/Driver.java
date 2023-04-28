package com.ruoyi.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 驾驶员信息对象 DRIVER
 *
 * @author dcx
 * @date 2023-04-25
 */
@ToString
@Data
@TableName("DRIVER")
public class Driver extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 所属公司 */
    @Excel(name = "所属公司")
    private Integer companyId;


    /** 所属公司名 */
    @Excel(name = "所属公司名")
    private String companyName;


    /** 姓名 */
    @Excel(name = "姓名")
    private String name;


    /** 档案号 */
    @Excel(name = "档案号")
    private String fileNo;


    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;


    /** 驾驶证类型 */
    @Excel(name = "驾驶证类型")
    private String driveType;


    /** 驾驶证类型ID */
    @Excel(name = "驾驶证类型ID")
    private String driveTypeId;


    /** 驾驶证号 */
    @Excel(name = "驾驶证号")
    private String driveNo;


    /** 出生年月 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生年月", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;


    /** 籍贯 */
    @Excel(name = "籍贯")
    private String nativePlace;


    /** 联系地址 */
    @Excel(name = "联系地址")
    private String address;


    /** 联系电话 */
    @Excel(name = "联系电话")
    private String tel;


    /** 学历 */
    @Excel(name = "学历")
    private String education;


    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private String isMarry;


    /** 性别(0男 1女) */
    @Excel(name = "性别(0男 1女)")
    private String sex;


    /** 初次领证时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "初次领证时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firstCertificateDate;


    /** 驾驶有效起始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "驾驶有效起始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date driveEffectiveStartDate;


    /** 驾驶有效终止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "驾驶有效终止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date driveEffectiveEndDate;


    /** 驾驶员归属地 */
    @Excel(name = "驾驶员归属地")
    private String driveBelong;


    /** 运输类型 */
    @Excel(name = "运输类型")
    private String transportType;


    /** 运输性质 */
    @Excel(name = "运输性质")
    private String transportNature;


    /** 从业资格证url */
    @Excel(name = "从业资格证url")
    private String qualificationCertificate;


    /** 从业资格有效起始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "从业资格有效起始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date qualificationCertificateStartDate;


    /** 从业资格有效终止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "从业资格有效终止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date qualificationCertificateEndDate;


    /** 内部上岗证url */
    @Excel(name = "内部上岗证url")
    private String workLicense;


    /** 内部上岗有效起始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "内部上岗有效起始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workLicenseStartDate;


    /** 内部上岗有效终止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "内部上岗有效终止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workLicenseEndDate;


    /** 所属线路 */
    @Excel(name = "所属线路")
    private Integer lineId;


    /** 所属线路名称 */
    @Excel(name = "所属线路名称")
    private String lineName;


    /** 在岗状态 */
    @Excel(name = "在岗状态")
    private String onDutyStatus;


    /** 车牌号 */
    @Excel(name = "车牌号")
    private String carNumber;


    /** 车辆类型 */
    @Excel(name = "车辆类型")
    private String vehicleType;


    /** 所属班别id */
    @Excel(name = "所属班别id")
    private Integer classId;


    /** 班别名 */
    @Excel(name = "班别名")
    private String className;


    /** 是否停驶 */
    @Excel(name = "是否停驶")
    private String isStop;


    /** 是否黑名单 */
    @Excel(name = "是否黑名单")
    private String isBlack;


    /** 安全知识情况 */
    @Excel(name = "安全知识情况")
    private String safetyKnowledgeSituation;


    /** 考核情况 */
    @Excel(name = "考核情况")
    private String examineSituation;


    /** 历史记录 */
    @Excel(name = "历史记录")
    private String history;


}
