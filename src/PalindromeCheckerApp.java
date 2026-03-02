import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        //UC1
        System.out.println("Welcome to the Palindrome Checker Management System.");
        System.out.println("Version:1.0");
        System.out.println("System Initialized Successfully");

        //UC2
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        boolean isPalindrome = true;

        // Check characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }*/

        //UC3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert to lowercase (optional for case-insensitive check)
        input = input.toLowerCase();

        String reversed = "";

        // Reverse string using given for loop
        for(int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if(input.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }

}
