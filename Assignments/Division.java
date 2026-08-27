import java.util.Scanner;
import java.util.*;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is divisible by 3 and 5:");
        int number = scan.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }
         
        // First 10 numbers divisible by 3 and 5
        System.out.println("First 10 numbers divisible by 3 and 5:");
        int count = 0;
        for (int i = 1; count < 10; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        // First 5 Even numbers
        System.out.println("\nFirst 5 Even numbers:");
        int even = 1;
        for ( int i = 1; even <= 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    even++;
                }
            }
        }

        // First 5 Odd numbers
        System.out.println("\nFirst 5 Odd numbers:");
        int odd = 1;
        for (int i = 1; odd <= 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    odd++;
                }
            }
        }

        scan.close();
    }
}