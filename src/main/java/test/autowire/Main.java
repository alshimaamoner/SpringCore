package test.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansTest.xml");
       Triangle triangle= applicationContext.getBean("triangle",Triangle.class);
     // triangle.getPoint1().setX(3);
       triangle.draw();
    }
}
