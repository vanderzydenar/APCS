import java.util.Scanner;

class Ex2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String word;

    System.out.println("Word:");

    word = scan.nextLine();

    for(int i = 0; i < word.length(); i++){
        System.out.println(word);
    }

  }
}