import java.util.Scanner;

public class Ex1
{  
  public static void main ( String[] args )  
  {
    double savings = 0;
    double checking = 0;
    double serviceCharge = 0;

    Scanner scan = new Scanner( System.in );

    System.out.println("Checking account Balance:");

    savings = scan.nextInt();

    System.out.println("Checking account Balance:");

    checking = scan.nextInt();

    if(checking > 1000 || savings > 1500){
      serviceCharge = 0;  
    } else {
      serviceCharge = 0.15;
    }
    System.out.println("Service charge per check: "+serviceCharge);

        
  }
}