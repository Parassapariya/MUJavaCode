package practical;

abstract class Animal {
    abstract public void Dog();

    abstract public void Cat();
}

class animals extends Animal {
    public void Dog() {
        System.out.println("Dog Implimenet");
    }

    public void Cat() {
        System.out.println("Cat Impliment");
    }
}


public class Abstrac_16 {
    public static void main(String[] args) {
        animals a = new animals();
        a.Dog();
        a.Cat();
    }
}
