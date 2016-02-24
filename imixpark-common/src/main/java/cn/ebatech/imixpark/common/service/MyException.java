package cn.ebatech.imixpark.common.service;

/**
 * Created by chenxuan on 16/1/15.
 */
public class MyException extends RuntimeException {
    private static final long serialVersionUID = 0;

    public ErrorCode errorCode;

    public MyException(String message, ErrorCode errorCode) {
        super(message);
//        Object o = CommonUtil.returnObjectMap("000", message, "", null);
        this.errorCode = errorCode;
    }
}
