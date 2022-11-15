package entities;

import enumeracao.Color;

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
    
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}