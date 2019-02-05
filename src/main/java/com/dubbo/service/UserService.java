package com.dubbo.service;

import java.util.List;

import com.dubbo.bean.UserAddress;

public interface UserService {
	//根据userId查询收货地址
	public List<UserAddress> getUserAddressList(String userId);
}
