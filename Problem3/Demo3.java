package Problem3;

public class Demo3 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Ellipse("Ellipse1", 5, 3),
            new Triangle("Triangle1", 3, 4, 5),
            new EquilateralTriangle("Equilateral1", 4)
        };
        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }
}
