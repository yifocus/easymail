package com.focus.easymail.controller.vo;

import lombok.Data;

@Data
public class ResponseResult {

    private int state = 0; // 0 是成功
    private String message; // 状态描述信息
    private Object data;    // 返回前端需要的数据

    public static ResponseResult success(String message) {
        return success(null, message);
    }

    public static ResponseResult success(Object data, String message) {
        ResponseResult responseResult = newInstance();
        responseResult.setMessage(message);
        responseResult.setData(data);
        return responseResult;
    }

    public static ResponseResult fail(int state, String message) {
        ResponseResult responseResult = newInstance();
        responseResult.setMessage(message);
        responseResult.setState(state);

        return responseResult;
    }

    public static ResponseResult fail(String message) {
        return fail(-1, message);
    }


    public static ResponseResult newInstance() {
        return new ResponseResult();
    }


}
