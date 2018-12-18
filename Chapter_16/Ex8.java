import java.util.Scanner;

public class Ex8
{  
  public static void main ( String[] args )  
  {
    Scanner scan = new Scanner( System.in );

    int age = 0;
    int time = 0;
    int cost = 0;

    System.out.println("Age:");
    age = scan.nextInt();

    System.out.println("Time(on a 24 hour clock):");
    time = scan.nextInt();

    if(age > 13 && time < 1700){ //adult mantinee
        cost = 5;
    } else if(age <= 13 && time < 1700){ //kid matinee 
        cost = 2;
    } else if(age > 13 && time > 1700){ //adult regular
        cost = 8;
    } else if(age <= 13 && time > 1700){ //kid regular
        cost = 4;
    }
    System.out.println("Your ticket cost is $"+cost); 

  }
}