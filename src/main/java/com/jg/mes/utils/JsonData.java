package com.jg.mes.utils;

import java.io.Serializable;

/**
 * @author: JG.Yu
 * @Date: 2020/12/31 - 12 - 31 - 16:15
 * @Description: com.jg.mes.utils
 * @version: 1.0
 */
public class JsonData implements Serializable {
    private int code;
    private Object data;
    private String msg;

    public JsonData() {
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    @Override
    public String toString() {
        return "JsonData{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
