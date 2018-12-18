import java.util.Scanner;

class Ex3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Interest Rate:");

    double rate = scan.nextInt();

    double years = 72.0/rate;

    System.out.println("It will take "+years+" years to double your money at "+rate+"% interest");

  }
}