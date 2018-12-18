public class Cat {

    //Properties
    String name;
    double happiness;
    int timesScolded;

    public Cat(String name) {
        this.name = name;
        this.timesScolded = 0;
        this.happiness = 0.0;
    }

    //Abilities

    //Getters

    public void petCat() {
        System.out.println("Your cat is qutie displeased with your actions. Be careful, or you may lose your life next time.");
        happiness -= .50;
    }
    public void feedCat() {
        if(timesScolded > 3){
            System.out.println("You have appeased your cat......FOR NOW.");
            happiness += .05;
        } else {
            System.out.println("Your cat doesn't give a crap about anything, especially you. He does not incresae in his joy whatsoever.");
        }
    }
    public void scold() {
        happiness -= 0.20;
        timesScolded += 1;
        System.out.println("You SCOLDED a doggo! His happiness is now "+happiness+".....you monster.");
    }

    public String getName(){
        return this.name;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }
}