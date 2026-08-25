import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        //String username = "sivaaq";
        //String password = "1234";
        //if (  username.equals("sivaa") && password.equals("1234")  ) {
        //    System.out.println("Login Successful");
        //} 
        //else {
        //    System.out.println("Invalid Login !");
        //}
        int mark = 64;
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid Mark");
        } 
        else if (mark >= 90 && mark <= 100) {
            System.out.println("A+");
        } 
        else if (mark >= 80 && mark < 90) {
            System.out.println("A");
        } 
        else if (mark >= 70 && mark < 80) {
            System.out.println("B+");
        } 
        else if (mark >= 60 && mark < 70) {
            System.out.println("B");
        }
        else if (mark >= 50 && mark < 60) {
            System.out.println("C");
        } 
        else if (mark >= 40 && mark < 50) {
            System.out.println("D");
        } 
        else {  
            System.out.println("Fail");
        }
    }
}