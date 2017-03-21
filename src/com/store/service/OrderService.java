package com.store.service;

import java.util.List;

import com.store.domain.Order;
import com.store.domain.PageBean;
import com.store.domain.User;

public interface OrderService {

	void add(Order order) throws Exception;

	PageBean<Order> findAllByPage(int currPage, int pageSize, User user) throws Exception;

	Order getById(String oid) throws Exception;

	void update(Order order) throws Exception;

	List<Order> findAllByState(String state) throws Exception;

}
