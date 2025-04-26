public class mySeventhApp {
    public static void main(String[] args) {
        // Create a new Person object with name, age, address, and year of birth
        Person person1 = new Person("John", 25, "123 Main St, Warsaw", 1998);
        
        // Display initial information
        System.out.println("Initial information:");
        person1.displayInfo();
        System.out.println();
        
        // Demonstrate growOld method with an argument
        System.out.println("After growing older by 5 years:");
        person1.growOld(5);
        person1.displayInfo();
        System.out.println();
        
        // Demonstrate beYounger method
        System.out.println("After becoming younger:");
        person1.beYounger();
        person1.displayInfo();
        System.out.println();
        
        // Create another person
        Person person2 = new Person("Alice", 30, "456 Oak St, Krakow", 1993);
        
        // Display information for the second person
        System.out.println("Information for the second person:");
        person2.displayInfo();
        System.out.println();
        
        // Demonstrate multiple growOld and beYounger calls
        System.out.println("After multiple age changes for the second person:");
        person2.growOld(10);
        person2.beYounger();
        person2.beYounger();
        person2.displayInfo();
    }
}
