package programe_44;
import java.util.*;


public class num_sum_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int digit  = number % 10;
            sum += digit;
            number = number /  10;
        }
        System.out.println(sum);
    }
}
