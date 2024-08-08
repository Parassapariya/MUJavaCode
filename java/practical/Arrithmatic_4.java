import java.util.Scanner;

public class Arrithmatic_4 {
    public static void main(String[] args) {
        System.out.println("1 :- Addition");
        System.out.println("2 :- Subtraction");
        System.out.println("3 :- Multiplication");
        System.out.println("4 :- Division");
        System.out.println("5 :- Moduals");

        Scanner sc = new Scanner(System.in);
        System.out.print("Which Type Of Opration You Can Perforn Please Select = ");
        int n = sc.nextInt();
        System.out.print("Please Enter 1 Value :-");
        int a = sc.nextInt();
        System.out.print("Please Enter 2 Value :-");
        int b = sc.nextInt();

        if (n == 1) {
            System.out.println("Addition Is " + (a + b));
        } else if (n == 2) {
            System.out.println("Subtraction Is " + (a - b));
        } else if (n == 3) {
            System.out.println("Multiplication Is " + (a * b));
        } else if (n == 4) {
            System.out.println("Division Is " + (a / b));
        } else {
            System.out.println("Moduls Is " + (a % b));
        }

    }
}
