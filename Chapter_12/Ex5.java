import java.util.Scanner;

public class Ex5
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );


    System.out.println("Your string:");

    String string = scan.nextLine();

    System.out.println("Value1:");

    int value1 = scan.nextInt();

    System.out.println("Value2:");

    int value2 = scan.nextInt();

    String newString = string.substring(value1, value2);

    System.out.println(newString);


    




  }
}