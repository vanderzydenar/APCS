import java.io.* ;

class E3
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    
    int nearest = 0;
    
    // find the element nearest to zero
    for(int index = 0; index < data.length(); index++);
    {
        if(Math.abs(data[index]) < nearest){
            nearest = data[index];
        }
    }
      
    // write out the element nearest to zero
    System.out.println(nearest);

  }
} 