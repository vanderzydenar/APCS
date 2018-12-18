public class Parrot {

    //Properties
    String name;
    double happiness = 0.0;
    String spokenWord = "";
    int timesSpoken;
    int timesSpokenAWord;
    String previousWord;

    public Parrot(String name) {
        this.name = name;
        this.timesSpoken = 0;
        this.timesSpokenAWord = 0;
        this.previousWord = "";
        this.spokenWord = "";
    }

    //Abilities

    //Getters

    public void speak(String spokenWord) {
        System.out.println(this.name+" says "+spokenWord);
        timesSpoken += 1;
        if(timesSpokenAWord == 0){
            timesSpokenAWord += 1;       
        }
        if(previousWord.equals(spokenWord)){
            timesSpokenAWord += 1;
        }

        previousWord = spokenWord;

        if(timesSpoken == 3){
            System.out.println("SQUAK.");
            timesSpoken = 0;
        } 
        if (timesSpokenAWord == 3){
            System.out.println("SQUAK.");
            System.out.println("SQUAK.");
            timesSpokenAWord = 0;
            previousWord = "";

        }

    }
    

    //Setters

    public void setName(String name) {
        this.name = name;
    }
}