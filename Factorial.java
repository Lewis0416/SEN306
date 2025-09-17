//NAME : ADEBAYO SAMUEL OLUWATOYIN
//MATRIC_NO : IFT/22/9181

import java.util.Scanner;

public class Factorial {
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Iterative: " + factorialIterative(num));
            System.out.println("Recursive: " + factorialRecursive(num));
        }
        scanner.close();
    }
}
