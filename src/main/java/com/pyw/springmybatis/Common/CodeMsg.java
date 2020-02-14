package com.pyw.springmybatis.Common;

public class CodeMsg {
    private int code;
    private String msg;

    public static CodeMsg SUCCESS = new CodeMsg(0,"成功");
    public static CodeMsg NOT_LOGIN = new CodeMsg(-1,"未登录");

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
