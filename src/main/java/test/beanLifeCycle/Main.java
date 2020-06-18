package test.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanLifeCycle.xml");
         applicationContext.registerShutdownHook();
        Triangle triangle= applicationContext.getBean("triangle", Triangle.class);
     // triangle.getPoint1().setX(3);
       //triangle.showList();
    }
}
