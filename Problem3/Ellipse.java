package Problem3;

public class Ellipse extends Shape {
    // Attributes
     private double a, b;

     public Ellipse(String name, double axis1, double axis2){
        super(name);
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
     }

     @Override
     public double getPerimeter(){
        return Math.PI * 2 + (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(a - b, 2) / 2);
     }

     @Override
     public double getArea(){
        return Math.PI * a * b;
     }
     

}
