package com.ahdy.service;

import com.ahdy.domain.UserAddress;

import java.util.List;

/**
 * @Author Dajie
 * @create 2020/9/5 15:19
 */
public interface UserService {
    /**
     * 根据用户id查询用户地址列表
     * @param id
     * @return
     */
    public List<UserAddress>getUserAddressList(String id);
}
