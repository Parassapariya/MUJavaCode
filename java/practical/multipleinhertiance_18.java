package practical;

interface carname {
    public void getname();
}

interface price {
    public void getprice();
}

class Car implements carname, price {
    public void getname() {
        System.out.println("My car is Porse911");
    }

    public void getprice() {
        System.out.println("My car price is 2CR");
    }
}

public class multipleinhertiance_18 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.getname();
        obj.getprice();
    }
}



