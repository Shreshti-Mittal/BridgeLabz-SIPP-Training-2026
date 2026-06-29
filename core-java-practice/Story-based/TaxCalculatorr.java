//A kingdom's tax system charges 5% for income <10K, 15% for 10K–
//50K, 30% above 50K. Read a citizen's income, print tax bracket and
//amount. Extend: loop over an array of 10 citizens and tally total tax
//collected.

import java.util.Scanner;

public class TaxCalculatorr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        double tax;

        if (income < 10000) {
            tax = income * 0.05;
            System.out.println("Tax Bracket: 5%");
        } else if (income <= 50000) {
            tax = income * 0.15;
            System.out.println("Tax Bracket: 15%");
        } else {
            tax = income * 0.30;
            System.out.println("Tax Bracket: 30%");
        }

        System.out.println("Tax Amount: " + tax);
    }
}