package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{

	private ProductDao pdao;
	
	
	
	public ProductServiceImpl() {
		super();
		this.pdao = new ProductDaoImpl();
	}



	@Override
	public void addNewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter pname");
		String pname=sc.next();
		System.out.println("enter price");
		float price=sc.nextFloat();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		Product p=new Product(pid,pname,price,qty);
		pdao.addNewProd(p);
	}



	@Override
	public List<Product> displayAll() {
		// TODO Auto-generated method stub
		return pdao.displayAll();
	}



	@Override
	public boolean deleteById(int pid) {
		
		return pdao.deleteById( pid);
	}



	@Override
	public Product displayById(int pid) {
		return pdao.displayById(pid);
	}



	@Override
	public boolean UpdateById(int pid, String pname, float price, int qty) {
		// TODO Auto-generated method stub
		return pdao.UpdateById(pid,pname,price,qty);
	}



	@Override
	public List<Product> sortById() {
		
		return pdao.sortById();
	}



	@Override
	public void closeFactory() {
		pdao.closeFactory();
		
	}

}
