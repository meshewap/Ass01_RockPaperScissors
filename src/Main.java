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
                    System.out.println("Seriously, '" + playerBMove + "'? Stick to the script: R, P, or S!");
                    isValidInput = false;
                }
            } while (!isValidInput);

            //Determine and display the winner
            System.out.println();

            if (playerAMove.equalsIgnoreCase(playerBMove)) {

                if (playerAMove.equalsIgnoreCase("R")) {
                    System.out.println("Two rocks... staring awkwardly at each other. It’s a Tie!");
                } else if (playerAMove.equalsIgnoreCase("P")) {
                    System.out.println("Two sheets of paper flutter aimlessly. It’s a Tie!");
                } else {
                    System.out.println("A duel of scissors! *Clang* *Clang* ...they agree to disagree. It’s a Tie!");
                }
            } else if (playerAMove.equalsIgnoreCase("R")) {
                if (playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("Rock smashes Scissors! Player A wins by sheer geological force!");
                } else {
                    System.out.println("Paper gracefully envelops Rock in a papery hug of defeat! Player B wins!");
                }
            } else if (playerAMove.equalsIgnoreCase("P")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, proving a warm blanket! Player A wins!");
                } else {
                    System.out.println("Scissors give Paper a very bad haircut! Player B wins!");
                }
            } else {
                if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors snip Paper into a thousand tiny confetti pieces! Player A wins the party!");
                } else {
                    System.out.println("Scissors tried to cut Rock and are now tragically dull. Rock laughs. Player B wins!");
                }
            }

            //  Prompt to play again
            System.out.println();
            System.out.print("Want to continue this chaos? [Y/N]: ");
            playAgainResponse = in.nextLine();
            System.out.println();

        } while (playAgainResponse.equalsIgnoreCase("Y"));

        System.out.println("Thanks for the laughs! See you next time!");
        in.close();
    }
}