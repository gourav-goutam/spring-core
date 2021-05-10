package com.springcore.autoWiring.withAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee1 {
	@Autowired
    private Address1 address1;    
    
    public Employee1(Address1 address1) {
        super();
        System.out.println("Employee1 constructor");
        this.address1 = address1;
    }
    public Employee1() {
        super();
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "address1=" + address1 +
                '}';
    }

    public Address1 getAddress() {
        return address1;
    }
    
    public void setAddress(Address1 address1) {
    	System.out.println("setting Address1");
        this.address1 = address1;
    }
}
