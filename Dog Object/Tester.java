public class Tester {
    public static void main(String[] args) {
        Dog rover = new Dog("Rover", "Type Doggo", 1, "Bork", "Hello"); 
        Dog clifford = new Dog("Clifford", "Type Doggo", 2, "Bork", "Hello"); 
        rover.pet();
        Cat cassy = new Cat("Cassy");

        Parrot paul = new Parrot("Paul");

        paul.speak("bacon");
        paul.speak("bacon");
        paul.speak("bacon");

        Pig pigu = new Pig("Pigu");       

        pigu.exercise(5);
        pigu.feed(5);
        pigu.exercise(5);
           
        Mouse manny = new Mouse("Manny");

        manny.meetDog(rover);
        manny.meetCat(cassy);





    }

}