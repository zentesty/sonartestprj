package geometry;
import org.testng.annotations.Test;

public class TestShape {

    @Test()
    public void GetAllAreas(){
        Shape pCircle = new Circle();
        Shape pSquare = new Square();
        Shape pTriangle = new Triangle();

        double tmp;

        ((Circle) pCircle).radius = 1.54;
        tmp = pCircle.CalculateArea();
        System.out.println("AREA of circle = " + tmp);

        ((Square) pSquare).side = 22.2;
        tmp = pSquare.CalculateArea();
        System.out.println("AREA of square = " + tmp);

        ((Triangle) pTriangle).setBase(10.3);
        ((Triangle) pTriangle).setHeight(4.6);
        tmp = pTriangle.CalculateArea();
        System.out.println("AREA of triangle = " + tmp);
    }

    @Test()
    public void GetCircleArea(){
        Shape pCircle = new Circle();

        double tmp;

        ((Circle) pCircle).radius = 1.54;
        tmp = pCircle.CalculateArea();
        System.out.println("AREA of circle = " + tmp);
    }

    @Test()
    public void GetSquareArea(){
        Shape pSquare = new Square();

        double tmp;

        ((Square) pSquare).side = 22.2;
        tmp = pSquare.CalculateArea();
        System.out.println("AREA of square = " + tmp);
    }

    @Test()
    public void GetTriangleArea(){
        Shape pTriangle = new Triangle();

        double tmp;

        ((Triangle) pTriangle).setBase(10.3);
        ((Triangle) pTriangle).setHeight(4.6);
        tmp = pTriangle.CalculateArea();
        System.out.println("AREA of triangle = " + tmp);
    }

}
