import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {  
    Scanner scan = new Scanner(System.in);

    int beginStars = 0;

    System.out.println("Stars:");

    beginStars = scan.nextInt();

    for(int i = beginStars; i > 0; i -= 1){
        while(beginStars > 0){
            System.out.print("*"); 
            beginStars -= 1              
        }
        System.out.println("*"); 
    }
}
}