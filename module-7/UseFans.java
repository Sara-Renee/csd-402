// Sara White
// CSD-402
// Assignment 7.2

import java.util.ArrayList;

public class UseFans {

    // Collection of fans display
    public static void displayFans(ArrayList<Fan> fans) {
        // loop through each fan object in the ArrayList and display details
        for (int i = 0; i < fans.size(); i++) {

           System.out.println("\n--------------------\nFan " + (i + 1) + "\n--------------------");
    
            displayFan(fans.get(i));
        }
        System.out.println("\n--------------------");
    }

    public static void displayFan(Fan fan) {

        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    public static void main(String[] args) {

        // create collection of fan instances
        ArrayList<Fan> fanCollection = new ArrayList<>();

        // add fan objects to collection
        fanCollection.add(new Fan()); // will show default values (STOPPED, false, 6, white)
        fanCollection.add(new Fan(Fan.FAST, true, 5, "black")); // constructor that takes arguments
        fanCollection.add(new Fan(Fan.MEDIUM, true, 8, "blue"));
        fanCollection.add(new Fan(Fan.SLOW, false, 7, "pink"));

        // display for all fan instances in collection
        displayFans(fanCollection);
    }
}

//References
//Liang, Y. D. (2025). Introduction to Java Programming and Data Structures. Pearson.