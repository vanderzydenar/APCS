import java.util.Scanner;

public class ex4
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("What is your weight?:");

    int weight = scan.nextInt();

    if (30 < weight && weight < 250){
        System.out.println("You are allowed in the contest!");
    } else {
        System.out.println("Sorry, you are not allowed in the conetest.");
    }

  }
}