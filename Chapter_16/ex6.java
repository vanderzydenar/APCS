import java.util.Scanner;
import java.lang.Math;

public class ex6
{  
  public static void main ( String[] args )  
  {

    Scanner scan = new Scanner( System.in );

    double windChill;

    System.out.println("Enter Wind Speed:");

    double windSpeed = scan.nextInt();

    System.out.println("Enter Temperature:");

    double temp = scan.nextInt();

    if (windSpeed < 3){
        windChill = temp;
        System.out.println("Wind Chill: "+ windChill);
    } else if (temp > 50) {
        windChill = temp;
        System.out.println("Wind Chill: "+ windChill);
    } else {
        windChill = (35.74 + 0.6215*temp) - (35.75*Math.pow(windSpeed, 0.16)) + (0.4275*temp*Math.pow(windSpeed, 0.16));
        System.out.println("Wind Chill: "+ windChill);
    }

  }
}