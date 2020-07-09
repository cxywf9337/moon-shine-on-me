package com.eric.moonshineonme.common.result;

import com.eric.moonshineonme.common.constant.ConstantGlobal;

/**
 * <p>
 * Description:
 * </P>
 *
 * @author wangfei
 * @since 2020-07-09
 */
public enum ResultConstant {
    /**
     * 成功
     */
    SUCCESS(ConstantGlobal.RESULT_CODE_SUCCESS, ConstantGlobal.RESULT_MESSAGE_SUCCESS),
    /**
     * 失败
     */
    FAIL(ConstantGlobal.RESULT_CODE_FAILURE, ConstantGlobal.RESULT_MESSAGE_FAILURE),
    ;

    private int code;
    private String message;

    ResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
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
}
