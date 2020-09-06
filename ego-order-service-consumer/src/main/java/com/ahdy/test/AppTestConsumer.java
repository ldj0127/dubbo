package com.ahdy.test;

import com.ahdy.domain.UserAddress;
import com.ahdy.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author Dajie
 * @create 2020/9/5 17:58
 */
public class AppTestConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();

        OrderService orderService = context.getBean(OrderService.class);
        List<UserAddress> userAddresses = orderService.initOrder("1");
        for (UserAddress userAddress : userAddresses) {
            System.out.println(userAddress.getId()+"  "+userAddress.getAddress()+"  "+userAddress.getUserId());
        }
        System.out.println("消费者调用成功");
    }
}
