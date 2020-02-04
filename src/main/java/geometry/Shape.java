package geometry;

public abstract class Shape {
    protected String color = "Neutral";
    protected double area = 0.0;

    public double CalculateArea(){
        return area;
    }
}
