package programe_44;

import java.util.Arrays;
import java.util.Scanner;

public class sort_num_asc {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input 10 numbers from the user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the numbers in ascending order
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("Numbers in ascending order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

 