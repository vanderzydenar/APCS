import java.util.Scanner;

class PhoneBook
{ 
  String targetFirstName;
  String targetLastName;
  private PhoneEntry[] phoneBook; 

  public PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[6] ;

    phoneBook[0] = new PhoneEntry("James", "Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry("Grace", "Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry("Paul", "Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry("Violet", "Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry("John", "Wood", "(913) 883-2874" );

  }

  public void search()  
  {
    boolean found = false;

    System.out.println("*Search*");
    Scanner scan = new Scanner(System.in);

    System.out.println("Type the first name:"); 
    targetFirstName = scan.nextLine();

    System.out.println("Type the last name:"); 
    targetLastName = scan.nextLine();

    targetFirstName = targetFirstName.toUpperCase();
    targetLastName = targetLastName.toUpperCase();

    if(targetFirstName.length() > 0 && targetLastName.length() > 0 ){
        for ( int x=0; x < phoneBook.length; x++)
        {
            if (phoneBook[x].getFirstName().toUpperCase().equals(targetFirstName) && phoneBook[x].getLastName().toUpperCase().equals(targetLastName)){
                System.out.println(phoneBook[x].getFirstName() + " " + phoneBook[x].getLastName() + " " + phoneBook[x].getPhone());
                found = true;
            }
        }
    }
    if(targetLastName.length() > 0 && targetFirstName.length() == 0 ){
        for ( int y=0; y < phoneBook.length; y++)
        {
            if (phoneBook[y].getLastName().toUpperCase().equals(targetLastName)){
                System.out.println(phoneBook[y].getFirstName() + " " + phoneBook[y].getLastName() + " " + phoneBook[y].getPhone());
                found = true;
            }
        }
    }
    if(targetFirstName.length() > 0 && targetLastName.length() == 0 ){
        for ( int z=0; z < phoneBook.length; z++)
        {
            if (phoneBook[z].getFirstName().toUpperCase().equals(targetFirstName)){
                System.out.println(phoneBook[z].getFirstName() + " " + phoneBook[z].getLastName() + " " + phoneBook[z].getPhone());
                found = true;
            }
        }
    }    
    if(!found){
        System.out.println("Name not found. Please try again.");
    }
  }
  public void add()  
  {
    System.out.println("*Add*");
    Scanner scan = new Scanner(System.in);

    System.out.println("Type the first name:"); 
        String firstName = scan.nextLine();
    System.out.println("Type the last name:"); 
        String lastName = scan.nextLine();
     System.out.println("Type the number:"); 
        String number = scan.nextLine();

      for(int i = 0; i < phoneBook.length; i++){
          if(phoneBook[i] == null){
              phoneBook[i] = new PhoneEntry(firstName, lastName, number);
          }
      }
  }

  
  public void delete()  
  {
    System.out.println("*Delete*");
    Scanner scan = new Scanner(System.in);

    System.out.println("Type the first name:"); 
    targetFirstName = scan.nextLine();

    System.out.println("Type the last name:"); 
    targetLastName = scan.nextLine();

    targetFirstName = targetFirstName.toUpperCase();
    targetLastName = targetLastName.toUpperCase();

    
    for ( int x=0; x < phoneBook.length; x++)
    {
        if (phoneBook[x].getFirstName().toUpperCase().equals(targetFirstName) && phoneBook[x].getLastName().toUpperCase().equals(targetLastName)){
            System.out.println("hi");
            phoneBook[x] = null;
        }
    }
  } 
    
  
}
