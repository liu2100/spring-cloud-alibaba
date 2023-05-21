package org.example.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

    private Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> error(Integer code, String message) {
        return new <T> Result<T>(code, message, null);
    }

    public static <T> Result<T> error(Integer code, String message, T data) {
        return new Result<T>(code, message, data);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<T>(200, message, data);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(200, "ok", data);
    }

    public static <T> Result<T> success() {
        return new Result<T>(200, "ok", null);
    }

}

