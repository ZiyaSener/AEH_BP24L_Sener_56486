public class myEighthApp {
    public static void main(String[] args) {
        // Demo code for Lab 8
        
        // Person class demo
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Doe");
        person1.setAge(25);
        
        System.out.println("Person details: " + person1.getFirstName() + " " + 
                person1.getLastName() + ", age: " + person1.getAge());
        
        // Circle class demo
        Circle circle1 = new Circle(5.0);
        System.out.println("Circle radius: " + circle1.getRadius());
        System.out.println("Circle area: " + circle1.calculateArea());
        
        // Account class demo for Task 2
        Account account = new Account("123456789", 1000.0, "John Doe", 
                "john.doe@example.com", "123-456-789");
        
        System.out.println("\nAccount Demo:");
        System.out.println("Initial account details:");
        System.out.println(account.getAccountInfo());
        
        // Test withdrawing money
        account.withdraw(900.0);
        
        // Test depositing money
        account.deposit(250.0);
        
        // Test withdrawing money again
        account.withdraw(50.0);
        
        // Test withdrawing more money than available
        account.withdraw(600.0);
    }
}
