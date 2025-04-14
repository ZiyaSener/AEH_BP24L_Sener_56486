public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        while (true) {
            System.out.println("\nSimple Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("\nSelect an operation (1-5): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
            
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option! Please select 1-5.");
                continue;
            }
            
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            String operation = "";
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    operation = "Addition";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = "Subtraction";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = "Multiplication";
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        operation = "Division";
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    break;
            }
            
            System.out.printf("%s result: %.2f\n", operation, result);
        }
        
        scanner.close();
    }
}
