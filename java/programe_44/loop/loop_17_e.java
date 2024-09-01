package programe_44.loop;

public class loop_17_e {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
