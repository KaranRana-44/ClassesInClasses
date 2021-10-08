package com.company;

public class Circle {
    private double radius;

    public Circle (double r){
        radius= r;
    }
    public Circle (){
        radius= 5;
    }
    public double area(){
       double a = Math.PI * Math.pow(this.radius,2);
       return a;
    }
    public double circumference(){
        double c= 2* Math.PI * this.radius;
        return c;
    }


}
