import java.util.Scanner;

class Countdown {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int minutes = 0;
    int seconds = 0;

    System.out.println("Enter Minutes till Launch:");

    minutes = scan.nextInt();
    
    System.out.println(minutes+" minutes till launch.");

    minutes -= 1;
    while(minutes > 0){
        for(int i = 50; i > 0; i -= 10){
            System.out.println(minutes+" minutes and "+i+" seconds till launch.");
        }
        System.out.println(minutes+" minutes till launch.");
        minutes -= 1;
    }
    seconds = 60;
    while(seconds > 0){
        seconds -= 10;
        System.out.println(seconds+" seconds till launch.");
    }
    System.out.println("LIFT OFF!");
    
        
  }
  }