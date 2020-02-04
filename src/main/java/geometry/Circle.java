package geometry;

public class Circle extends Shape {
    public double radius = 0;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double CalculateArea() {
        area = radius * radius * Math.PI;
        return area;
    }
}
