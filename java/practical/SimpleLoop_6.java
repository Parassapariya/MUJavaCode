package practical;

import java.util.Scanner;

public class SimpleLoop_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Your Name :-");
        String name = scanner.next();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Your name is " + name);
        }
    }
}
