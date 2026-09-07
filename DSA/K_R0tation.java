// time / space complexity = O(n) / O(n)
public class K_R0tation {
    public static void main(String[] args) {
        int[] arr = {12,45,77,14,66};
        int k = 1;
        int n = arr.length;        
        int[] temp = new int[n];
        //Store elements from k to end
        int index = 0;
        for( int i = k; i < n; i++) {
            temp[index] = arr[i];
            index++;
        }
        //Store first k elements
        for (int i = 0; i < k; i++) {
            temp[index] = arr[i];
            index++;
        }
        // copy temp array back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        // parray rotation display
        for (int num:arr) {
            System.out.print(num + " ");
        }

    }
}