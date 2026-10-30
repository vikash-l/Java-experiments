
import java.io.*;

public class Main {
    public static void main(String[] args) {

        String file = "student.txt";

        try {
            // Writing data
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll No: 101");
            bw.newLine();
            bw.write("Name: Arun");
            bw.newLine();
            bw.write("Marks: 90");

            bw.close();

            System.out.println("Data written successfully");

            // Reading data
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Student Details:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error: " + e);
        }
    }
}
