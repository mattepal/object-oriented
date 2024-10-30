package mpaletti.exercises.oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
    Point upperLeft;
    Point bottomRight;

    protected Rectangle(String id, String color,Point upperLeft, Point bottomRight) {
        super(id, color);
        this.upperLeft=upperLeft;
        this.bottomRight=bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public double getArea() {
        return (bottomRight.x-upperLeft.x)*(upperLeft.y-bottomRight.y);
    }

    @Override
    public double getPerimeter() {
        return  (bottomRight.x-upperLeft.x)+(upperLeft.y-bottomRight.y)*2.0;
    }

    @Override
    public void move(Point p) {
        upperLeft.translate(p.x,p.y);
        bottomRight.translate(p.x,p.y);
    }

    @Override
    public void resize(double scale) {
        double newX = upperLeft.getX() + ((bottomRight.getX() - upperLeft.getX()) * scale);
        double newY = upperLeft.getY() - ((upperLeft.getY() - bottomRight.getY()) * scale);
        bottomRight.setLocation(newX, newY);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeft=" + upperLeft +
                ", bottomRight=" + bottomRight +
                ", id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
