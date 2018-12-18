import java.util.Scanner;

public class Ex5
{  
  public static void main ( String[] args )  
  {
    double firstX = 0;
    double firstY = 0;
    double secondX = 0;
    double secondY = 0;
    double width = 0;
    double height = 0;
    double area = 0;

    Scanner scan = new Scanner( System.in );

    System.out.println("First X coordinate:");

    firstX = scan.nextInt();

    System.out.println("First Y coordinate:");

    firstY = scan.nextInt();

    System.out.println("Second X coordinate:");

    secondX = scan.nextInt();

    System.out.println("Second Y coordinate:");

    secondY = scan.nextInt();

    if(!(firstX==secondX) && !(firstY==secondY)){
        width = Math.abs(firstY - secondY);
        height = Math.abs(firstX - secondX);
        area = width * height;
    }

    System.out.println("Width: "+width);
    System.out.println("Height: "+height);
    System.out.println("Area: "+area);

        
  }
}