import java.util.Scanner;

class Ex1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int firstInt;
    int SecondInt;

    System.out.println("First Int:");

    firstInt = scan.nextInt();

    System.out.println("Second Int:");

    SecondInt = scan.nextInt();

    for(int i = firstInt + 1; i < SecondInt; i++){
        System.out.println(i);     
    }

  }
}