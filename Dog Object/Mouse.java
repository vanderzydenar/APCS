public class Mouse {

    //Properties
    String name;
    int fear = 5;
    int runningSpeed = fear * 3;

    public Mouse(String name) {
        this.name = name;
        this.fear = fear;
    }

    public void meetDog(Dog dog){
        System.out.println(this.name+" met "+dog.getName()+" the dog!");
        if(dog.getHappiness() > 0){
            this.fear -= 5;
            System.out.println("The dog is happy! His fear decreases by 5");
        }
        if(dog.getHappiness() < 0){
            this.fear += 5; 
            System.out.println("The dog is unhappy! His fear increases by 5");
        }
    }

    public void meetCat(Cat cat){
        System.out.println(this.name+" met "+cat.getName()+" the cat!");
        this.fear += 5; 
        System.out.println(this.name+"'s fear increases by 5!");
    }

    public int getRunningSpeed() {
        return this.runningSpeed;
    }

    


    //Setters

    public void setName(String name) {
        this.name = name;
    }
}