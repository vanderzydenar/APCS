import java.util.Scanner; 

public class PantryTester
{
  public static void main ( String[] args )
  {
    Scanner userInput = new Scanner(System.in);

    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    println

    System.out.println("Welcome to Mother Hubbard's Pantry")

    System.out.println("The Jams Are:")
    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( hubbard );

    while(true){
        System.out.println("Please make your selection (1,2, or 3)");   
        selection= userInput.nextInt();
        if(selection != 1 || selection != 2 || selection != 3){
            System.out.println("Good-by");
        } else {
            hubbard.select(selection);
        }
        System.out.println("Enter amount to spread:");
        selection= userInput.nextInt();
        hubbard.spread(2);
        System.out.println( hubbard );
    }

  }
}