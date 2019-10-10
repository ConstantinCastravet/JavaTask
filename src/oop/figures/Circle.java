package oop.figures;

import static java.lang.Math.PI;

public class Circle extends GraphicObject {
    private double radius;

    public Circle(double radius) throws Exception {
        setRadius(radius);
    }

    public double perimeter() {
        return 2 * getRadius() * PI;
    }

    public double area() {
        return PI * Math.pow(getRadius(), 2);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception {
        if (radius < 0)
            throw new IllegalAccessException("Wrong size");
        this.radius = radius;
    }
}
