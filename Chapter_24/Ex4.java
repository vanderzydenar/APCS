import java.util.Scanner;

public class Ex4
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    System.out.println("Num:");

    int num = scan.nextInt(); 

    for(int a = 0, b = -1; a <= num ; a++, b++){
      if((a*a)+(b*b) == num){
          System.out.println(a+"^2 +"+b+"^2 = "+num);
          break;
      }
    }


        
  }
}