/**
 * Demo code for Lab 5
 * This class demonstrates the use of methods in Java
 */
public class myFifthApp {
    /**
     * Main method that demonstrates various method calls
     */
    public static void main(String[] args) {
        // Demonstrate method with no parameters and no return value
        printWelcomeMessage();
        
        // Demonstrate method with parameters but no return value
        printPersonalizedMessage("Student");
        
        // Demonstrate method with parameters and return value
        int sum = addNumbers(5, 7);
        System.out.println("Sum of 5 and 7 is: " + sum);
        
        // Demonstrate method with multiple parameters
        double average = calculateAverage(10, 20, 30);
        System.out.println("Average of 10, 20, and 30 is: " + average);
        
        // Demonstrate method overloading
        System.out.println("Square of 4: " + square(4));
        System.out.println("Square of 2.5: " + square(2.5));
    }
    
    /**
     * Method with no parameters and no return value
     * Simply prints a welcome message
     */
    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Methods Demonstration!");
        System.out.println("------------------------------------");
    }
    
    /**
     * Method with one parameter but no return value
     * Prints a personalized message using the provided name
     * 
     * @param name The name to include in the greeting
     */
    public static void printPersonalizedMessage(String name) {
        System.out.println("Hello, " + name + "! Nice to meet you.");
    }
    
    /**
     * Method with two parameters and a return value
     * Adds two numbers and returns the result
     * 
     * @param a First number
     * @param b Second number
     * @return The sum of a and b
     */
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    /**
     * Method with three parameters and a return value
     * Calculates the average of three numbers
     * 
     * @param a First number
     * @param b Second number
     * @param c Third number
     * @return The average of a, b, and c
     */
    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    
    /**
     * Method overloading example - calculates square of an integer
     * 
     * @param num The number to square
     * @return The square of the number
     */
    public static int square(int num) {
        return num * num;
    }
    
    /**
     * Method overloading example - calculates square of a double
     * 
     * @param num The number to square
     * @return The square of the number
     */
    public static double square(double num) {
        return num * num;
    }
}
