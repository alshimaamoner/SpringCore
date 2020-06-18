package test.inheritanceTest;

import java.util.List;

public class Triangle {
    public List<Point> getPoint() {
        return point;
    }

    public void setPoint(List<Point> point) {
        this.point = point;
    }

    private List<Point> point;
   public void showList(){
       point.forEach(s-> System.out.println(s));
   }
}
