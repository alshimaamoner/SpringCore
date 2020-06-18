package com.company;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import java.util.*;

public class Main extends Thread{
    public  static  ApplicationContext applicationContext ;
    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("beans.xml");
                //BeanFactory is old style
      /*  BeanFactory beanFactory= new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\beans.xml"));
         Test t=(Test)beanFactory.getBean("test");
         t.draw();

       */
        //Application Context take all functionality from BeanFactory and added more functionalities

        Test t=(Test)applicationContext.getBean("test");
        t.getShapes().forEach(s-> System.out.println(s));
        //System.out.println(t.getMsg());
       // t.draw();
        //Test ALliase
//        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("beans.xml");
//        Test test=(Test)applicationContext.getBean("testTraingle");
//        test.draw();
        Main t1=new Main();
        t1.start();
        Main t2=new Main();
        t2.start();
    }

    @Override
    public void run() {
       // super.run();
        Test t=(Test)applicationContext.getBean("test");
        t.getShapes().forEach(s-> System.out.println(s));
    }
}
