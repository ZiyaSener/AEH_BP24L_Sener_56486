import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();
            
            // Exit condition: if upper limit is equal to or less than lower limit
            if (upper <= lower) {
                System.out.println("Done");
                break;
            }
            
            // Calculate sum of squares from lower to upper
            int sum = 0;
            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }
            
            System.out.println("The sums of the squares from " + lower + " to " + upper + " is " + sum);
            System.out.println();
        }
        
        scanner.close();
    }
}
