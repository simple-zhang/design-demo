package com.demo.designdemo.design.create.abs.factory;

import com.demo.designdemo.design.create.abs.factory.domain.Color;
import com.demo.designdemo.design.create.factory.domain.Shape;
import com.demo.designdemo.exception.SystemException;

/**
 * @Author: simple-zhang
 * @Date: 2021/8/9 14:30
 */
public class ShapeFactory extends AbstractFactoryPattern {

    @Override
    Color getColor(String classname) {
        return null;
    }

    @Override
    Shape getShape(String classname) {
        Shape shape;
        try {
            shape = (Shape) Class.forName(classname).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new SystemException("根据反射获取类实例报错");
        }
        return shape;
    }
}
