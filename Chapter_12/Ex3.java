import java.util.Scanner;

public class Ex3
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("Cents:");

    int total_cents = scan.nextInt();

    int dollars = total_cents / 100;

    int pennies = total_cents % 100;

    int quarters = pennies / 25;

    System.out.println(pennies);

    int dimes = pennies / 10;

    int cents = pennies % 10;

    System.out.println("Your change is: "+ dollars +" dollar, "+ quarters +" quarters, "+ dimes +" dime, and "+ cents +" cents.");




  }
}