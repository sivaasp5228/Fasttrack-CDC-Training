import java.util.*;

public class minHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(50);
        minHeap.add(20);
        minHeap.add(80);
        minHeap.add(50);
        minHeap.add(30);

        System.out.println("Min Heap : " + minHeap);
        System.out.println("Min Element : " + minHeap.peek());
        System.out.println("Remover : " + minHeap.poll());
        System.out.println("After Removal : " + minHeap);
        System.out.println("Min Element : " + minHeap.peek());
    }
}