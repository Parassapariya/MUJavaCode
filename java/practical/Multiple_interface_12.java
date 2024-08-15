package practical;

interface name {
    public void getname();
}

interface sarname {
    public void getsarname();
}

class fullname implements name, sarname {
    public void getname() {
        System.out.println("My name is Paras");
    }

    public void getsarname() {
        System.out.println("My Sarname is Sapariya");
    }
}

public class Multiple_interface_12 {
    public static void main(String[] args) {
        fullname obj = new fullname();
        obj.getname();
        obj.getsarname();
    }
}
