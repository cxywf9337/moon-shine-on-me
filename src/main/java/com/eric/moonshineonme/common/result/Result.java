package com.eric.moonshineonme.common.result;

import java.io.Serializable;

/**
 * <p>
 * Description:
 * </P>
 *
 * @author wangfei
 * @since 2020-07-09
 */
public class Result<T> implements Serializable {
    private int code;

    private String message;

    private T data;

    public Result() {

    }

    public Result(ResultConstant resultConstant) {
        this.code = resultConstant.getCode();
        this.message = resultConstant.getMessage();
    }

    public Result(ResultConstant resultConstant, T data) {
        this.code = resultConstant.getCode();
        this.message = resultConstant.getMessage();
        this.data = data;
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<>(ResultConstant.SUCCESS);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ResultConstant.SUCCESS, data);
    }

    public static <T> Result<T> fail() {
        return new Result<>(ResultConstant.FAIL);
    }

    public static <T> Result<T> fail(String message) {
        return new Result<>(ResultConstant.FAIL.getCode(), message, null);
    }

    public static <T> Result<T> fail(String message, T data) {
        return new Result<>(ResultConstant.FAIL.getCode(), message, data);
    }

    public boolean isSuccess() {
        return this.code == ResultConstant.SUCCESS.getCode();
    }

    public boolean isFailure() {
        return !isSuccess();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }
}
