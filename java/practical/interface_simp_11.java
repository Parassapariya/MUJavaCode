package practical;

interface Animal {
    public void Dog();

    public void Cat();
}

class animals implements Animal {
    public void Dog() {
        System.out.println("Dog Implimenet");
    }

    public void Cat() {
        System.out.println("Cat Impliment");
    }
}

public class interface_simp_11 {
    public static void main(String[] args) {
        animals a = new animals();
        a.Dog();
        a.Cat();
    }
}
