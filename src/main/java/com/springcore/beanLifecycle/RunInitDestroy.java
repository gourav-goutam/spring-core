package com.springcore.beanLifecycle;

import com.springcore.beanLifecycle.withAnnotations.AddressBean;
import com.springcore.beanLifecycle.withInterfaces.LocalAddress;
import com.springcore.beanLifecycle.withXmlConfig.Address;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunInitDestroy {

    public static void main(String[] args) {
        withXmlConfig();
        withInterfaces();
        withAnnotations();
    }

    private static void withXmlConfig(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanLifecycle/withXmlConfig/xmlconfig.xml");
        Address a = (Address) context.getBean("address");
        System.out.println(a);

        context.registerShutdownHook();
    }

    private static void withInterfaces(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanLifecycle/withInterfaces/interfaceconfig.xml");
        LocalAddress l = (LocalAddress) context.getBean("laddress");
        System.out.println(l);

        context.registerShutdownHook();
    }

    private static void withAnnotations(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanLifecycle/withAnnotations/annotationconfig.xml");
        AddressBean addressBean = (AddressBean) context.getBean("addressBean");
        System.out.println(addressBean);

        context.registerShutdownHook();
    }
}
