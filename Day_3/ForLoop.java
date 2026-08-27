public class ForLoop {
    public static void main(String[] args) {
        //for(int i = 2; i <= 20; i+=2) {
        //    System.out.println(i);
        //}
        //for (int i = 1; i <= 20; i++) {
        //    if (i % 2 == 0) {
        //        System.out.println(i);
        //   }
        //}
        //int n = 5;
        //for (int i = 1; i <= 25; i++) {
        //    System.out.println(n +" x "+ i +" = "+ (n * i));
        //}
        //int sum = 0;
        //int odd = 0;
        //int even = 0;
        //int prime = 0;
        //for (int i = 1; i <= 10; i++) {
        //    if (i % 2 == 0) {
        //        even += i;
        //    } else {
        //        odd += i;
        //    }
        //    if (i > 1) {
        //        boolean isPrime = true;
        //        for (int j = 2; j < i; j++) {
        //            if (i % j == 0) {
        //                isPrime = false;
        //                break;
        //            }
        //        }
        //        if (isPrime) {
        //            prime += i;
        //        }
        //    }
        //    sum += i;
        //}
        //System.out.println("Sum = " + sum);
        //System.out.println("Even = " + even);
        //System.out.println("Odd = " + odd);
        //System.out.println("Prime = " + prime);

        int number = 6;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }
}