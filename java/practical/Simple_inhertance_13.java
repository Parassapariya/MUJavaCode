package practical;

class mca {
    void subject(){
        System.out.println("5 subjects in mca semester 1");
    }
}
class cource extends mca {
    void sub_name(){
        System.out.println("Java, Os, Ds, Php, Rdbms");
    }
}
class Simple_inhertance_13 {
    public static void main(String[] args) {
        cource objDog = new cource();
        objDog.subject();
        objDog.sub_name();
    }
}

