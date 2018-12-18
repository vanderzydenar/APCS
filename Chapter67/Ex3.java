import java.io.* ;
import java.util.Arrays;


public class Ex3
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };

    int longestRowSize = 0;

    // compute the longest row
    for ( int row=0; row < data.length; row++)
    {
      if(data[row].length > longestRowSize){
        longestRowSize = data[row].length;
      }           
    }

    int[] sums = new int[longestRowSize];

    //System.out.println(longestRowSize);
    
    // compute the sums fo each column and place it in sums array
    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length; col++) 
      {   
        sums[col] += data[row][col];  
                  
      }
    }

    System.out.println(Arrays.toString(sums));
      
  }
}   