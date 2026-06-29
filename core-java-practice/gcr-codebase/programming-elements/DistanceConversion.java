import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInFeet / 5280;
        
        System.out.println("Your distance in feet is " + distanceInFeet + " while in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
        
        scanner.close();
    }
}
