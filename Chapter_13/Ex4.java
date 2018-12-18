import java.util.Scanner;

class Ex4 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("First Number:");

    double X = scan.nextInt();

    System.out.println("Second Number:");

    double Y = scan.nextInt();

    double harmonicMean = 2 / ( 1/X + 1/Y );

    System.out.println("Harmonic Mean: "+harmonicMean);
  }
}