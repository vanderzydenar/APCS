import java.util.Scanner;

public class Ex1
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("Radius:");
    double radius = scan.nextInt();

    double area = Math.PI * (radius* radius);

    System.out.println(area);




  }
}