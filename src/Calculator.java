import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Display calculator menu
            System.out.println("\nSimple Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("\nSelect an operation (1-5): ");
            
            int choice = scanner.nextInt();
            
            // Exit condition
            if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
            
            // Validate menu selection
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option! Please select 1-5.");
                continue;
            }
            
            // Get input numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            String operation = "";
            
            // Perform selected operation
            switch (choice) {
                case 1: // Addition
                    result = num1 + num2;
                    operation = "Addition";
                    break;
                case 2: // Subtraction
                    result = num1 - num2;
                    operation = "Subtraction";
                    break;
                case 3: // Multiplication
                    result = num1 * num2;
                    operation = "Multiplication";
                    break;
                case 4: // Division
                    if (num2 != 0) {
                        result = num1 / num2;
                        operation = "Division";
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    break;
            }
            
            // Display result
            System.out.printf("%s result: %.2f\n", operation, result);
        }
        
        scanner.close();
    }
}
