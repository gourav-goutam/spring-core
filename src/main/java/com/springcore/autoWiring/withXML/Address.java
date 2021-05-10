package com.springcore.autoWiring.withXML;

public class Address {
	private String city;  
	private String state;  
	private String country;  
	  
	public Address(String city, String state, String country) {  
	    super();  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}

	public void init(){
		System.out.println("Init called...");
	}
	public void destroy(){
		System.out.println("Destroy called...");
	}
	  
	public String toString(){  
	    return "["+city+", "+state+", "+country+"]";  
	}  
}
