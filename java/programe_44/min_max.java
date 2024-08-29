package programe_44;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int min = arr[0];
        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] < min) {
        // min = arr[i];
        // }
        // if (arr[i] > max) {
        // max = arr[i];

        // }
        // }
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter A Value :- ");
        int a = sc.nextInt();
        System.out.print("Please Enter B Value :- ");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println("max is " + b);
        } else {
            System.out.println("max is" + a);
        }

    }

}
