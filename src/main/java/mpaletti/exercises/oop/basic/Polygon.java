package mpaletti.exercises.oop.basic;

import java.awt.geom.Point2D;
import java.util.Arrays;

public class Polygon {

    final Point2D.Double[] vertices;
    public Polygon(Point2D.Double[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("At least three vertices are required");
        }
        this.vertices = vertices;
    }
    public  int getVerticesCount(){
        return  vertices.length;
    }
    public double getPerimeter(){
    double perim=0;
    for (int i=0;i<vertices.length;i++){
        int next=(i+1)%vertices.length;
        perim+= Math.hypot(vertices[i].x-vertices[next].x,vertices[i].y-vertices[next].y);
    }
    return perim;
    }
    public double getArea(){
    double area=0;
    for (int i=0;i<vertices.length;i++){
        int next=(i+1)%vertices.length;
        area+=vertices[i].x+vertices[next].y - vertices[i].y*vertices[next].x;
    }
    return Math.abs(area/2);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
