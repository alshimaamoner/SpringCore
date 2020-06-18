package com.company;

import java.util.List;

public class Test {
    private List<Shape> shapes;
    private Shape shape;
    private String msg;
    public Test(){}
    public Test(int length) {
        System.out.println("Integer");
    }
    public Test(String msg) {
        System.out.println("String");
    }
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
  public void draw(){
        shape.draw();
  }

    public String getMsg() {
        return msg;
    }
    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }


}
