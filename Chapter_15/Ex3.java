import java.util.Scanner;

class Ex3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String firstWord;
    String secondWord;

    System.out.println("First Word:");

    firstWord = scan.nextLine();

    System.out.println("Second Word:");

    secondWord = scan.nextLine();

    String startString = firstWord + secondWord;

    int dotsNeeded = 30 - startString.length();

    System.out.print(firstWord);
  
    while(!(dotsNeeded == 0)){
        dotsNeeded = dotsNeeded - 1; 
        System.out.print(".");
    }
     
    System.out.print(secondWord);
        
  }
  }