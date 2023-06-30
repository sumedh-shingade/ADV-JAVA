package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class ProductDaoImpl implements ProductDao{

	private static SessionFactory factory;
	
	static {
		factory=HibernateUtil.getMySession();
		
	}
	
	@Override
	public Object addNewProd(Product p) {
		Session sess=factory.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(p);
		tr.commit();
		sess.close();
		return null;
	}

	@Override
	public List<Product> displayAll() {
		Session sess=factory.openSession();
		Transaction tr=sess.beginTransaction();
		Query query=sess.createQuery("from Product");
		List<Product> plist=query.list();
		tr.commit();
		sess.close();
		return plist;
	
	}

	@Override
	public boolean deleteById(int pid) {
		Session sess=factory.openSession();
		Transaction tr=sess.beginTransaction();
		Product p=sess.get(Product.class, pid);
		if(p!=null)
		{
			sess.delete(p);
			tr.commit();
			sess.close();
			return true;
		}
		return false;
	}

	@Override
	public Product displayById(int pid) {
		Session sess=factory.openSession();
		Transaction tr=sess.beginTransaction();
		Product p=sess.get(Product.class, pid);
		if(p!=null)
		{
			tr.commit();
			sess.close();
			return p;
		}
		return null;
	}

	@Override
	public boolean UpdateById(int pid, String pname, float price, int qty) {
		Session sess=factory.openSession();
		Transaction tr=sess.beginTransaction();
		Product p=sess.get(Product.class, pid);
		
		if(p!=null)
		{
			p.setPname(pname);
			p.setPrice(price);
			p.setQty(qty);
			sess.saveOrUpdate(p);
			tr.commit();
			sess.close();
			return true;
		}
		return false;
	}

	@Override
	public List<Product> sortById() {
		Session sess=factory.openSession();
		Transaction tr=sess.beginTransaction();
		Query q=sess.createQuery("from Product p order by p.pid desc");
		List<Product> plist=q.list();
		tr.commit();
		sess.close();
		
		//Criteria cr=sess.createCriteria(Product.class,"p");
		//cr.addOrder(Order.asc("pid"));
		return plist;
	}

	@Override
	public void closeFactory() {
		HibernateUtil.CloseFactory();
	}
}
