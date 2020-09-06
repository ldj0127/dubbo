package com.ahdy.service.impl;

import com.ahdy.domain.UserAddress;
import com.ahdy.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Dajie
 * @create 2020/9/5 19:08
 */
@Service
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
        return address;
    }
}
