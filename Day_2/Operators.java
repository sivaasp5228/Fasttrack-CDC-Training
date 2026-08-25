import java.util.Scanner;
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        //int a = 10;
        //int b = 3;
        //double result = (double) a / b;
        //System.out.print("The value of the result is: " + result);
        //System.out.println("\nThe value is: " + Math.floorDiv(a,b));
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name:");
        String name = sc.nextLine();
        System.out.print("Enter Student Roll Number:");
        int rollNumber = sc.nextInt();
        System.out.print("Enter Student Department:");
        String department = sc.next();
        System.out.print("Enter Student Year:");
        int year = sc.nextInt();

        System.out.print("Enter mark 1 :");
        double m1 = sc.nextDouble();
        System.out.print("Enter mark 2 :");
        double m2 = sc.nextDouble();
        System.out.print("Enter mark 3 :");
        double m3 = sc.nextDouble();
        System.out.print("Enter mark 4 :");
        double m4 = sc.nextDouble();
        System.out.print("Enter mark 5 :");
        double m5 = sc.nextDouble();

        double total = (m1 + m2 + m3 + m4 + m5);
        System.out.printf("The total marks are: %.2f", total);
    }
}