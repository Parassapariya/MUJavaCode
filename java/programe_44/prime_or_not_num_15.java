package programe_44;

public class prime_or_not_num_15 {
    public static void main(String[] args) {
        int num = 23;
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
