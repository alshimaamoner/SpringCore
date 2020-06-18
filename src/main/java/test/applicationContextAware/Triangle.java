package test.applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements ApplicationContextAware, BeanNameAware {
    @Autowired
    private Point point1;
    @Autowired
    private Point point2;
    @Autowired
    private ApplicationContext applicationContext=null;

    public Triangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

//    public Point getPoint1() {
//        return point1;
//    }
//
//    public void setPoint1(Point point1) {
//        this.point1 = point1;
//    }
//
//    public Point getPoint2() {
//        return point2;
//    }
//
//    public void setPoint2(Point point2) {
//        this.point2 = point2;
//    }
    public void draw(){
        System.out.println(point1);
        System.out.println(point2);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is "+s);
    }
}
