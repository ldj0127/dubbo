package com.ahdy.service.impl;

import com.ahdy.domain.UserAddress;
import com.ahdy.service.UserService;
import com.alibaba.dubbo.config.annotation.Method;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Dajie
 * @create 2020/9/5 15:21
 */
@Service(weight = 100,loadbalance = "random")
public class UserServiceImpl implements UserService {

    public static List<UserAddress> address=new ArrayList<>();

    static {
        address.add(new UserAddress(1, "湖北省武汉市东湖高新区金融港B22栋11楼", "whsxt"));
        address.add(new UserAddress(2, "北京市海淀区西三旗街道建材城西路中腾建华商务大厦东侧二层尚学堂", "bjsxt"));
    }

    /**
     * 根据用户id查询用户地址列表
     *
     * @param id
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String id) {
        System.out.println("提供者20880开始执行====");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("提供者20880执行结束====");
        return address;
    }
}
