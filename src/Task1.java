import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user's first and last name
        System.out.print("Enter your first name: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String surname = scanner.nextLine();
        
        // Print welcome message
        System.out.println("Welcome " + firstname + " " + surname);
        
        scanner.close();
    }
}
