import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        while (true) {
            System.out.print("Enter the number of days (enter non-positive value to exit): ");
            days = scanner.nextInt();

            if (days <= 0) {
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.printf("%d days is %d weeks and %d days%n", days, weeks, remainingDays);
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}
