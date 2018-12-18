public class Pig {

    //Properties
    String name;
    double weight;
    double previousWeightGained;
    int exerciseSession;

    public Pig(String name) {
        this.name = name;
        this.weight = 0.0;
        this.previousWeightGained = 0.0;
        this.exerciseSession = 0;
    }

    //Abilities

    //Getters

    public void feed(double poundsOfFood) {
        this.weight += (poundsOfFood * 0.75);
        this.previousWeightGained = this.weight;
        this.exerciseSession = 0;
    }

    public double getWeight(String name) {
        return this.weight;
    }

    public void exercise(double hoursOfExercise) {
        this.weight -= hoursOfExercise / 3.0;
        this.exerciseSession += 1;
        if(exerciseSession < 1){
            this.weight -= previousWeightGained;
        }
        this.previousWeightGained = 0;
    }    

    public void blueRibbon(){
        if(this.weight > 1000){
            System.out.println("Your pig is eligible to win a blue ribbon!");
        }
        else{
            System.out.println("Sorry, your pig is not eligible for a blue ribbon.");
        }
    }


    //Setters

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(String name) {
        this.name = name;
    }
}