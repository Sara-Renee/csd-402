// Sara White - CSD-402 - Assignment 8.2 //

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;

public class SaraArrayListTest {

    public static void main(String[] args) {
          // get user input  
        Scanner input = new Scanner(System.in);
        // ArrayList that will only hold integers
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers only. Enter 0 to stop:");

        // declare variable userInput and initialize
        int userInput = 0;

        do {
            try {
                userInput = input.nextInt();
                numbers.add(userInput);
            } catch (InputMismatchException e) { // loop to handle non-integer input
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); 
                continue;     
            }

        } while (userInput != 0); // loop to continue unless input is 0

        Integer largest = max(numbers);

        // display results
        System.out.println("\nThe largest integer in your list is: " + largest + "\n");

        input.close();
    }

    public static Integer max(ArrayList<Integer> list) {

        if (list.isEmpty()) {
            return 0;
        }

        return Collections.max(list);
    }
}