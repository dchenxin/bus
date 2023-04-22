package com.ruoyi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 提前购票事件搜索参数
 * @author dcx
 */
@Getter
@AllArgsConstructor
public enum CompanyTypeEnums {
    /**一级公司*/
    ONE_COMPANY("0","一级公司"),
    /**二级公司*/
    TWO_COMPANY("1","二级公司");

    private final String value;
    private final String description;

    CompanyTypeEnums find(String value){
        for (CompanyTypeEnums paramEnums : CompanyTypeEnums.values()) {
            if(value.equals(paramEnums.getValue())){
                return paramEnums;
            }
        }
        return null;
    }
}
