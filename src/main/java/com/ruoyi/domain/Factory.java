package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 设备厂商信息对象 FACTORY
 *
 * @author dcx
 * @date 2023-04-24
 */
@ToString
@Data
@TableName("FACTORY")
public class Factory extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 厂家名称 */
    @Excel(name = "厂家名称")
    private String name;


    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contact;


    /** 厂家地址 */
    @Excel(name = "厂家地址")
    private String address;


    /** 企业编号 */
    @Excel(name = "企业编号")
    private String enterpriseNo;


    /** 服务器地址 */
    @Excel(name = "服务器地址")
    private String serveAdress;


    /** 服务器端口 */
    @Excel(name = "服务器端口")
    private Integer servePort;


    /** 内网服务器地址 */
    @Excel(name = "内网服务器地址")
    private String intranetServeAdress;


    /** 内网服务器端口 */
    @Excel(name = "内网服务器端口")
    private String intranetServePort;


    /** 是否通过网闸(0否 1是) */
    @Excel(name = "是否通过网闸(0否 1是)")
    private String isGatekeeper;


}
