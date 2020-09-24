package com.personal.blog.exception;

/**
 * @author YUDI
 * @date 2020/9/21 23:18
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 3818945005669061883L;
    public String message;

    public BusinessException(String message) {
        this.message = message;
    }

    public BusinessException(String message, Throwable e){
        super(message,e);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
