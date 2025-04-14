import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Part 1: Days to weeks converter
        while (true) {
            System.out.println("\n=== Days to Weeks Converter ===");
            System.out.print("Enter number of days (or non-positive number to move to temperature converter): ");
            int days = scanner.nextInt();
            
            if (days <= 0) {
                break;
            }
            
            int weeks = days / 7;
            int remainingDays = days % 7;
            System.out.printf("%d days is %d weeks and %d days%n", days, weeks, remainingDays);
        }
        
        // Part 2: Temperature converter
        while (true) {
            System.out.println("\n=== Temperature Converter ===");
            System.out.print("Enter temperature in Celsius (or -1 to exit): ");
            double celsius = scanner.nextDouble();
            
            if (celsius == -1) {
                break;
            }
            
            // Calculate conversions
            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;
            
            // Display results with 2 decimal places
            System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
            System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
            System.out.printf("Temperature in Kelvin: %.2f K%n", kelvin);
        }
        
        scanner.close();
        System.out.println("Program terminated.");
    }
}
