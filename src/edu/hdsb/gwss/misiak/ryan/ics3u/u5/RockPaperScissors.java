/*
 * Name: RockPaperScissors
 * Date: April 24, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program allows the user to play Rock Paper Scissors.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Program Title
        System.out.println("Rock-Paper-Scissors");

        //Declaring boolean for continuing game
        boolean continueGame = false;

        //Getting user's input
        do {
            System.out.println("\nPlease choose your option (Rock, Paper, or Scissors): ");

            Scanner inputChoice = new Scanner(System.in);
            String choice = inputChoice.nextLine();
            int computerChoiceGenerator = (int) (Math.random() * 3 + 1);

            String computerChoice = "";
            if (computerChoiceGenerator == 1) {
                computerChoice = "ROCK";
            } else if (computerChoiceGenerator == 2) {
                computerChoice = "PAPER";
            } else if (computerChoiceGenerator == 3) {
                computerChoice = "SCISSORS";
            }

            int winsForThisGame = gamesWon(choice, computerChoice);
            int lossesForThisGame = gamesLost(choice, computerChoice);
            int tiesForThisGame = gamesTied(choice, computerChoice);

            int ties = 0;
            int wins = 0;
            int losses = 0;

            wins = wins + winsForThisGame;
            losses = losses + lossesForThisGame;
            ties = ties + tiesForThisGame;

            System.out.println("Wins: " + wins + " Losses: " + losses + " Ties: " + ties);

            System.out.println("Would you like to play again? (yes or no)");
            Scanner inputPlayAgain = new Scanner(System.in);

            String playAgain = inputPlayAgain.nextLine();
            playAgain = playAgain.toUpperCase();

            if (playAgain.equals("YES")) {
                continueGame = true;
            } else {
                continueGame = false;
            }

        } while (continueGame);
    }

    public static int gamesWon(String userInput, String computerChoice) {

        //Declaring variables
        String gameEnds = "";
        int wins = 0;

        //Converting user's input to uppercase
        userInput = userInput.toUpperCase();

        //OUTPUT
        if (userInput.equals("ROCK")) {
            if (computerChoice.equals("SCISSORS")) {
                gameEnds = "You win!";
                wins = wins + 1;
            }
        } else if (userInput.equals("SCISSORS")) {
            if (computerChoice.equals("PAPER")) {
                gameEnds = "You win!";
                wins = wins + 1;
            }
        } else if (userInput.equals("PAPER")) {
            if (computerChoice.equals("ROCK")) {
                gameEnds = "You win!";
                wins = wins + 1;
            }
        }
        computerChoice = computerChoice.toUpperCase();
        System.out.println("You threw " + userInput + " and the computer threw " + computerChoice + ". " + gameEnds);
        return wins;
    }

    public static int gamesLost(String userInput, String computerChoice) {
        int losses = 0;
        String gameEnds = "";

        if (userInput.equals("ROCK")) {
            if (computerChoice.equals("PAPER")) {
                gameEnds = "You lose...";
                losses = losses + 1;
            }
        } else if (userInput.equals("SCISSORS")) {
            if (computerChoice.equals("ROCK")) {
                gameEnds = "You lose...";
                losses = losses + 1;

            }
        } else if (userInput.equals("PAPER")) {
            if (computerChoice.equals("SCISSORS")) {
                gameEnds = "You lose...";
                losses = losses + 1;
            }

        }
        System.out.println("You threw " + userInput + " and the computer threw " + computerChoice + ". " + gameEnds);
        return losses;

    }

    public static int gamesTied(String userInput, String computerChoice) {
        int ties = 0;
        String gameEnds = "";

        if (userInput.equals("ROCK")) {
            if (computerChoice.equals(userInput)) {
                gameEnds = "It's a tie!";
                ties = ties + 1;
            } else if (userInput.equals("SCISSORS")) {
                if (computerChoice.equals(userInput)) {
                    gameEnds = "It's a tie!";
                    ties = ties + 1;

                }
            } else if (userInput.equals("PAPER")) {
                if (computerChoice.equals(userInput)) {
                    gameEnds = "It's a tie!";
                    ties = ties + 1;
                }
            }
        }
        System.out.println("You threw " + userInput + " and the computer threw " + computerChoice + ". " + gameEnds);
        return ties;
    }
}
