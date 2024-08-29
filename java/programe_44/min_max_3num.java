package programe_44;

import java.util.Scanner;

public class min_max_3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter A Value :- ");
        int a = sc.nextInt();
        System.out.print("Please Enter B Value :- ");
        int b = sc.nextInt();
        System.out.print("Please Enter C Value :- ");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("max is " + a);
        } else if (b >= c && b >= a) {
            System.out.println("max is " + b);
        } else {
            System.out.println("max is" + c);
        }

    }
}
