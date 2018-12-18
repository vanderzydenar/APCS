import java.util.Scanner;

class Ex {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Exponent:");

    double E = scan.nextInt();

    double logarithm = 2*(2*E);

    System.out.println("Logarithm: "+logarithm);
  }
}