import java.util.Arrays;

class Weight
{
  private int[] data;
  
  // Constructor
  public Weight(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j = 0; j < init.length; j++)
    {
      data[j] = init[j]; 
    }
  }

  public int average()
  {
    int total = 0;
    for (int j = 0; j < data.length; j++)
    {
      total += data[j]; 
    }
    int average = total/data.length;     
    return average;
  }

  public int subAverage(int start, int end){
    int total = 0;
    for(int i = start; i <= end; i++){
      total += data[i];
    }
    return total/abs(end)-abs(start);
  }

  public int difference(int a, int b){
    return a - b;
  }

}
