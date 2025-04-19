import java.util.Scanner;

/**
 * Lab 6 - Factorial Calculation Methods Comparison
 * This program implements two methods for calculating factorial:
 * 1. Iterative method
 * 2. Recursive method
 * It also measures and compares the execution time of both methods.
 */
public class Lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        scanner.close();
        
        // Measure execution time for iterative factorial
        long startTimeIterative = System.nanoTime();
        long factorialIterative = factorialIterative(n);
        long endTimeIterative = System.nanoTime();
        long durationIterative = endTimeIterative - startTimeIterative;
        
        // Measure execution time for recursive factorial
        long startTimeRecursive = System.nanoTime();
        long factorialRecursive = factorialRecursive(n);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;
        
        // Display results
        System.out.println("\nFactorial of " + n + " = " + factorialIterative);
        System.out.println("\nExecution Time Comparison:");
        System.out.println("Iterative Method: " + durationIterative + " nanoseconds");
        System.out.println("Recursive Method: " + durationRecursive + " nanoseconds");
        
        if (durationIterative < durationRecursive) {
            System.out.println("Iterative method was faster by " + 
                (durationRecursive - durationIterative) + " nanoseconds");
        } else if (durationRecursive < durationIterative) {
            System.out.println("Recursive method was faster by " + 
                (durationIterative - durationRecursive) + " nanoseconds");
        } else {
            System.out.println("Both methods took the same amount of time");
        }
    }
    
    /**
     * Calculates factorial using an iterative approach
     * @param n The number to calculate factorial for
     * @return The factorial of n
     */
    public static long factorialIterative(int n) {
        // Handle base cases
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Calculate factorial iteratively
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * Calculates factorial using a recursive approach
     * @param n The number to calculate factorial for
     * @return The factorial of n
     */
    public static long factorialRecursive(int n) {
        // Handle base cases
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Calculate factorial recursively
        return n * factorialRecursive(n - 1);
    }
}
