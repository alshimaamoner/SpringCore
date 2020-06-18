package com.company;

public class Traingle implements Shape {
    //static (Increment counter without static counter always 1)
    private  int count=0;
    private String msg="triangle no ";
    public Traingle(){
        msg+=++count;
    }
    @Override
    public void draw() {
        System.out.println("Triangle.........");
    }

    @Override
    public String toString() {
        return "Traingle{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
