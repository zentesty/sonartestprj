package geometry;

public class Square extends Shape {
    public double side = 0;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double CalculateArea() {
        area = side * side;
        return area;
    }
}
