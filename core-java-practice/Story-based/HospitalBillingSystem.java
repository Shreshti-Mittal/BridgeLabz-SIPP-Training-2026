class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void makePayment(double balance, double billAmount)
            throws InsufficientFundsException {

        if (balance < billAmount) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient Funds.");
        }

        System.out.println("Payment Successful.");
    }

    public static void main(String[] args) {

        // Division by Zero
        try {
            int totalBill = 1000;
            int items = 0;

            int costPerItem = totalBill / items;

            System.out.println(costPerItem);

        } catch (ArithmeticException e) {
            System.out.println(
                    "Error: Cannot divide by zero. Number of items cannot be zero.");
        }

        // Array Out of Bounds
        try {
            String[] patients = {"Rahul", "Priya", "Aman"};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Error: Invalid patient index entered.");
        }

        // Number Format Exception
        try {
            String input = "ABC";

            int amount = Integer.parseInt(input);

            System.out.println(amount);

        } catch (NumberFormatException e) {
            System.out.println(
                    "Error: Please enter a valid numeric value.");
        }

        // Custom Exception
        try {
            makePayment(5000, 8000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}