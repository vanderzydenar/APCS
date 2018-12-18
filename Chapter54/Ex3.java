public class Ex3
{  
    public static void checkLuck(int integer){
        String bianaryNumber = "";
        int originalInteger = integer;
        if(integer > 0){
            while(integer > 0){
                int x = integer % 10;
                bianaryNumber += Integer.toString(x);
                integer = integer/10;
                if(integer == 13){
                    System.out.println(originalInteger + " is unlucky");
                    break;
                } 
                if(integer == 0){
                    System.out.println(originalInteger + " is safe");
                }
            }
        }
    }

    public static void checkEvil(int integer){
        String bianaryNumber = "";
        int originalInteger = integer;
        if(integer > 0){
            while(integer > 0){
                int x = integer % 2;
                bianaryNumber += Integer.toString(x);
                integer = integer/2;
            }
        } 
        if(bianaryNumber.length()%2 == 0){
            System.out.println(originalInteger+" is Evil");
        }
        if(bianaryNumber.length()%2 == 1){
            System.out.println(originalInteger+" is Odious");
        }
    }   
}
