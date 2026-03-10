import java.util.Scanner;
import java.util.*;
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
        /*Scanner scanner = new Scanner(System.in);

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

        scanner.close();*/
        //UC4


                /*Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string to check: ");
                String input = scanner.nextLine();

                // Convert string to char array
                char[] chars = input.toCharArray();

                // Initialize pointers
                int start = 0;
                int end = chars.length - 1;

                boolean isPalindrome = true;

                // Two-pointer comparison
                while (start < end) {
                    if (chars[start] != chars[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                System.out.println("Is palindrome? " + isPalindrome);

                scanner.close();

        */
        //UC5
            /*Scanner scanner=new Scanner(System.in);

            System.out.print("Enter a string to check:");
            String input=scanner.nextLine();

            Stack<Character>stack=new Stack<>();

            for(char c:input.toCharArray()){
                stack.push(c);
            }
            StringBuilder reversed=new StringBuilder();
            while(!stack.isEmpty()){
                reversed.append(stack.pop());
            }

            boolean palindrome=input.equals(reversed.toString());

            System.out.println("Is Palindrome:"+palindrome);

            scanner.close();
            */

        //UC6
            /*Scanner scanner=new Scanner(System.in);

            System.out.print("Enter a string:");
            String input=scanner.nextLine();

            Queue<Character>queue=new LinkedList<>();
            Stack<Character> stack = new Stack<>();

        // Enqueue and push characters
            for (char c : input.toCharArray()) {
                queue.add(c);
                stack.push(c);
            }

            boolean isPalindrome = true;

            // Compare characters dequeued vs popped
            while (!queue.isEmpty() && !stack.isEmpty()) {
                if (!queue.remove().equals(stack.pop())) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Is palindrome? " + isPalindrome);
            scanner.close();
            */

        //UC7
        /*Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize deque
        Deque<Character> deque = new LinkedList<>();

        // Insert all characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);  // add to rear
        }

        boolean isPalindrome = true;

        // Compare front and rear characters until deque is empty or mismatch found
        while (deque.size() > 1) {
            char front = deque.removeFirst();  // remove from front
            char rear = deque.removeLast();    // remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is palindrome? " + isPalindrome);
        scanner.close();
        */

        //UC8
        /*Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the string:");
        String str=scanner.nextLine();
        boolean isPalindrome = true;
        LinkedList<Character> charlist = new LinkedList<>();
        for (char c : str.toCharArray()) {
            charlist.add(c);
        }
        while (charlist.size() > 1) {
            char first = charlist.removeFirst();
            char last  = charlist.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is it a palindrome?: True");
       } else {
            System.out.println("Is it a palindrome?: False");
       }*/

       //UC9
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }

        LinkedList<Character> ll = new LinkedList<>();
        for(char c: inputString.toCharArray()){
            ll.add(c);
        }

        boolean isPalindrome = isPalindromeCheck(ll);
        System.out.println("IS it a Palindrome: " + isPalindrome);

    }
    public static boolean isPalindromeCheck(LinkedList<Character> ll ){

        if(ll.size() <=1){
            return true;

        }
        char front = ll.removeFirst();
        char back = ll.removeLast();
        if(front==back){
            return isPalindromeCheck(ll);

        }
        return false;
        */

        //UC10
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);
        String normalizedString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(normalizedString == null || normalizedString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }

        LinkedList<Character> ll = new LinkedList<>();
        for(char c: normalizedString.toCharArray()){
            ll.addLast(c);
        }

        boolean isPalindrome = true;
        while(ll.size()>1){
            char front = ll.removeFirst();
            char back = ll.removeLast();
            if(front != back){
                isPalindrome = false;
            }
        }

        System.out.println("Is it a palindrome: " + isPalindrome);



    }
    public static boolean isPalindromeCheck(LinkedList<Character> ll ){

        if(ll.size() <=1){
            return true;

        }
        char front = ll.removeFirst();
        char back = ll.removeLast();
        if(front==back){
            return isPalindromeCheck(ll);

        }
        return false;

         */

        //UC11
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }
        PalindromeService str = new PalindromeService();
        System.out.println("is it Palindrome: "+str.checkPalindrome(inputString));





    }

    public static class PalindromeService{


        public boolean checkPalindrome(String inputString) {
            char[] chars = inputString.toCharArray();
            int start = 0;
            int end = chars.length - 1;


            while (start < end) {
                if (inputString.charAt(start) != inputString.charAt(end)) {
                    return false;

                }
                start++;
                end--;

            }
            return true;

        }    //System.out.println("Is it a palindrome: " + isPalindrome);
    }

}
