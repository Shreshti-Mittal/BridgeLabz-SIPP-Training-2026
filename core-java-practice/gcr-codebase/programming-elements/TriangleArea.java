import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        
        double area = 0.5 * base * height;
        double areaInSquareInches = area;
        double areaInSquareCentimeters = area * 6.4516;
        
        System.out.println("The area of triangle with base " + base + " and height " + height + " is " + areaInSquareInches + " square inches and " + areaInSquareCentimeters + " square centimeters");
        
        scanner.close();
    }
}
