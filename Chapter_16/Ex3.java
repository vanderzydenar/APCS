import java.util.Scanner;

public class Ex3
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("Total Tank Capacity:");

    int tankCapacity = scan.nextInt();

    System.out.println("Gas Left(%):");

    int gasLeft = scan.nextInt();

    System.out.println("Car MPG:");

    int carMPG = scan.nextInt();
        //gallons left           //how far the car can travel per mile
    if (((gasLeft * tankCapacity)*carMPG) >= 200){
        System.out.println("Get gas!");
    } else {
        System.out.println("Safe to proceed.");
    }

  }
}