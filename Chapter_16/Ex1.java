import java.util.Scanner;

public class Ex1
{  
  public static void main ( String[] args )  
  {
    double price = 0;

    Scanner scan = new Scanner( System.in );

    System.out.println("Purchase Total Price:");

    price = scan.nextInt();

    if(price > 100){
        price = price - (price *.10);
        System.out.println("New Price: "+price);
    }
        
  }
}