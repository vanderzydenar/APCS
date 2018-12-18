public class Ex2
{  
  public static void main ( String[] args )  
  {

    double x = 5; 

    double sinex = Math.sin(x);
    double cosx = Math.cos(x);

    double squareFirst = sinex * sinex;
    double squareSecond = cosx* cosx;

    double sum = squareFirst + squareSecond;

    System.out.println("sine: " + sinex + " cosine: " + cosx + " sum of squares: " + sum );


  }
}