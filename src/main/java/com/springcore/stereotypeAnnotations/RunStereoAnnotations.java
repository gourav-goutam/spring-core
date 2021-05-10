package com.springcore.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunStereoAnnotations {
    public static void main(String[] args) {
        standaloneCollection();
    }

    private static void standaloneCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotypeAnnotations/stereo.xml");

        Person c = (Person) context.getBean("person");
        System.out.println(c);
    }
}
