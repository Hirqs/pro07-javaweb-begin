package com.atguigu.myssm.utils;

public class StringUtil {
    /**
     * 判断字符串是否为空
     * @param str
     * @return true代表字符串为空
     */
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    /**
     * 判断字符串是否为空
     * @param str
     * @return true代表字符串不为空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
