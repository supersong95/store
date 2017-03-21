package com.store.service;

import java.util.List;

import com.store.domain.PageBean;
import com.store.domain.Product;

public interface ProductService {

	List<Product> findNew() throws Exception;

	List<Product> findHot() throws Exception;

	Product getByPid(String pid) throws Exception;

	PageBean<Product> findByPage(int currPage, int pageSize, String cid) throws Exception;

	List<Product> findAll() throws Exception;

	void add(Product p) throws Exception;

}
