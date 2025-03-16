package Problem3;

public class Demo3 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Ellipse("Ellipse", 5, 3),
            new Circle("Circle", 4),
            new Triangle("Triangle", 3, 4, 5),
            new EquilateralTriangle("Equilateral", 4),
        };
        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }
}
