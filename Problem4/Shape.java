package Problem4;

public abstract class Shape implements Scalable {
    private String name;

    public Shape(String name){
        this.name = name;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString(){
        return String.format("%s, - Perimeter: %.2f, Area: %.2f", name, getPerimeter(), getArea());
    }
};



