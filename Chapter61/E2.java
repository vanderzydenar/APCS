import java.io.* ;

class E2
{

  public static void main ( String[] args )  
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables for the two largest
    
    int Largest1 = data[0];
    int Largest2 = data[0];
    
  
    
    // compute the two largest
    for (int index = 0; index < data.length; index++)
    {
        if(data[index] > Largest1){
            Largest1 = data[index];
        }
        if(data[index] > Largest2 && data[index] < Largest1){
            Largest2 = data[index];
        }
    }
      
    // write out the two largest
    System.out.println("1st Largest:" + Largest1);
    System.out.println("2nd Largest:" + Largest2);

  }
} 