import java.util.Scanner;
import java.lang.Math;

public class Ex7
{  
  public static void main ( String[] args )  
  {
    Scanner scan = new Scanner(System.in);

    double days;
    double months;
    double years;
    double totalDays;
    double lifePercentage;
    double totalSeconds;

    System.out.println("Enter Age In Years:");
    years = scan.nextInt();

    System.out.println("Enter Remaining Months:");
    months = scan.nextInt();

    System.out.println("Enter Remaining Days:");
    days = scan.nextInt();

    totalDays = (years/365) + (months/((31 + 28 + 31 + 30 + 31))/5) + days;
    totalSeconds = totalDays * 24 * 60 * 60;
    lifePercentage = totalSeconds/(80 * 24 * 60 * 60);

    System.out.println("Your percentage of an 80 year lifespan: " + lifePercentage);

  }
}