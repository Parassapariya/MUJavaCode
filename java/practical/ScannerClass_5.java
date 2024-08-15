package practical;
import java.util.Scanner;

public class ScannerClass_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Your Name :-");
        String name = scanner.next();
        System.out.print("Dob Year :-");
        int year = scanner.nextInt();
        int age = 2024 - year;
        System.out.println("Hello " + name + " your age is " + age);
    }
}
