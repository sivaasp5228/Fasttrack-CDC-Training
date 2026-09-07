import java.util.Scanner;

public class Sep5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println(table + " x " + i + " = " + (table*i));
        }
        sc.close();
    }
}