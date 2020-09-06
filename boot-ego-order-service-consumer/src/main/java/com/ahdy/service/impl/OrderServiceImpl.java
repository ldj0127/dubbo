package com.ahdy.service.impl;



import com.ahdy.domain.UserAddress;
import com.ahdy.service.OrderService;
import com.ahdy.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Dajie
 * @create 2020/9/5 15:32
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 初始化订单，其中有一部要查询用户地址列表
     *
     * @param userid
     * @return
     */
    @Override
    public List<UserAddress> initOrder(String userid) {
        return userService.getUserAddressList(userid);
    }
}
