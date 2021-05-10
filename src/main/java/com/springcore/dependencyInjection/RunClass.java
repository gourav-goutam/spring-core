package com.springcore.dependencyInjection;

import com.springcore.dependencyInjection.collectionType.CollectionType;
import com.springcore.dependencyInjection.primitiveType.Student;
import com.springcore.dependencyInjection.referenceType.ReferenceType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		injectPrimitiveTypes();
		injectCollectionTypes();
		injectReferenceTypeTypes();
	}
	
	 private static void injectPrimitiveTypes() {
	    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/dependencyInjection/primitiveType/primitiveconfig.xml");
	    	
	        Student s = (Student) context.getBean("student");
	        System.out.println(s);
	        Student s1 = (Student) context.getBean("student1");
	        System.out.println(s1);
	        Student s2 = (Student) context.getBean("student2");
	        System.out.println(s2);
	    }
	 
	    
	    private static void injectCollectionTypes() {
	    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/dependencyInjection/collectionType/collectionconfig.xml");
	    	
	    	CollectionType c = (CollectionType) context.getBean("collection");
	    	System.out.println(c);
	    }

	    private static void injectReferenceTypeTypes() {
	    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/dependencyInjection/referenceType/referenceconfig.xml");
	    	
	    	ReferenceType r = (ReferenceType) context.getBean("e");
	    	System.out.println(r);
	    }
}
