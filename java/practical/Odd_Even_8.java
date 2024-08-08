import java.util.Scanner;

public class Odd_Even_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Randam Number :-");
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.print("Number " + number + " is ODD");
        } else {
            System.out.print("Number " + number + " is EVEN");
        }

    }
}
