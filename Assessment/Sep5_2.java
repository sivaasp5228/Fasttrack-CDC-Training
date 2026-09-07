import java.util.Scanner;
public class Sep5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact = 1;
        if ( N <= 0 ) {
            System.out.println("Invalid");
        }
        else {
            for (int i = 1; i <= N; i++) {
                fact *= i;
            }
            System.out.println(N + ": " + fact);
        }
        sc.close();
    }
}