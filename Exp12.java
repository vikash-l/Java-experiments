
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // List
        List<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Bala");
        students.add("Arun");

        System.out.println("Student List: " + students);

        // Set
        Set<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Java");

        System.out.println("Course Set: " + courses);

        // Map
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Arun");
        map.put(102, "Bala");
        map.put(103, "Ravi");

        System.out.println("Student Map:");

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        // Queue
        Queue<String> queue = new LinkedList<>();

        queue.offer("Arun");
        queue.offer("Bala");
        queue.offer("Ravi");

        System.out.println("Queue Before: " + queue);

        String processed = queue.poll();

        System.out.println("Processed Student: " + processed);

        System.out.println("Queue After: " + queue);
    }
}
