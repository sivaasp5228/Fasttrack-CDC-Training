import java.util.*;
public class Datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Enter CGPA : ");
        double cgpa = sc.nextDouble();
        System.out.println("Enter Grade : ");
        char grade = sc.next().charAt(0);
        System.out.println("Hello, " + name + "!");
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade   : " + grade);

        sc.close();
    }
}