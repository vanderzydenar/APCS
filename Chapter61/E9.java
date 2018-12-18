import java.util.Arrays;

class E9
{
  public static boolean myEquals( int[] a, int[] b )
  {
    if(a.length() == b.length()){
        for(int i = 0; i < a.length(); i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    } else {
        return false;
    }
  }

  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };

    System.out.print("Arrays says: ")    ;
    if ( Arrays.myequals( arrayA, arrayB ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( Arrays.myequals( arrayA, arrayB ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      
  }
}