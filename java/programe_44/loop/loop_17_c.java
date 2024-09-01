package programe_44.loop;

public class loop_17_c {
    public static void main(String[] args) {
        int n = 5;
        /*
         * 5
         * 5 4
         * 5 4 3
         * 5 4 3 2
         * 5 4 3 2 1
         */
        
        for (int i = 5; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
