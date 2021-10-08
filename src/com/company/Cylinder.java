package com.company;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double h, double r){
        base= new Circle(r);
        height = h;
    }
    public Cylinder(){
        base= new Circle(1);
        height = 2;
    }
    public double vol (){
        return this.base.area()*this.height;
    }
    public double sa (){
        return (this.base.area()*2)+(this.base.circumference()*this.height);
    }

}
