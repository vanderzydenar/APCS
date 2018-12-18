import java.io.* ;

class Ex1
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    
    int sum = 0;
    int evenSum = 0;
    int oddSum = 0;

    int[] val = {0, 1, 2, 3}; 
    
    // compute the sums
    for (int index = 0; index < data.length; index++)
    {
        sum1 += data[index];

        if(data[index] % 2 == 0){
            evenSum += data[index];
        }
        if(data[index] % 2 != 0){
            oddSum += data[index];
        }
    }
      
    // write out the three sums
    System.out.println("Sum:" sum + " Even Sum:" + evenSum + " Odd Sum:" + oddSum);

  }
}      