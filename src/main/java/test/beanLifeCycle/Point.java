package test.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Point implements InitializingBean, DisposableBean {
   private int x;
   private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
     @Override
    public void destroy() throws Exception {
        System.out.println("Point destroy ");

    }

        @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Triangle init ");
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
