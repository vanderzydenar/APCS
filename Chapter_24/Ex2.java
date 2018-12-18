import java.util.Scanner;

public class Ex2
{  
  public static void main ( String[] args )  
  {
    double max = 0;
    double sum = 0;

    Scanner scan = new Scanner( System.in );

    System.out.println("Max:");

    max = scan.nextInt(); 

    for(int x = 0; x < max + 1; x++){
        if(x % 2 != 0){
            sum += x;
        }
    }

    System.out.println(sum);

        
  }
}