package cn.ebatech.imixpark.common.service;

/**
 * Created by chenxuan on 16/1/13.
 */
public enum ErrorCode {
    BAD_REQUEST(400, 400), UNAUTHORIZED(401, 401), FORBIDDEN(403, 403), INTERNAL_SERVER_ERROR(500, 500),

    TOKEN_EXPIRED(1100, 401), TOKEN_TAMPERED(1101, 401), NO_TOKEN(1102, 401);

    public int code;
    public int httpStatus;

    ErrorCode(int code, int httpStatus) {
        this.code = code;
        this.httpStatus = httpStatus;
    }
}
