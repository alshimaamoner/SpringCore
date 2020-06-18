package test.autowire;

import org.springframework.beans.factory.annotation.Required;

public class Triangle {
    private Point point1;
    private Point point2;

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
}
