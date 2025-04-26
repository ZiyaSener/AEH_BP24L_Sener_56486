public class Person {
    private String name;
    private int age;
    private String address; // Added field for address
    private int yearOfBirth; // Added field for year of birth

    // Constructor
    public Person(String name, int age, String address, int yearOfBirth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for year of birth
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // Setter for year of birth
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // Method to increase age by the specified amount
    public void growOld(int years) {
        age += years;
    }

    // Method to decrease age by 1
    public void beYounger() {
        age--;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Year of Birth: " + yearOfBirth);
    }
}
