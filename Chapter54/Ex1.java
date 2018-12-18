import java.util.Scanner;

public class Ex1
{  
  public static void main ( String[] args )  
  {
    String bianaryNumber = "";

    Scanner scan = new Scanner( System.in );

    System.out.println("Enter A Non Negative Integer: ");

    int integer = scan.nextInt();

    if(integer > 0){
        while(integer > 0){
        int x = integer % 2;
        bianaryNumber += Integer.toString(x);
        integer = integer/2;
        }
    } 
    if(bianaryNumber.length()%2 == 0){
      System.out.println("Number is Evil");
    }
    if(bianaryNumber.length()%2 == 1){
      System.out.println("Number is Odious");
    }
    


        
  }
}