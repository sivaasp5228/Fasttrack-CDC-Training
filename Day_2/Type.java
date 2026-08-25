public class Type {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        // Narrowing Casting
        //float d = (int) a/b;
        // Widening Casting
        //double c = a / b;
        //System.out.println("The value of c is: " + c);
        //System.out.println("The value of d is: " + d);
        double result = (double) a / b;
        // format specifier
        System.out.printf("%.2f", result);
    }
}