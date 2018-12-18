import java.util.Scanner;

public class Ex2
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("Cents:");

    int total_cents = scan.nextInt();

    int dollars = total_cents / 100;

    int cents = total_cents % 100;

    System.out.println("That is " + dollars + " dollars and " + cents  +" cents.");



    /*

    String total_cents = new String (scan.nextLine());

    String dollars = total_cents.substring(0, total_cents.length() - 2);

    String cents = total_cents.substring(total_cents.length() - 2, total_cents.length());

    System.out.println(dollars);
    System.out.println(cents);

    */



  }
}