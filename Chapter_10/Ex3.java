public class Ex3
{  
  public static void main ( String[] args )  
  {
    double degrees = 5;
    double x = (degrees * Math.PI)/180; 

    double sinex = Math.sin(x);
    double cosx = Math.cos(x);

    double sqaureFirst = sinex * sinex;
    double sqaureSecond = cosx* cosx;

    double sum = sqaureFirst + sqaureSecond;

    System.out.println("sine: " + sinex + " cosine: " + cosx + " sum of squares: " + sum );


  }
}