import java.util.Scanner;
import java.util.*;
public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter No 2 : ");
        int b = sc.nextInt();
        System.out.println("A + B = " + (a+b) );
        sc.close();
    }
}