public class simpl {
    public static void main(String[] args) {
        //fibonacci 1 to 10
        int n = 10;
        int a = 0, b = 1;
        System.out.print( a+ " "+ b + " ");

        
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        
        
    }
}
