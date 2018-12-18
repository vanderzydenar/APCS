import java.util.Scanner;

public class Tester
{  
  public static void main ( String[] args )  
  {

   Cone IisACone = new Cone(3.0, 5.0);
   System.out.println(IisACone.slantHeight());
   System.out.println(IisACone.angle());

   Cylinder IisACylinder = new Cylinder(5.0, 3.0);
   System.out.println(IisACylinder.volume());
   System.out.println(IisACylinder.surfaceArea());
    
    


        
  }
}