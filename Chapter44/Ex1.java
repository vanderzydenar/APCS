import java.util.Scanner;

public class Ex1
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("Enter Your Name: ");

    String name = scan.nextLine();

    int whereElSpaceiIs = name.indexOf(' ');

    System.out.println(name.substring(0, whereElSpaceiIs) + " " + name.substring(whereElSpaceiIs + 1, name.length()).toUpperCase());
    
    


        
  }
}