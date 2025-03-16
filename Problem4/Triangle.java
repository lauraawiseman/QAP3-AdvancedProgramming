package Problem4;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3){
        super(name);
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2){
            throw new IllegalArgumentException("Invalid triangle class");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    @Override 
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
   public double getArea(){
    double s = getPerimeter() / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
   }

    @Override
    public void scale(double factor){
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    @Override
    public String toString(){
     return String.format("%s, Sides: %.2f, %.2f, %.2f", super.toString(), side1, side2, side3);  
      }
}
