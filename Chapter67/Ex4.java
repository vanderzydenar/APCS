import java.io.* ;

public class Ex4
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };

    int min = 0;
    int max = 0;
    
    // declare and initialize the max and the min
    
    //  
    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length; col++) 
      {
        if(data[row][col] < min && data[row][col] < max){
        min = data[row][col];
        }
        if(data[row][col] > max && data[row][col] > min){
        max = data[row][col];
        }
        
      }
    }
      
    // write out the results
    System.out.println( "max = " + max + "; min = " + min );

  }
}      