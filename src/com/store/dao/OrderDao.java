package com.store.dao;

import java.util.List;

import com.store.domain.Order;
import com.store.domain.OrderItem;

public interface OrderDao {

	void add(Order order) throws Exception;

	void addItem(OrderItem oi) throws Exception;

	List<Order> findAllByPage(int currPage, int pageSize, String uid) throws Exception;

	int getTotalCount(String uid) throws Exception;

	Order getById(String oid) throws Exception;

	void update(Order order) throws Exception;

	List<Order> findAllByState(String state) throws Exception;

}