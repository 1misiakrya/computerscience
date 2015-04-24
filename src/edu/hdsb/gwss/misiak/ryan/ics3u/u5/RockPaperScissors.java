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
        boolean continueGame = true;

        //Getting user's input
        System.out.println("\nPlease choose your option (Rock, Paper, or Scissors): ");

        Scanner inputChoice = new Scanner(System.in);
        String choice = inputChoice.nextLine();

        determineOutcome(choice, (int) (Math.random() * 3 + 1));
    }



public static void determineOutcome(String userInput, int computerChoiceGenerator) {

        //Declaring variables
        String computerChoice = "";
        String gameEnds = "";
        int wins = 0;
        int ties = 0;
        int losses = 0;

        //Converting user's input to uppercase
        userInput = userInput.toUpperCase();

        //OUTPUT
        if (computerChoiceGenerator == 1) {
            computerChoice = "ROCK";
        } else if (computerChoiceGenerator == 2) {
            computerChoice = "PAPER";
        } else if (computerChoiceGenerator == 3) {
            computerChoice = "SCISSORS";
        }
        
        if (userInput.equals("ROCK")) {
            if (computerChoice.equals(userInput)) {
                gameEnds = "It's a tie!";
                ties = ties + 1;
            } else if (computerChoice.equals("PAPER")) {
                gameEnds = "You lose...";
                losses = losses + 1;
            } else if (computerChoice.equals("SCISSORS")) {
                gameEnds = "You win!";
                wins = wins + 1;
            }
        } else if (userInput.equals("SCISSORS")) {
            if (computerChoice.equals(userInput)) {
                gameEnds = "It's a tie!";
                ties = ties + 1;
            } else if (computerChoice.equals("ROCK")) {
                gameEnds = "You lose...";
                losses = losses + 1;
            } else if (computerChoice.equals("PAPER")) {
                gameEnds = "You win!";
                wins = wins + 1;
            }
        } else if (userInput.equals("PAPER")) {
            if (computerChoice.equals(userInput)) {
                gameEnds = "It's a tie!";
                ties = ties + 1;
            } else if (computerChoice.equals("SCISSORS")) {
                gameEnds = "You lose...";
                losses = losses + 1;
            } else if (computerChoice.equals("ROCK")) {
                gameEnds = "You win!";
                wins = wins + 1;
            }
        }
        computerChoice = computerChoice.toUpperCase();
        System.out.println("You threw " + userInput + " and the computer threw " + computerChoice + ". " + gameEnds);
        System.out.println("Wins: " + wins + " Losses: " + losses + " Ties: " + ties);
    }
}

        
        

    

