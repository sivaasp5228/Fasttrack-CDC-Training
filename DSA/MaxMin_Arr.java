import java.util.Scanner;
public class MaxMin_Arr {
    public static void main(String[] args) {
        //int[] arr = {12, 45, 77, 14, 66};
        //int max = arr[0];
        //int min = arr[0];
        //for( int i = 1; i < arr.length; i++) {
        //    if( max < arr[i] ) {
        //        max = arr[i];
        //    }
        //    if (min > arr[i]){
        //        min = arr[i];
        //    }
        //}
        //System.out.println("Max in Array : " + max);
        //System.out.println("Min in Array : " + min);
        //Dynamic Approach
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
            System.out.print("Enter the value for index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for( int i = 1; i < arr.length; i++) {
            if ( arr[i] > max ) {
                max = arr[i];
            }
            if ( arr[i] < min ) {
                min = arr[i];
            }
        }
        System.out.println("Max in Array : " + max);
        System.out.println("Min in Array : " + min);
        sc.close();
    }

}