package programe_44;

import java.util.*;

public class num_arithmatic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter 1 Value :-");
        int a = sc.nextInt();
        System.out.print("Please Enter 2 Value :-");
        int b = sc.nextInt();

        System.out.println("Addition Is " + (a + b));

        System.out.println("Subtraction Is " + (a - b));

        System.out.println("Multiplication Is " + (a * b));

        System.out.println("Division Is " + (a / b));

        System.out.println("Moduls Is " + (a % b));

    }
}
