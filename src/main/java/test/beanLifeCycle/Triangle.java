package test.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle// implements //InitializingBean, DisposableBean
{
    private Point point1;
    private Point point2;

    public Triangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
   // @Override
    public void destroy() throws Exception {
        System.out.println("Triangle destroy ");

    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Triangle init ");
//    }
public void init() throws Exception {
    System.out.println("Triangle init ");
}

}
