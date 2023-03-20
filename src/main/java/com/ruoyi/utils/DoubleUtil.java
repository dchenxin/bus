package com.ruoyi.utils;

import java.math.BigDecimal;

public class DoubleUtil {

    /**
     * double数值保留两位小数
     * @param d
     * @return
     */
    public static Double format(Double d){
        BigDecimal bg = new BigDecimal(d);
        double result = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }
}
