package com.springcore.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunStandaloneCollections {
    public static void main(String[] args) {
        standaloneCollection();
    }

    private static void standaloneCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standaloneCollections/collectionconfig.xml");

        Person c = (Person) context.getBean("person");
        System.out.println(c);
    }
}
