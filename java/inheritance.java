/**
 * Animal
 */
class Animal {
    void eat(){
        System.out.println("Eating");
    }
    
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog");
    }
}

class Puppy extends Dog {
    void p(){
        System.out.println("Puppy");
    }
    
}

public class inheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.bark();
        puppy.eat();
        puppy.p();
    }
}
