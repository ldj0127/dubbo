package com.ahdy.controller;

/**
 * @Author Dajie
 * @create 2020/9/5 20:14
 */

import com.ahdy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;


    @ResponseBody
    @RequestMapping("initOrder/{userId}")
    public Object initOrder(@PathVariable String userId){
        return this.orderService.initOrder(userId);
    }
}
