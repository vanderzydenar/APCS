import java.util.Scanner;

public class Ex4
{  
  public static void main ( String[] args )  
  {
    String word = "";

    Scanner scan = new Scanner( System.in );

    System.out.println("Word:");

    word = scan.nextLine();

    for(int x = 0; x < word.length(); x++){
        System.out.println(word.charAt(x));
    }


        
  }
}