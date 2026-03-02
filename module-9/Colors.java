//Sara White - Assignment 9.2 - CSD-402//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Colors {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        //ArrayList to hold 10 strings (colors)
        List<String> newItems = Arrays.asList(
                "1. Lavender", "2. Mint", "3. Olive", "4. Navy", "5. Fuchsia",
                "6. Crimson", "7. Salmon", "8. Ivory", "9. Saffron", "10. Teal"
        );
        colors.addAll(newItems);

        System.out.println("\nHere's a list of colors:");
        for (String c : colors) {
            System.out.println(c);
        }

        Scanner input = new Scanner(System.in);
        //will hold the user's choice as an Integer (autoboxing)
        Integer choiceBoxed; 

        do {
            System.out.print("\nWhich color would you like to see again? Enter 1-10 (0 to stop): ");

            //user input
            String userInput = input.nextLine(); 

            try {
                //autoboxing - convert user input to integer
                choiceBoxed = Integer.valueOf(userInput);

                //user input of 0 to end the program
                if (choiceBoxed == 0) {
                    System.out.println("Goodbye!");
                    break;
                }
                int index = choiceBoxed - 1;

                System.out.println("You chose: " + colors.get(index));

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                
                choiceBoxed = -1; 
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Exception thrown: Out of Bounds");
                //keep the loop going
                choiceBoxed = -1;
            }

        } while (true);

        input.close();
    }
}