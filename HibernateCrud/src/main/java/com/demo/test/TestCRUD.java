package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.*;

public class TestCRUD {

	public static void main(String[] args) {
		
		
		
		
		ProductService ps=new ProductServiceImpl();
		
		int choice=0;
		do {
		System.out.println("1. Add new product\n 2. Delete by id\n 3. Display all\n");
		System.out.println("4. display by Id\n 5. sort by id\n6. update by id\n7. exit\nchoice: ");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			ps.addNewProduct();
			break;
		case 2:
			System.out.println("enter pid");
			int pid=sc.nextInt();
			boolean status=ps.deleteById(pid);
			if(status)
			{
				System.out.println("deleted");
			}
			else
			{
				System.out.println("not");
			}
			break;
		case 3:
			List<Product> plist=ps.displayAll();
			plist.forEach(s->{System.out.println(s);});
			break;
		case 4:
			System.out.println("enter pid");
			pid=sc.nextInt();
			Product p=ps.displayById(pid);
			System.out.println(p);
			break;
		case 5:
			plist=ps.sortById();
			plist.forEach(s->{System.out.println(s);});
			break;
		case 6:
			System.out.println("enter pid");
			pid=sc.nextInt();
			System.out.println("enter pname");
			String pname=sc.next();
			System.out.println("enter price");
			float price=sc.nextFloat();
			System.out.println("enter qty");
			int qty=sc.nextInt();
			status =ps.UpdateById(pid,pname,price,qty);
			if(status)
			{
				System.out.println("updated");
			}
			else
			{
				System.out.println("not updated");
			}
			break;
		case 7:
			ps.closeFactory();
			System.out.println("thank you");
		
		default:
			break;
		}
		}while(choice!=7);
		
	}

}
