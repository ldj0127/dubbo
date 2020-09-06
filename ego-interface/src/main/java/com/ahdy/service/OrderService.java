package com.ahdy.service;

import com.ahdy.domain.UserAddress;

import java.util.List;

/**
 * @Author Dajie
 * @create 2020/9/5 15:30
 */
public interface OrderService {
    /**
     * 初始化订单，其中有一部要查询用户地址列表
     * @param userid
     * @return
     */
    List<UserAddress> initOrder(String userid);
}
