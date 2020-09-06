package com.ahdy.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author Dajie
 * @create 2020/9/5 15:49
 */
public class AppTestProvider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        System.out.println("提供者启动成功。服务注册成功");
        //不让程序关闭
        System.in.read();

    }
}
