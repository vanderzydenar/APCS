import java.util.Scanner;

public class Ex6
{  
  public static void main ( String[] args )  
  {
    Boolean passwordSucks = true;

    Scanner scan = new Scanner( System.in );

    while(passwordSucks){
      System.out.println("Enter Your Password: ");
      String password = scan.nextLine();

      String passwordUpperCase = password.toUpperCase();
      String passwordLowerCase = password.toLowerCase();

      if (password.length() >= 7 && passwordLowerCase != password && passwordUpperCase != password){
        if(password.indexOf('0') != -1 || password.indexOf('1') != -1 || password.indexOf('2') != -1 ||  password.indexOf('3') != -1 ||  password.indexOf('4') != -1 ||  password.indexOf('5') != -1 ||  password.indexOf('6') != -1 ||  password.indexOf('7') != -1 ||  password.indexOf('8') != -1 ||  password.indexOf('9') != -1){
          System.out.println("Acceptable password");
          break;
        }  
      }
      System.out.println("That is not an acceptable password");
    }  



    
    


        
  }
}