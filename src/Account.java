public class Account {
    // Private fields
    private String accountNumber;
    private double balance;
    private String ownerName;
    private String email;
    private String phoneNumber;
    
    // Default constructor
    public Account() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.ownerName = "";
        this.email = "";
        this.phoneNumber = "";
    }
    
    // Parameterized constructor
    public Account(String accountNumber, double balance, String ownerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    
    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // Getter for ownerName
    public String getOwnerName() {
        return ownerName;
    }
    
    // Setter for ownerName
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    // Getter for email
    public String getEmail() {
        return email;
    }
    
    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Getter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    // Setter for phoneNumber
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of PLN " + amount + " was made. New balance PLN " + this.balance);
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew PLN " + amount + " from the account, Remaining balance = PLN " + this.balance);
        } else {
            System.out.println("Insufficient funds. You have PLN " + this.balance + " in your account.");
        }
    }
    
    // Method to get account information
    public String getAccountInfo() {
        return "Account Number: " + accountNumber + 
               "\nOwner: " + ownerName + 
               "\nEmail: " + email + 
               "\nPhone: " + phoneNumber + 
               "\nBalance: PLN " + balance;
    }
}
