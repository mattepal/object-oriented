package mpaletti.exercises.oop.basic;

import java.awt.*;
public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public boolean contains(Point p){
        double distance;
        distance=center.distance(p);
        if(distance<radius){
            return true;
        }
        return false;
    }
    public void translate(int dx,int dy){
        this.center.translate(dx,dy);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
