package com.example.type.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 周林 2018/9/4 23:59
 */
public class ZlUtils {
    // 状态码
    private int code;
    // 提示信息
    private String msg;

    // 用户要返回给浏览器的数据
    private Map<String, Object> extend = new HashMap<>();

    public ZlUtils add(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }

    public static ZlUtils Success(String msgString) {
        ZlUtils msg = new ZlUtils();
        msg.setCode(100);
        msg.setMsg(msgString == null ? "处理成功" : msgString);
        return msg;
    }

    public static ZlUtils Failure(String msgString) {
        ZlUtils msg = new ZlUtils();
        msg.setCode(200);
        msg.setMsg(msgString == null ? "处理失败" : msgString);
        return msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    private void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
