import java.util.*;
import java.util.Scanner;

//“AquaticaCarnival” is the most successful event dedicated to children and families. The Even thas more than 20 rides for children and adults and the organizers always ensure not tocompromise on the safety of the visitors.To ensure the safety of the rides,the organizers have graded the rides in the fair according to the following conditions:
// Hurl Factor must be >50.
// Spin Factor must be >60.
// Speed factor must be >100.
// The grades are as follows:
// Grade is 10 if all 3 conditions are met.
// Grade is 9 if conditions(i)&(ii) are met
// Grade is 8 if conditions(ii)&(iii) are met.
// Grade is 7 if conditions(i)and(iii) are met.
// Grade is 6 if only one condition is met.
// Grade is 5 if none of three conditions are met.
// Write a program display the grade of the rides, given the values of hurl factor, spin factor & speed factor of the ride. 
//I/P Format:Input consists 3 integers Hurl,Spin &SpeedFactor of the ride,separated by a space.
//O/P Format: Output should display the grade of the ride depending on Conditions.
//Sample Input: 
//51 89 150
//Sample Output:
//10

class AquaticaCarnival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hurl, Spin and Speed Factor of the ride:");
        int hurl = sc.nextInt();
        int spin = sc.nextInt();
        int speed = sc.nextInt();
        int grade = 0;
        if (hurl > 50 && spin > 60 && speed > 100) {
            grade = 10;
        } else if (hurl > 50 && spin > 60) {
            grade = 9;
        } else if (spin > 60 && speed > 100) {
            grade = 8;
        } else if (hurl > 50 && speed > 100) {
            grade = 7;
        } else if (hurl > 50 || spin > 60 || speed > 100) {
            grade = 6;
        } else {
            grade = 5;
        }
        System.out.println(grade);
    }
}