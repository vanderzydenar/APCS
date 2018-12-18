import java.util.Scanner;

public class Ex1
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("Cost per Kilowatt-hour in Cents:");

    double costPerKWH= scan.nextInt();

    System.out.println("Kilowatt-hours used per Year:");

    double anualKWH = scan.nextInt();

    double anualCost = 653/8.42;

    System.out.println(anualCost);

  }
}