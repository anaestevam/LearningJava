package entities;

import entites.enums.Color;

public class Circle1 extends Shape{
    private Double radius;

    public Circle1(){
        super();
    }
    public Circle1(Color color, Double radius){
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius;
    }
}