package programe_44;

public class armstrong_num_14 {

    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int num = n;
        int count = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + (int) Math.pow(rem, count);
            num = num / 10;
            count++;
        }
        if (n == sum) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
