public class palingdrom {
    public static void main(String[] args) {

        int i, j, rows = 4, count = 0;
        for (i = 0; i < 2 * rows; i = i + 2) {
            
            for (j = 0; j <= i; j++) {
                // ("%c", 'A'+count);
                    System.out.print(1 + count);
                if (j < i / 2)
                    count++;
                else
                    count--;
            }
            count = 0;

            System.out.print("\n");
        }

    }
}
