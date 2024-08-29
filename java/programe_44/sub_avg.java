package programe_44;

import java.util.Scanner;

public class sub_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[10];
        for (int i = 1; i <= 10; i++) {
            System.out.print("Please Enter Number " + i + " :-");
            p[i-1] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + p[i];
        }
        int avg =  sum / 10;
        System.out.println("Sum Is :- " + sum );
        System.out.println("Avrage Is :- " + avg);
    }
}
