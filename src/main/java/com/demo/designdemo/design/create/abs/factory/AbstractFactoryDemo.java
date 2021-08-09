package com.demo.designdemo.design.create.abs.factory;

import com.demo.designdemo.design.create.abs.factory.domain.Color;

/**
 * @Author: simple-zhang
 * @Date: 2021/8/9 14:45
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactoryPattern colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("com.demo.designdemo.design.create.abs.factory.domain.Red");
        color.fill();
    }

}
