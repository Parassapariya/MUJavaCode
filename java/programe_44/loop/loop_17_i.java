package programe_44.loop;

public class loop_17_i {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
