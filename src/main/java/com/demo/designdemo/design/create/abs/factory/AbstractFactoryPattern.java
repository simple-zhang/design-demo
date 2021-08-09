package com.demo.designdemo.design.create.abs.factory;

import com.demo.designdemo.design.create.abs.factory.domain.Color;
import com.demo.designdemo.design.create.factory.domain.Shape;

/**
 * @Author: simple-zhang
 * @Date: 2021/8/9 14:18
 */
public abstract class AbstractFactoryPattern {
    abstract Color getColor(String classname);
    abstract Shape getShape(String classname);
}
