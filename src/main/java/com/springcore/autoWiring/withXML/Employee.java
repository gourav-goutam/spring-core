package com.springcore.autoWiring.withXML;

public class Employee {
    private Address address;

    public Employee(Address address) {
        super();
        this.address = address;
    }
    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
