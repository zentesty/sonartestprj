package geometry;

public class Triangle extends Shape {
    private double base = 0;
    private double height = 0;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double CalculateArea() {
        area = (base * height) / 2;
        return area;
    }


}
