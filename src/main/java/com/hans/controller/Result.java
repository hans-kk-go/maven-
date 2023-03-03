package com.hans.controller;

public class Result {
    private Integer code;
    private Object data;

    private String msg;

    public Result() {
    }

    public Result(Integer code, Object date) {
        this.code = code;
        this.data = date;
    }

    public Result(Integer code, Object date, String msg) {
        this.code = code;
        this.data = date;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
