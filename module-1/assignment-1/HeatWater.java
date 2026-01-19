//Sara White
//CSD-402
//Assignment 1.3

import java.util.Scanner;

public class HeatWater {
    
    public static void main(String[] args) {

        //use scanner to read input
        Scanner input = new Scanner(System.in); 
        
        //prompt the user to enter water amount in kilograms
        System.out.print("Enter the amount of water in kilograms: ");

        //read the number to include decimals
        double waterMass = input.nextDouble();

        //prompt the user to get starting temp
        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemperature = input.nextDouble();

        //prompt the user to get ending temp
        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemperature = input.nextDouble();

        //formula is Q = waterMass X (finalTemperature - initialTemperature) X 4184, format calculation to accept decimals
        double q = waterMass * (finalTemperature - initialTemperature) * 4184;

        //display the results
        System.out.println("The energy needed is " + q + " Joules.");

        input.close();
    }
}
