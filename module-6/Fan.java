// Sara White
// CSD-402
// Assignment 6.2

public class Fan {

    // Define constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields to hold constant values
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor to set default values
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Constructor that takes arguments and sets values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        return
               "Speed: " + speed + "\n" +
               "On: " + on + "\n" +
               "Radius: " + radius + "\n" +
               "Color: " + color;
    }

    // Test code w/two instances (default and custom)
    public static void main(String[] args) {

        // Fan using default constructor
        Fan fan1 = new Fan();
        System.out.println("\n--------------------\nDefault fan settings\n--------------------\n" + fan1);

        // Fan using argument constructor
        Fan fan2 = new Fan(FAST, true, 5, "black");
        System.out.println("\n--------------------\nCustom fan settings\n--------------------\n" + fan2);
    }
}


//References
//GeeksforGeeks. (n.d.). Java constructors. https://www.geeksforgeeks.org/java/constructors-in-java/
//Liang, Y. D. (2025). Introduction to Java Programming and Data Structures. Pearson.