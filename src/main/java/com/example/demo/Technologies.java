package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private String techName;
	private String techid;
	
	public void getTechname(String techName) {
		this.techName=techName;
	}

	public String setTechname() {
		return techName;
	}

	public void getTechid(String techid) {
		this.techid=techid;
	}

	public String setTechid() {
		return techid;
	}

	public void tech() {
		System.out.println("Objects of technologies are created"); 
	}

}
