package Problem4;

public class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(String name, double side){
        super(name, side,(Math.sqrt(3) / 2) * side, side);
        this.side = side;
    }
        
    @Override
    public void scale(double factor){
        super.scale(factor);
        side *= factor;
    }

    @Override
    public String toString(){
        return String.format("%s, Side: %.2f", super.toString(), side);
     }
        
    }
