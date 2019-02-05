package com.dubbo.service;

import java.util.List;

import com.dubbo.bean.UserAddress;

public interface OrderService {
	public List<UserAddress> initOrder(String userId);
}
