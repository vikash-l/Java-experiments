
import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    public String toString() {
        return rollNo + " " + name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(103, "Ravi"));
        list.add(new Student(101, "Arun"));
        list.add(new Student(102, "Bala"));

        System.out.println("Before Sorting:");
        System.out.println(list);

        // Sort by roll number
        Collections.sort(list);

        System.out.println("Sorted by Roll Number:");
        System.out.println(list);

        // Sort by name
        Collections.sort(list, new NameComparator());

        System.out.println("Sorted by Name:");
        System.out.println(list);
    }
}
