package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int custid;
	private String custname;
	private String coursename;
	
	@Autowired
	private Technologies technologies;
	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getCustid() {
		return custid;
	}
	
	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustname() {
		return custname;
	}

	public void setCoursename(String coursename) {
		this.coursename=coursename;
	}

	public String getCoursename() {
		return coursename;
	}
	
	public void setTechnologies(Technologies technologies) {
		this.technologies=technologies;
	}
	
	public Technologies getTechnologies() {
		return technologies;
	}
	
	public void display() {
		System.out.println("object created successfully");
		technologies.tech();
	}

}
