package com.springcore.dependencyInjection.referenceType;

public class ReferenceType {
	private int id;  
	private String name;  
	private Address address;
	@Override
	public String toString() {
		return "ReferenceType [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public ReferenceType(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
}
