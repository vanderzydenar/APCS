import java.util.Scanner;

class Ex2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double efficiency;
    double airTemperature;
    double steamTempurature;

    System.out.println("Enter air temp (in Kelvin):");

    airTemperature = scan.nextInt();

    System.out.println("Enter steam temp (in Kelvin):");

    steamTempurature = scan.nextInt();

    if(steamTempurature < 373){
        efficiency = 0;
    } else {
        efficiency = 1 - (airTemperature / steamTempurature);
    }

    System.out.println(efficiency);


        
  }
  }