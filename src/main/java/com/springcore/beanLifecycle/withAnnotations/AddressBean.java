package com.springcore.beanLifecycle.withAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AddressBean {
	private String city;
	private String state;
	private String country;

	public AddressBean(String city, String state, String country) {
	    super();  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}
	@PostConstruct
	public void start(){
		System.out.println("PostConstruct called...");
	}

	@PreDestroy
	public void end(){
		System.out.println("PreDestroy called...");
	}
	  
	public String toString(){  
	    return "["+city+", "+state+", "+country+"]";  
	}  
}
