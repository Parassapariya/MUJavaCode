package programe_44.loop;

public class loop_17_c {
    public static void main(String[] args) {
        int n = 5;
        /*
         * 5
         * 4 5
         * 3 4 5
         * 2 3 4 5
         * 1 2 3 4 5
         *
        
        for (int i = 5; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }*/
        int rows = 5;

        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for numbers in each row
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
         
        
    }
}
