package programe_44.loop;

public class loop_h_8 {
    public static void main(String[] args) {
        float n = 10;
        float sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + i/i+1;
        }
        System.out.println("Sum of 1/2 + 2/3 + 3/4 ... 9/10 natural numbers is " + sum);
    }
}

