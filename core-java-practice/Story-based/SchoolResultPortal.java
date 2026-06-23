import java.io.*;
import java.util.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try {

            Scanner fileReader = new Scanner(new File(inputFile));

            FileWriter writer = new FileWriter(outputFile, true);

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();

                String[] data = line.split(" ");

                String name = data[0];

                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double average = (m1 + m2 + m3) / 3.0;

                writer.write("Student: " + name + "\n");
                writer.write("Marks: " + m1 + ", "
                        + m2 + ", " + m3 + "\n");
                writer.write("Average: "
                        + String.format("%.2f", average) + "\n");
                writer.write("----------------------\n");
            }

            fileReader.close();
            writer.close();

            System.out.println("Report Card Generated Successfully!");

        } catch (FileNotFoundException e) {
            System.out.println(
                    "Error: Student file not found.");
        } catch (IOException e) {
            System.out.println(
                    "Error while writing file.");
        }
    }
}