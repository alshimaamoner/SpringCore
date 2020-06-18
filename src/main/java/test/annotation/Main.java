package test.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("testAnnotion.xml");
        applicationContext.registerShutdownHook();
        Triangle triangle= applicationContext.getBean("triangle", Triangle.class);
       triangle.draw();
    }
}
