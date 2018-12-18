import java.util.Scanner;

public class Ex1
{  
  public static void main ( String[] args )  
  {
    double time = 0;
    double constantTimesExpontent = 0.83;
    double sheep;

    Scanner scan = new Scanner( System.in );

    System.out.println("Time:");

    time = scan.nextInt(); 

    for(int x = 1; x < time; x++){
        constantTimesExpontent *= 0.83;
    }

    sheep = 220/(1 + (10*constantTimesExpontent));

    System.out.println(sheep);

        
  }
}