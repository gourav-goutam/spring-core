package com.springcore.autoWiring;


import com.springcore.autoWiring.withXML.Employee;
import com.springcore.autoWiring.withAnnotation.Employee1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireRun {
    public static void main(String[] args) {
       withXmlConfig();
        withAnnotation();
    }

    private static void withXmlConfig(){
        @SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autoWiring/withXML/xmlautoconfig.xml");
        Employee e = (Employee) context.getBean("employee");
        System.out.println(e);
    }
    private static void withAnnotation(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autoWiring/withAnnotation/annotationconfig.xml");
        Employee1 e = (Employee1) context.getBean("employee1");
        System.out.println(e);
    }
}
