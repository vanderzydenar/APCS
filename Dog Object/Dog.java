public class Dog {

    //Properties
    String name;
    String breed;
    int tagNumber;
    String bark;
    String sayHi;
    String petDog;
    double happiness;

    //Constructor(s)
    public Dog(String name, String breed, int tagNumber, String bark, String sayHi) {
        this.name = name;
        this.breed = breed;
        this.tagNumber = tagNumber;
        this.bark = bark;
        this.sayHi = sayHi;
        this.petDog = petDog;
        this.happiness = 0.0;
    }

    //Abilities

    //Getters

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }

    public String getBark() {
        return this.bark;
    }

    public String getSayHi() {
        return this.sayHi;
    }

    public double getHappiness() {
        return this.happiness;
    }

    public void pet() {
        happiness += 0.10;
        System.out.println("Yay! You petted a doggo! His happiness is now "+happiness);
    }

    public void scold() {
        happiness -= 0.20;
        System.out.println("You SCOLDED a doggo! His happiness is now "+happiness+".....you monster.");
    }

    public void feedDog() {
        if(happiness < .25){
            System.out.println("Your dog is too depressed to eat you monster. LOVE HIM!!!!!!!!!!!!!!!");
            happiness += 500;
        }
        if(happiness > .25){
            System.out.println("Your dog is sufficently happy to eat his foods. Good job!");
        }
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setTagNumber(int tagNumber) {
        this.tagNumber = tagNumber;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
    
    public void setSayHi(String sayHi) {
        this.sayHi = sayHi;
    }
}