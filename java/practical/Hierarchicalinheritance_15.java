package practical;

class fistclass {
    public void superclass() {
        System.out.println("This is superclass");
    }
}

class secondclass extends fistclass {
    public void subclass() {
        System.out.println("This is subclass");
    }
}

class thiredclass extends fistclass {
    public void subclass() {
        System.out.println("This is subclass");
    }
}

public class Hierarchicalinheritance_15 {
    public static void main(String[] args) {
        secondclass obj2 = new secondclass();
        thiredclass obj3 = new thiredclass();
        obj2.superclass();
        obj2.subclass();
        obj3.superclass();
        obj3.subclass();


    }

}
