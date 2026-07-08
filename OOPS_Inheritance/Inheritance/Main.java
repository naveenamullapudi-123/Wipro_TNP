public class Main {

    public static void main(String[] args) {

        // Create Animal object
        Animal animal = new Animal();

        System.out.println("Animal Class Methods:");
        animal.eat();
        animal.sleep();

        System.out.println();

        // Create Bird object
        Bird bird = new Bird();

        System.out.println("Bird Class Methods:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}