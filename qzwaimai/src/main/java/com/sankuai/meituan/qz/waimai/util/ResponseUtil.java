package com.sankuai.meituan.qz.waimai.util;

import com.alibaba.fastjson.JSONObject;

public class ResponseUtil {

    public static JSONObject respSuccessOf(Object data) {
        return respOf(0, "success", data);
    }

    public static JSONObject respErrOf(Object data) {
        return respOf(0, "系统异常，请稍后重试", data);
    }

    public static JSONObject respOf(int code, String msg, Object data) {
        JSONObject json = new JSONObject();
        json.put("msg", msg);
        json.put("code", code);
        json.put("data", JSONObject.toJSON(data));
        return json;
    }
}
