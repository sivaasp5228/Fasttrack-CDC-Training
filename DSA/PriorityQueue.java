import java.util.*;

class Patient {
    String name;
    int priority;
    
    Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class ERSystem { // Fixed: Renamed class to avoid conflict
    public static void main(String[] args) {
        // Fixed: Changed type parameter to <Patient> 
        // Fixed: Added .reversed() to build a Max-Heap for higher priorities first
        PriorityQueue<Patient> queue = new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.priority).reversed()
        );

        // Add patients to the heap
        queue.add(new Patient("Kumar", 3));
        queue.add(new Patient("Balaji", 1));
        queue.add(new Patient("David", 5));
        queue.add(new Patient("Priya", 2));

        // Process patients in order of highest priority (Max-Heap in action)
        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println("Treating the patient: " + patient);
        }
    }
}