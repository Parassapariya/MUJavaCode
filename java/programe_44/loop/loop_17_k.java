package programe_44.loop;

public class loop_17_k {
    public static void main(String[] args) {
        /*
         * 1
         * 2 1 2
         * 3 2 1 2 3
         * 4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         */
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println();
        }

    }
}
