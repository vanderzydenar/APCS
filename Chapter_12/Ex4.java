import java.util.Scanner;

public class Ex4
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("Voltage:");

    int V = scan.nextInt();

    System.out.println("Resistance:");

    double R = scan.nextInt();

    double I = (V + 0.0)/R;

    System.out.println(I);

    




  }
}