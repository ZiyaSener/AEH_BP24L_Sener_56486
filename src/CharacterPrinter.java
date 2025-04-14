/**
 * This class demonstrates a method that takes a character and two integers as parameters
 * and prints the character according to the specified pattern.
 */
public class CharacterPrinter {
    
    public static void main(String[] args) {
        // Test the printCharPattern method with different inputs
        System.out.println("Example 1:");
        printCharPattern('*', 3, 4);
        
        System.out.println("\nExample 2:");
        printCharPattern('#', 5, 2);
        
        System.out.println("\nExample 3:");
        printCharPattern('@', 2, 6);
    }
    
    /**
     * Prints a character in a pattern specified by two integers.
     * 
     * @param character The character to be displayed
     * @param rows The number of times the character is to be printed in a row
     * @param lines The number of lines to be printed
     */
    public static void printCharPattern(char character, int rows, int lines) {
        // Iterate through each line
        for (int i = 0; i < lines; i++) {
            // Print the character 'rows' times in a row
            for (int j = 0; j < rows; j++) {
                System.out.print(character);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
