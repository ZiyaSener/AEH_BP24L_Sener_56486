public class Person {
    // Private fields
    private String firstName;
    private String lastName;
    private int age;
    
    // Default constructor
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }
    
    // Parameterized constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }
    
    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // Getter for lastName
    public String getLastName() {
        return lastName;
    }
    
    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
