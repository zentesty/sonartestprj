package geometry;
import org.testng.annotations.Test;

public class TestShapeEx {

    @Test()
    public void GetAllAreas(){
        Shape pSquare = new Square();
        Shape pTriangle = new Triangle();

        ((Square) pSquare).side = 22.2;
        double tmp = pSquare.CalculateArea();
        System.out.println("AREA of square = " + tmp);

        ((Triangle) pTriangle).setBase(10.3);
        ((Triangle) pTriangle).setHeight(4.6);
        tmp = pTriangle.CalculateArea();
        System.out.println("AREA of triangle = " + tmp);
    }

    @Test()
    public void GetTriangleArea(){
        Shape pTriangle = new Triangle();

        double tmp;

        ((Triangle) pTriangle).setBase(4.3);
        ((Triangle) pTriangle).setHeight(2.6);
        tmp = pTriangle.CalculateArea();
        System.out.println("AREA of triangle = " + tmp);
    }
}
