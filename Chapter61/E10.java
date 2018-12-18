class E10
{
  public static boolean sameElts( int[] a, int[] b )
  {
    int sameNumberCount = 1;
    Boolean thing = true;

    for(int i = 0; i < a.length; i++){
        Boolean found = false;
        for(int j = 0; j < a.length; j++){
            if(a[i] == b[j]){
                found = true;
            }
        }
        if(!found){
            thing = false;
        }
    }  
    if(thing) {
        return true;
    } else {
        return false;
    }
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };

    if ( sameElts( arrayA, arrayB ) )
      System.out.println( "Same Elements" );
    else
      System.out.println( "DIFFERENT elements" );      
 
  }
}