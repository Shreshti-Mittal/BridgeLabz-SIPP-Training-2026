import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        long maxHandshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;
        
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        
        scanner.close();
    }
}
