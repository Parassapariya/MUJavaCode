package programe_44.loop;

public class loop_17_d {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            int j = 1;

            while (j <= i) {
                System.out.print(j);
                j++;
            }

            j = j + 1;
            System.out.println();
        }
    }
}
