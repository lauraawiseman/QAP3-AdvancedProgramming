package Problem4;

public class Ellipse extends Shape {
     private double a;
     private double b;

     public Ellipse(String name, double axis1, double axis2){
        super("Ellipse");
       this.a = axis1;
       this.b = axis2;
     }

     @Override
     public double getPerimeter(){
        return Math.PI * 2 * (Math.sqrt((a * a + b * b) / 2));
     }

     @Override
     public double getArea(){
        return Math.PI * a * b;
     }

     @Override
     public void scale(double factor){
      a *= factor;
      b *= factor;
     }
    
     @Override
     public String toString(){
       return String.format("%s, Major Axis: %.2f, Minor Axis: %.2f" , super.toString(), a, b); 
      }


}