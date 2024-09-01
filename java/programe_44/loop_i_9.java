package programe_44;

public class loop_i_9 {
    public static void main(String[] args) {
        float n = 10;
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            
            sum = sum + i/n*i;
        }
        System.out.println("Sum of 1/10 + 2/20 + 3/30 ... 10/100 natural numbers is " + sum);
    } 
}
