package practical;

// Superclass
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

// Another Subclass
class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("The cat meows");
    }
}

public class overriding_19 {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the overridden methods
        myDog.sound(); // Output: The dog barks
        myCat.sound(); // Output: The cat meows
    }
}


