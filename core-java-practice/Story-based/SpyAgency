import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class SpyAgency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Secret Message
        System.out.print("Enter secret message: ");
        String message = sc.nextLine().toLowerCase();

        // Reverse Message
        String reverse = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reverse += message.charAt(i);
        }

        System.out.println("\nReversed Message: " + reverse);

        // Palindrome Check
        if (message.equals(reverse)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        // Count Vowels and Consonants
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < message.length(); i++) {

            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Anagram Check
        System.out.print("\nEnter first intercept: ");
        String s1 = sc.next().toLowerCase();

        System.out.print("Enter second intercept: ");
        String s2 = sc.next().toLowerCase();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram: Yes");
        } else {
            System.out.println("Anagram: No");
        }

        // First Non-Repeating Character
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : message.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char firstNonRepeat = '#';

        for (char ch : message.toCharArray()) {
            if (map.get(ch) == 1) {
                firstNonRepeat = ch;
                break;
            }
        }

        if (firstNonRepeat != '#') {
            System.out.println("First Non-Repeating Character: " + firstNonRepeat);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }
}