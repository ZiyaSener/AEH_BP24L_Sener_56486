import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        while (true) {
            System.out.print("Enter temperature in Celsius (-1 to exit): ");
            celsius = scanner.nextDouble();

            if (celsius == -1) {
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
            System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
            System.out.printf("Temperature in Kelvin: %.2f K%n%n", kelvin);
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}
