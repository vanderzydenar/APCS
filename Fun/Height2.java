import java.util.Scanner;

public class Height2 {
  public static void main(String[] args) {
    testFeetInInches();
  }
    public static void testFeetInInches(){
        String errorMessage = "Feet in Inches is not working correctly with inputs";
        verify(6, 0, 72, errorMessage);
        verify(6, 6, 78, errorMessage);
        verify(5, 8, 68, errorMessage);
        verify(5, 11, 71, errorMessage);
    }
    public static void verify(double a, double b, double result, String errorMessage){
        if (feetInInches(a,b) != result) {
            System.out.println(errorMessage + a + " " + b);
        } else {
            System.out.println("OK");
        }
    } 

        
}