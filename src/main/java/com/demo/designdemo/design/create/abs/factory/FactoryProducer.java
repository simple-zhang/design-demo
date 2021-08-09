package com.demo.designdemo.design.create.abs.factory;

import com.demo.designdemo.exception.SystemException;

/**
 * @Author: simple-zhang
 * @Date: 2021/8/9 14:35
 */
public class FactoryProducer {

    public static AbstractFactoryPattern getFactory(String type) {
        switch (type) {
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
            default:
                throw new SystemException("工厂类型出错，无法找到！");
        }
    }

}
