package test.testUsingInterface;

import org.springframework.beans.factory.annotation.Required;

public class Triangle implements Shape{

    private Point point1;
    public Point getPoint1() {
        return point1;
    }
    @Required
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }
    @Override
    public void draw() {
        System.out.println(point1);
//        System.out.println(point2);
    }
}
