package com.pyw.springmybatis.Common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 */
public class StringUtils {
    private static Pattern numberPattern = Pattern.compile("^[0-9\\-]+$");
    private static Pattern numericStringPattern = Pattern.compile("^[0-9\\-\\-]+$");
    private static Pattern floatNumericPattern = Pattern.compile("^[0-9\\-\\.]+$");
    private static Pattern abcPattern = Pattern.compile("^[a-z|A-Z]+$");
    public static final String splitStrPattern = ",|，|;|；|、|\\.|。|-|_|\\(|\\)|\\[|\\]|\\{|\\}|\\\\|/| |　|\"";
    private final static Pattern mobilePattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])||(17[0-9])|(18[0,5-9]))\\d{8}$");
    private final static Pattern emailPattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");

    public static boolean hasText(String str) {
        return !"".equals(nonNull(str));
    }

    /**
     * 把为null的字符串转换成空白。
     *
     * @param str
     * @return str
     */
    public static String nonNull(String str) {
        return (str == null) ? "" : str;
    }

    public static String subStringAdd(String str, int strLength, String replen) {
        int strLen = str.length();
        if (strLen > strLength) {
            return str.substring(0, strLength);
        } else {
            StringBuffer sb = null;
            while (strLen < strLength) {
                sb = new StringBuffer();
                sb.append(replen).append(str);// 左补
                // sb.append(str).append("0");//右补
                str = sb.toString();
                strLen = str.length();
            }
            return str;
        }
    }

    public static boolean isBlank(String str) {
        int strLen;
        if ((str == null) || ((strLen = str.length()) == 0)) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    /**
     * 根据字符串获取指定位数的double类型
     *
     * @param str
     * @param defaultv
     * @return
     */
    public static double getAsDouble(String str, double defaultv) {
        if (str == null || "".equals(str)) {
            return defaultv;
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception e) {
            return defaultv;
        }
    }

    /**
     * 字符串转换成long，转换出错或者为空则返回-1L
     *
     * @param str
     * @return long
     */
    public static long getAsLong(String str) {
        return getAsLong(str, -1L);
    }

    /**
     * 根据字符串获取指定位数的Long类型
     *
     * @param str
     * @param defaultv
     * @return
     */
    public static long getAsLong(String str, long defaultv) {
        if (str == null || "".equals(str)) {
            return defaultv;
        }
        try {
            return Long.parseLong(str, 10);
        } catch (Exception e) {
            return defaultv;
        }
    }

    /**
     * 判断字符串是否为空
     *
     * @param obj
     * @return
     */
    public static String trim(Object obj) {
        return (obj == null) ? "" : obj.toString().trim();
    }

    /**
     * 判断字符串是否为空 若为空则设置指定默认值
     *
     * @param obj
     * @param defult
     * @return
     */
    public static String trim(Object obj, String defult) {
        return (obj == null) ? trim(defult) : obj.toString().trim();
    }

    /**
     * 获取指定格式的日期字符串
     *
     * @param date
     * @param s
     * @return
     */
    public static String getDateStr(Date date, String s) {
        SimpleDateFormat simpledateformat;
        return (simpledateformat = new SimpleDateFormat(s)).format(date);
    }


    public static boolean isEmpty(Object str) {
        return str == null || "".equals(str);
    }

    /**
     * 判断是否数字表示
     *
     * @param src 源字符串
     * @return 是否数字的标志
     */
    public static boolean isNumber(String src) {
        boolean return_value = false;
        if (src != null && src.length() > 0) {
            Matcher m = numberPattern.matcher(src);
            if (m.find()) {
                return_value = true;
            }
        }
        return return_value;
    }

    /**
     * 判断是否纯字母组合
     *
     * @param src
     * @return 是否纯字母组合的标志
     */
    public static boolean isABC(String src) {
        boolean return_value = false;
        if (src != null && src.length() > 0) {
            Matcher m = abcPattern.matcher(src);
            if (m.find()) {
                return_value = true;
            }
        }
        return return_value;
    }

    /**
     * 判断是否浮点数字表示
     *
     * @param src 源字符串
     * @return 是否数字的标志
     */
    public static boolean isFloatNumeric(String src) {
        boolean return_value = false;
        if (src != null && src.length() > 0) {
            Matcher m = floatNumericPattern.matcher(src);
            if (m.find()) {
                return_value = true;
            }
        }
        return return_value;
    }

    public static boolean isMobile(String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,8][0-9]{9}$"); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }

    /**
     * id放入list
     *
     * @param id id(多个已逗号分隔)
     * @return List集合
     */
    public static List<String> getList(String id) {
        List<String> list = new ArrayList<String>();
        String[] str = id.split(",");
        if (null != str && str.length > 0) {
            for (int i = 0; i < str.length; i++) {
                list.add(str[i]);
            }
        }
        return list;
    }

    /**
     * id放入list
     *
     * @param id     id
     * @param filter 过滤条件
     * @return List集合
     */
    public static List<String> getList(String id, String filter) {
        List<String> list = new ArrayList<String>();
        String[] str = id.split(filter);
        if (null != str && str.length > 0) {
            for (int i = 0; i < str.length; i++) {
                list.add(str[i]);
            }
        }
        return list;
    }

    public static String getNumber(String author) {
        try {
            String str = author.substring(1, author.length());
            if (StringUtils.isNumber(str)) {
                return new StringBuffer("00").append(str).toString();
            }
        } catch (Exception e) {
        }
        return author;
    }

    public static String getPNumber(String author) {
        try {
            String str = StringUtils.trim(StringUtils.getAsLong(author));
            if (StringUtils.isNumber(str)) {
                StringBuffer strb = new StringBuffer();
                strb.append("p").append(author.replace("00", ""));
                return strb.toString();
            }
        } catch (Exception e) {
        }
        return author;
    }

    /**
     * 采用动态规划的方法比较两个字符串的相似度（数字越小，相似度越高）
     *
     * @param source
     * @param target
     * @return
     */
    public static int similarityComparison(String source, String target) {
        char[] sources = source.toCharArray();
        char[] targets = target.toCharArray();
        int sourceLen = sources.length;
        int targetLen = targets.length;
        int[][] d = new int[sourceLen + 1][targetLen + 1];
        for (int i = 0; i <= sourceLen; i++) {
            d[i][0] = i;
        }
        for (int i = 0; i <= targetLen; i++) {
            d[0][i] = i;
        }

        for (int i = 1; i <= sourceLen; i++) {
            for (int j = 1; j <= targetLen; j++) {
                if (sources[i - 1] == targets[j - 1]) {
                    d[i][j] = d[i - 1][j - 1];
                } else {
                    //插入
                    int insert = d[i][j - 1] + 1;
                    //删除
                    int delete = d[i - 1][j] + 1;
                    //替换
                    int replace = d[i - 1][j - 1] + 1;
                    d[i][j] = Math.min(insert, delete) > Math.min(delete, replace) ? Math.min(delete, replace) :
                            Math.min(insert, delete);
                }
            }
        }
        return d[sourceLen][targetLen];
    }
}
