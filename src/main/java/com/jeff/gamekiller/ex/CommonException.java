package com.jeff.gamekiller.ex;

import com.jeff.gamekiller.enm.StatusCode;
import lombok.Data;

@Data
public class CommonException extends RuntimeException {
    private StatusCode code;

    public CommonException() {
    }

    public CommonException(StatusCode code) {
        this.code = code;
    }

    public CommonException(String message, StatusCode code) {
        super(message);
        this.code = code;
    }

    public CommonException(String message, Throwable cause, StatusCode code) {
        super(message, cause);
        this.code = code;
    }

    public CommonException(Throwable cause, StatusCode code) {
        super(cause);
        this.code = code;
    }

    public CommonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, StatusCode code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }


}
