import java.util.Scanner;

public class Ex2
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("Bolts:");

    double bolts = scan.nextInt();

    
    System.out.println("Nuts:");

    double nuts = scan.nextInt();
    
    System.out.println("Washer:");

    double washers = scan.nextInt();

    double total = (bolts*5) + ( 3*nuts) + (1*washers);

    if(nuts >= bolts || washers * 2 >= bolts)
    {
        if(nuts >= bolts && washers * 2 >= bolts)
        {
            System.out.println("Your total is: "+total+"cents");
        }
        else if(!(nuts >= bolts))
        {
            System.out.println("Fatal Error. Not enough nuts");
        } 
        else if(!((washers * 2) >= bolts))
        {
            System.out.println("Fatal Error. Not enough washers.");
        }
        

    } else {
        System.out.println("Fatal Error. too few nuts and washers.");
    }

  }
}