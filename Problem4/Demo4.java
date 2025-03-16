package Problem4;

public class Demo4 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 5),
            new Ellipse("Ellipse", 6, 4),
            new Triangle("Triangle", 6, 4, 6),
            new EquilateralTriangle("Equilateral Triangle", 5)
        };

        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes,2); 
        System.out.println("After Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] shapes, double factor){
        for (Scalable shape : shapes){
            shape.scale(factor);
        }
    }
    
}
