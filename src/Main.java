public class Main {
    public static void main(String[] args) {
        // Here we created a new Instance of the Dog Class and named it animal
        Dog animal = new Dog();

        // The animal is able to Bark since its a Dog class
        animal.bark();

        // It's able to move as well since it inherits the Animal class
        animal.move();
    }
}
