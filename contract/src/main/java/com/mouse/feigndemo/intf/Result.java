package com.mouse.feigndemo.intf;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Result<T> {

    /**
     * 错误码
     */
    private int code;

    /**
     * 异常消息
     * <p>
     * 用于打日志或者调试用
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    public static <T> Result<T> success(T data) {
        return new Result(0, "success", data);
    }

    public static <T> Result<T> fail(int code, String msg) {
        return new Result(code, msg, null);
    }
}
