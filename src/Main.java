import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgainResponse;

        do {
            String playerAMove = "";
            String playerBMove = "";
            boolean isValidInput;

            //Player A's turn
            do {
                System.out.print("Player A, what's your move (R, P, S)? ");
                playerAMove = in.nextLine();
                if (playerAMove.equalsIgnoreCase("R") ||
                        playerAMove.equalsIgnoreCase("P") ||
                        playerAMove.equalsIgnoreCase("S")) {
                    isValidInput = true;
                } else {
                    System.out.println("'" + playerAMove + "'? Is that even a choice? Pick R, P, or S!");
                    isValidInput = false;
                }
            } while (!isValidInput);

            //Player B's turn
            do {
                System.out.print("Player B, show us your move (R, P, S)! ");
                playerBMove = in.nextLine();
                if (playerBMove.equalsIgnoreCase("R") ||
                        playerBMove.equalsIgnoreCase("P") ||
                        playerBMove.equalsIgnoreCase("S")) {
                    isValidInput = true;
                } else {
                    System.out.println("'" + playerBMove + "' is not a valid move. Please try again.");
                    isValidInput = false;
                }
            } while (!isValidInput);

            //Determine and display the winner
            System.out.println();

            if (playerAMove.equalsIgnoreCase(playerBMove)) {

                if (playerAMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock it’s a Tie!");
                } else if (playerAMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper it’s a Tie!");
                } else {
                    System.out.println("Scissors vs Scissors it’s a Tie!");
                }
            } else if (playerAMove.equalsIgnoreCase("R")) {
                if (playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors, Player A wins!");
                } else {
                    System.out.println("Paper covers Rock, Player B wins!");
                }
            } else if (playerAMove.equalsIgnoreCase("P")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, Player A wins!");
                } else {
                    System.out.println("Scissors cuts Paper, Player B wins!");
                }
            } else {
                if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper, Player A wins!");
                } else {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                }
            }

            //  Prompt to play again
            System.out.println();
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgainResponse = in.nextLine();
            System.out.println();

        } while (playAgainResponse.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}