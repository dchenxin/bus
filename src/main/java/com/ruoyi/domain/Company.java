package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 公司信息对象 COMPANY
 *
 * @author dcx
 * @date 2023-04-21
 */
@ToString
@Data
@TableName("COMPANY")
public class Company extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 公司类型(0总公司. 1二级公司) */
    @Excel(name = "公司类型(0总公司. 1二级公司)")
    private String type;


    /** 公司名称 */
    @Excel(name = "公司名称")
    private String name;


    /** 负责人姓名 */
    @Excel(name = "负责人姓名")
    private String headName;


    /** 联系电话 */
    @Excel(name = "联系电话")
    private String tel;


    /** 地址 */
    @Excel(name = "地址")
    private String address;


    /** 邮编 */
    @Excel(name = "邮编")
    private String zipCode;


    /** 公司类型字典值 */
    @Excel(name = "公司类型字典值")
    private String typeId;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;


    /** 上级公司id */
    private Integer parentId;


}
