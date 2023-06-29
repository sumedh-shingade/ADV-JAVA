package com.demo.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student11")

public class Student {
	
	@Id
	private int sid;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)/*  it means that when you perform an operation on the 
	owning entity, such as saving or deleting, the same operation 
	will be cascaded to the associated entity. */
	
	@JoinColumn(name="addrid")
	
	private Address addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, Address addr) {
		super();
		this.sid = sid;
		this.name = name;
		this.addr = addr;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", addr=" + addr + "]";
	}
	

}
