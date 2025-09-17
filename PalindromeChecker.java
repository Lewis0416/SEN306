//NAME : ADEBAYO SAMUEL
//MATRIC_NO: IFT/22/9181

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}
