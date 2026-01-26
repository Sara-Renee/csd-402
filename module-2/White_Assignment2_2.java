// Sara White
// CSD-402
// Assignment 2.2

import java.util.Scanner;

public class White_Assignment2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Computer chooses random number between 1 and 3, add 1 so it doesn't start at 0
        int computerChoice = (int)(Math.random() * 3) + 1;

        // Get user choice
        System.out.print("Make your choice! (1 = Rock, 2 = Paper, 3 = Scissors): ");
        int userChoice = input.nextInt();

        // Display user's choice
        System.out.print("You chose: ");
        switch (userChoice) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Display computer's choice
        System.out.print("I chose: ");
        switch (computerChoice) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
        }

        // Display output based on who won
        if (userChoice == computerChoice) {
            System.out.println("It's a tie. I demand a rematch.");
        } else if (
            (userChoice == 1 && computerChoice == 3) ||
            (userChoice == 2 && computerChoice == 1) ||
            (userChoice == 3 && computerChoice == 2)
        ) {
            System.out.println("You win this time.");
        } else {
            System.out.println("I am superior.");
        }
    }
}