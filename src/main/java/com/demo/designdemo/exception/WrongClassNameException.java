package com.demo.designdemo.exception;

import java.sql.Wrapper;

/**
 * @Author: simple-zhang
 * @Date: 2021/8/9 10:18
 */
public class WrongClassNameException extends SystemException {

    public WrongClassNameException() {
        super();
    }

    public WrongClassNameException(String message) {
        super(message);
    }

    public WrongClassNameException(String message, Throwable e) {
        super(message, e);
    }

}
