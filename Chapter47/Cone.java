import java.lang.*;

public class Cone{
    double radius;
    double height;

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double slantHeight(){
        return Math.sqrt((radius*radius) + (height*height));  
    }

    public double angle(){
        return Math.atan(radius/height);
    }
}
