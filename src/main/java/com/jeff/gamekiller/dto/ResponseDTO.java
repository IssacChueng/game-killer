package com.jeff.gamekiller.dto;

import com.jeff.gamekiller.enm.StatusCode;
import lombok.Builder;
import lombok.Data;

/**
 * @author swzhang
 * @date 2020/05/11
 */
@Data
@Builder
public class ResponseDTO<T> {
    private int res;
    private String msg;
    private T data;

    private static ResponseDTO<Object> ok = new ResponseDTOBuilder<Object>()
            .data(null)
            .res(StatusCode.OK.value())
            .build();
    public static ResponseDTO<Object> ok() {
        return ResponseDTO.ok;
    }

    public static ResponseDTO<Object> fail(String msg) {
        return new ResponseDTO<>(StatusCode.NO.value(), msg, null);
    }

    public static <T> ResponseDTO<T> ok(T data) {
        return new ResponseDTO<>(StatusCode.NO.value(), null, data);
    }
}
