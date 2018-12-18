import java.util.Scanner;

public class Ex2
{  
  public static void main ( String[] args )  
  {
    String bianaryNumber = "";

    Scanner scan = new Scanner( System.in );

    System.out.println("Enter A Non Negative Integer: ");

    int integer = scan.nextInt();
    int originalInteger = integer;

    if(integer > 0){
        while(integer > 0){
            int x = integer % 10;
            bianaryNumber += Integer.toString(x);
            integer = integer/10;
            if(integer == 13){
                System.out.println(originalInteger + " is unlucky");
                break;
            } 
            if(integer == 0){
                System.out.println(originalInteger + " is safe");
            }
        }
    }

    


        
  }
}