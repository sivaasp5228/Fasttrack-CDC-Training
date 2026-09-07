import java.util.*;
public class Reverse_Arr {
    public static void main(String[] args) {
        int[] arr = {66,45,65,77,45,12};
        int left = 0;
        int right = arr.length - 1;
        int temp;
        while( left < right ) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int num:arr) {
            System.out.print(num + " , ");
        }
    }
}