package com.ps.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

@Named("votar")
public class Votar {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private int age;
	@Value("${voter.addrs}")
	private String addrs;
	private Date dov;
	
	public Votar() {
		System.out.println("Votar:: 0-param constructor");
	}
	
	public void setName(@NonNull String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddrs(@NonNull String addrs) {
		this.addrs = addrs;
	}
	
	public @NonNull String checkVotingEligibility() {
		if(age<18)
			return "Mr/Miss/Mrs. "+name+" u r not eligible for voting";
		else
			return "Mr/Miss/Mrs. "+name+" u r eligible for voting";			
	}

	@Override
	public String toString() {
		return "Votar [name=" + name + ", age=" + age + ", addrs=" + addrs + ", dov=" + dov + "]";
	}
	
	//custom init method
	@PostConstruct
	public void myInit()throws Exception {
		System.out.println("Votar.myInit()");
		//bean processing
		if(age<0)
			age=age*-1;
		
		//verifying bean properties
		if(name==null || age<2)
			throw new IllegalArgumentException("invalid name,age values");
		
		//left over date initialization
		dov=new Date();
	}
	
	//custom destroy method
	@PreDestroy
	public void myDestroy() {
		System.out.println("Votar.myDestroy()");
		name=null;
		age=0;
		addrs=null;
		dov=null;				
	}

}
