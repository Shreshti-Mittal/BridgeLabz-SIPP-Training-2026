import java.util.Scanner;

public class RecursiveProblems {

    static int moveCount = 0;

    // Tower of Hanoi
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    // Recursive Binary Search
    public static int binarySearch(int[] arr, int low, int high, int target) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, low, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, high, target);
    }

    // Sum of Digits
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    // Reverse String
    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Balanced Parentheses without Stack
    public static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    private static boolean checkBalance(String str, int index, int count) {

        if (count < 0) {
            return false;
        }

        if (index == str.length()) {
            return count == 0;
        }

        if (str.charAt(index) == '(') {
            return checkBalance(str, index + 1, count + 1);
        }

        if (str.charAt(index) == ')') {
            return checkBalance(str, index + 1, count - 1);
        }

        return checkBalance(str, index + 1, count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tower of Hanoi
        System.out.print("Enter number of disks: ");
        int disks = sc.nextInt();

        System.out.println("\nTower of Hanoi Moves:");
        towerOfHanoi(disks, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moveCount);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500, 600, 700};

        System.out.print("\nEnter price to search: ");
        int target = sc.nextInt();

        int result = binarySearch(prices, 0, prices.length - 1, target);

        if (result != -1) {
            System.out.println("Price found at index " + result);
        } else {
            System.out.println("Price not found");
        }

        // Sum of Digits
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        System.out.println("Sum of Digits = " + sumOfDigits(num));

        sc.nextLine();

        // Reverse String
        System.out.print("\nEnter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed String = " + reverseString(str));

        // Balanced Parentheses
        System.out.print("\nEnter parentheses string: ");
        String parentheses = sc.nextLine();

        if (isBalanced(parentheses)) {
            System.out.println("Balanced Parentheses");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}