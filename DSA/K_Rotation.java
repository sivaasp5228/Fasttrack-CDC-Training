import java.util.*;

public class K_Rotation {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 1;

        k = k % arr.length;
        //Step 1 -> Reverse first K elements !
        reverse(arr,0,k-1); // 1 2 3 res 321

        //Step 2 -> Reverse remaining elements !
        reverse(arr,k,arr.length-1); // 4 5 res 5 4

        //Step 3 -> Reverse entire array !
        reverse(arr,0,arr.length-1); // 4 5 1 2 3

        //Step 4 -> Print
        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
}