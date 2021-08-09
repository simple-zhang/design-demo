package com.demo.designdemo.exception;

/**
 * @Author: simple-zhang
 * @Date: 2021/8/9 10:22
 */
public class SystemException extends RuntimeException {

    public SystemException() {
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

}
