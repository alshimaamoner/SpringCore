package test.annotation;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Triangle {

    private Point point1;

    private Point point2;
    public Point getPoint1() {
        return point1;
    }
    //@Required
    @Resource(name="pointOne")
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }
    public Point getPoint2() {
        return point2;
    }
    @Resource(name="pointTwo")
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
    @PostConstruct
    public void init(){
        System.out.println("Init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }

    public void draw() {
        System.out.println(point1);
        System.out.println(point2);
    }
}
