package com.personal.blog.entity;

import lombok.Getter;
import lombok.ToString;

/**
 * 请求返回消息
 * @author YUDI
 * @date 2020/9/24 20:33
 */
@Getter
@ToString
public class Result<T>  {

    private static final long serialVersionUID = 2855407626327255825L;
    private Integer code;
    private String message;
    private T data;

    public Result(ResultStatus resultStatus, T data) {
        this.code = resultStatus.getCode();
        this.message = resultStatus.getMessage();
        this.data = data;
    }

    @Getter
    public enum ResultStatus{

        SUCCESS(200,"操作成功"),
        WARN(400,"错误请求"),
        NOT_FOUND(404,"暂无资源"),
        ERROR(500,"操作失败");

        private final int code;
        private final String message;
        ResultStatus(Integer code,String message){
            this.code = code;
            this.message = message;
        }
    }

    /**
     * 空对象
     */
    public Result() {
    }

    public static Result<Void> toAjax(Boolean result){
        return result ? success() : failure();
    }

    /**
     * 请求成功
     * @return
     */
    public static <T> Result<T> success(){
        return new Result<>(ResultStatus.SUCCESS,null);
    }

    /**
     * 请求成功，携带返回参数
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data){
        return new Result<>(ResultStatus.SUCCESS,data);
    }

    /**
     * 请求成功，携带返回参数，根据状态码返回信息
     * @param resultStatus
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(ResultStatus resultStatus,T data){
        if (resultStatus == null) {
            return success(data);
        }
        return new Result<>(resultStatus, data);
    }

    /**
     * 请求失败
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(){
        return new Result<>(ResultStatus.ERROR,null);
    }

    /**
     * 请求失败，根据状态码返回信息
     * @param resultStatus
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(ResultStatus resultStatus){
        return new Result<>(resultStatus,null);
    }

    /**
     * 请求失败，携带返回参数
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(T data){
        return new Result<>(ResultStatus.ERROR, data);
    }

    /**
     * 请求失败，携带返回参数，根据状态码返回信息
     * @param resultStatus
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(ResultStatus resultStatus, T data){
        if(resultStatus == null){
            return new Result<>(ResultStatus.ERROR, data);
        }
        return new Result<>(resultStatus, data);
    }
}
