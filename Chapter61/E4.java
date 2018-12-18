import java.io.* ;

class E4
{

  public static void main ( String[] args )  
  {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int[] result = new int[data.length];
    
    // copy the data in reversed order to result
    for (int i = 0; i < data.length; i++)
    {
      result[i] = data.length - i;
    }
      
    // write out the result
    for (int j = 0; j < result.length; j++)
    {
      System.out.println(result[j]);

    }

  }
}      