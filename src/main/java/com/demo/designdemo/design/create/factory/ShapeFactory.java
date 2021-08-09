package com.demo.designdemo.design.create.factory;

import com.demo.designdemo.design.create.factory.domain.Shape;
import com.demo.designdemo.exception.SystemException;
import com.demo.designdemo.exception.WrongClassNameException;
import java.util.Objects;

/**
 * @Author: simple-zhang
 * @Date: 2021/8/9 10:13
 */
public class ShapeFactory {

    public Shape getShape(String classname) {
        if (Objects.isNull(classname)
        || classname.replace(" ", "").length() == 0) {
            throw new WrongClassNameException("全限定类名错误");
        }

        Shape shape;
        try {
            shape = (Shape) Class.forName(classname).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new SystemException("根据反射获取类实例报错");
        }

        return shape;
    }

    public static void main(String[] args) {
        Shape shape = new ShapeFactory().getShape("com.demo.designdemo.design.create.factory.domain.Square");
        shape.draw();

        Shape shape1 = new ShapeFactory().getShape("com.demo.designdemo.design.create.factory.domain.Rectangle");
        shape1.draw();
    }

}
