public class Ex4
{  
    public static void checkPerfect(int max){
        for(int i = 1; i < max + 1; i++){
            int divisorCounter = 0;
            int integer = i;
            for(int x = 1; x < integer; x++){
                if ((integer%x) == 0) {
                    divisorCounter += x;
                }
            }
            if(divisorCounter == integer){
                System.out.println(integer + " is a perfect number!");
            } else {
                System.out.println(integer + " is not a perfect number.");
            }

        }
        
    }  
}
