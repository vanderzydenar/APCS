import java.util.Scanner;

class Ex2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Initial Desposit:");

    double P = scan.nextInt();

    System.out.println("Interest Rate:");

    double r = scan.nextInt();

    System.out.println("Number of Times per Year Interest is Calculated:");

    double n = scan.nextInt();

    System.out.println("Number of Years:");

    double t = scan.nextInt();

    double V = P*(1 + r/n)*n*t;
  }
}