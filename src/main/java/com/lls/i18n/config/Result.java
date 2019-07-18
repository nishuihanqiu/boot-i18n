package com.lls.i18n.config;

/************************************
 * Result
 * @author liliangshan
 * @date 2019-07-18
 ************************************/
public class Result<T> {
    private String code;
    private String message;
    private T data;

    public Result(T data) {
        this("ok", "ok", data);
    }

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

}
