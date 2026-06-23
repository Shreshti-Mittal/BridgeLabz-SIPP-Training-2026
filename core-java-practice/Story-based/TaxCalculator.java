import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();

            double tax;

            if (incomes[i] < 10000) {
                tax = incomes[i] * 0.05;
                System.out.println("Bracket: 5%");
            } else if (incomes[i] <= 50000) {
                tax = incomes[i] * 0.15;
                System.out.println("Bracket: 15%");
            } else {
                tax = incomes[i] * 0.30;
                System.out.println("Bracket: 30%");
            }

            System.out.println("Tax = " + tax);
            totalTax += tax;
        }

        System.out.println("\nTotal Tax Collected = " + totalTax);
    }
}