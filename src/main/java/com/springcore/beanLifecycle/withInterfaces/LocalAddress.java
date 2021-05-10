package com.springcore.beanLifecycle.withInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LocalAddress implements InitializingBean, DisposableBean {
    private String city;
    private String state;
    private String country;

    public LocalAddress(String city, String state, String country) {
        super();
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public String toString(){
        return "["+city+", "+state+", "+country+"]";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean ...");
    }
}
