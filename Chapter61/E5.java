import java.io.* ;

class E5
{

  public static void main ( String[] args )  
  {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    Scanner scan = new Scanner( System.in );

    System.out.println("Type Your Sentence:");

    double sentence = scan.nextInt();

    int lettersOfTheAlphabetFound = 0;

    for(int i = 0; i < sentence.length; i++){
        if(sentence.index(alphabet[i]) >= 0){
            lettersOfTheAlphabetFound += 1;
        }
    }

    if(lettersOfTheAlphabetFound == 26){
      System.out.println("Sentence is a panagram.");
    } else {
      System.out.println("Sentence is NOT a panagram.");
    }


  }
}      