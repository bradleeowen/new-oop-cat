package Polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

        // Method overloading demo
        MathOperations math = new MathOperations();
        System.out.println("2 * 3 = " + math.multiply(2, 3));
        System.out.println("2 * 3 * 4 = " + math.multiply(2, 3, 4));
    }
}
