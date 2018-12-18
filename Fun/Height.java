import java.util.Scanner;

class Height {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );
    
    System.out.println("How many feet tall are you?"); 
    int feet = scan.nextDouble();
    System.out.println("How many inches remain?"); 
    int inches = scan.nextDouble();

    System.out.println("Total Height in Inches:" + heightInInches(feet, inches)); 
    System.out.println("Total Height in Meters:" + heightInMeters(feet, inches));       
  }
    public static double heightInInches(double feet, double inches){
        double height = (feet * 12) + inches;
        return height;
    }
    public static double heightInMeters(double feet, double inches){
        double totalInches = (feet * 12) + inches;
        double meters = totalInches * 0.0254;
        return meters; 
    } 

        
}