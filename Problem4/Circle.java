package Problem4;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

@Override
public double getPerimeter(){
    return 2 * Math.PI * radius;
}

@Override
public double getArea(){
    return Math.PI * radius * radius;
}

@Override
public void scale(double factor){
    radius *= factor;
}

@Override
public String toString(){
    return String.format("%s, Radius: %.2f", super.toString() , radius);}
}
