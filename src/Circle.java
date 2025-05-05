public class Circle {
    // Private field
    private double radius;
    
    // Default constructor
    public Circle() {
        this.radius = 0.0;
    }
    
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
