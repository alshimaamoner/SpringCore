package test.testUsingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("testInterface.xml");
        applicationContext.registerShutdownHook();
        Shape triangle= (Shape) applicationContext.getBean("triangle");
     // triangle.getPoint1().setX(3);
       triangle.draw();
    }
}
