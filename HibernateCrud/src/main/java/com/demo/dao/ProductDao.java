package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	Object addNewProd(Product p);

	List<Product> displayAll();

	boolean deleteById(int pid);

	Product displayById(int pid);

	boolean UpdateById(int pid, String pname, float price, int qty);

	List<Product> sortById();

	void closeFactory();

}
