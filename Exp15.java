
import java.io.*;

class Student implements Serializable {
    int rollNo;
    String name;
    double cgpa;

    Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {

        try {
            Student s = new Student(101, "Arun", 9.5);

            // Serialization
            FileOutputStream fos =
                    new FileOutputStream("student.ser");

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(s);
            oos.close();

            System.out.println("Serialization successful");

            // Deserialization
            FileInputStream fis =
                    new FileInputStream("student.ser");

            ObjectInputStream ois =
                    new ObjectInputStream(fis);

            Student s1 = (Student) ois.readObject();
            ois.close();

            System.out.println("Deserialization successful");

            // Display details
            s1.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
