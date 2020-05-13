package com.ps.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("pp")
public class PersonProfile {
	private Long id;
	private String name;
	private int age;
	private Date dob,doj,dom;
	

	public PersonProfile(Long id, String name, int age, Date dob, Date doj, Date dom) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}


	@Override
	public String toString() {
		return "PersonProfile [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", doj=" + doj
				+ ", dom=" + dom + "]";
	}
	
	
	

}
