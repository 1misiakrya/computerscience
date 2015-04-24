/*
 * Name: Mastermind
 * Date: April 24, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program allows the user to play Mastermind.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class Mastermind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Title and introduction to program
        System.out.println("Mastermind");

        System.out.println("In this game, there are four different coloured blocks "
                + "(red, green, blue, and yellow).  The computer hides three \ndifferent "
                + "coloured blocks from the user.  The user then tries to guess the "
                + "colours and the order of the blocks.");

        //Declaring variables
        int computerChoiceOne = (int) (Math.random() * 4 + 1);
        int computerChoiceTwo = (int) (Math.random() * 4 + 1);
        int computerChoiceThree = (int) (Math.random() * 4 + 1);
        boolean continueGame = false;

        //OUTPUT
        do {
            System.out.println("Enter your first guess: ");

            Scanner inputFirstGuess = new Scanner(System.in);
            String firstGuess = inputFirstGuess.nextLine();

            System.out.println("Enter your second guess: ");

            Scanner inputSecondGuess = new Scanner(System.in);
            String secondGuess = inputSecondGuess.nextLine();

            System.out.println("Enter your third guess: ");

            Scanner inputThirdGuess = new Scanner(System.in);
            String thirdGuess = inputThirdGuess.nextLine();

            System.out.println("Your guesses are: " + firstGuess + " " + secondGuess + " " + thirdGuess);

            if ((!firstGuess.equals("R") && !firstGuess.equals("Y") && !firstGuess.equals("B") && !firstGuess.equals("G")) || (!secondGuess.equals("R") && !secondGuess.equals("Y") && !secondGuess.equals("B") && !secondGuess.equals("G")) || (!thirdGuess.equals("R") && !thirdGuess.equals("Y") && !thirdGuess.equals("B") && !thirdGuess.equals("G"))) {
                System.out.println("ERROR - Invalid Guess. Thank you for playing!");
            } else {
                checkColoursCorrect(firstGuess, secondGuess, thirdGuess, computerChoiceOne, computerChoiceTwo, computerChoiceThree);

                System.out.println("\nGuess Again? (1 for yes, 2 for no): ");

                Scanner inputPlayAgain = new Scanner(System.in);
                int playAgain = inputPlayAgain.nextInt();

                if (playAgain > 2 || playAgain < 1) {
                    System.out.println("ERROR - Invalid Entry. Thank you for playing!");
                    continueGame = false;
                } else if (playAgain == 1) {
                    continueGame = true;
                } else {
                    continueGame = false;
                }
            }
        } while (continueGame);
    }

    public static void checkColoursCorrect(String firstColour, String secondColour, String thirdColour, int computerChoiceOne, int computerChoiceTwo, int computerChoiceThree) {

        //Declaring variables
        String computerColourOne = "";
        String computerColourTwo = "";
        String computerColourThree = "";
        String computerColour;
        int correctColours = 0;

        //Changing the random generated numbers into colours
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                computerColour = Integer.toString(computerChoiceOne);
                if (Integer.parseInt("" + computerColour) == 1) {
                    computerColour = "R";
                } else if (Integer.parseInt("" + computerColour) == 2) {
                    computerColour = "G";
                } else if (Integer.parseInt("" + computerColour) == 3) {
                    computerColour = "B";
                } else if (Integer.parseInt("" + computerColour) == 4) {
                    computerColour = "Y";
                }
                computerColourOne = computerColour;
            } else if (i == 1) {
                computerColour = Integer.toString(computerChoiceTwo);
                if (Integer.parseInt("" + computerColour) == 1) {
                    computerColour = "R";
                } else if (Integer.parseInt("" + computerColour) == 2) {
                    computerColour = "G";
                } else if (Integer.parseInt("" + computerColour) == 3) {
                    computerColour = "B";
                } else if (Integer.parseInt("" + computerColour) == 4) {
                    computerColour = "Y";
                }
                computerColourTwo = computerColour;
            } else if (i == 2) {
                computerColour = Integer.toString(computerChoiceThree);
                if (Integer.parseInt("" + computerColour) == 1) {
                    computerColour = "R";
                } else if (Integer.parseInt("" + computerColour) == 2) {
                    computerColour = "G";
                } else if (Integer.parseInt("" + computerColour) == 3) {
                    computerColour = "B";
                } else if (Integer.parseInt("" + computerColour) == 4) {
                    computerColour = "Y";
                }
                computerColourThree = computerColour;
            }
        }

        //Checking to see if the user's guesses match any of the colours
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                computerColour = computerColourOne;
            } else if (i == 1) {
                computerColour = computerColourTwo;
            } else {
                computerColour = computerColourThree;
            }
            if (computerColour.equals("R") && (firstColour.equals("R") || secondColour.equals("R") || thirdColour.equals("R"))) {
                correctColours = correctColours + 1;
            } else if (computerColour.equals("G") && (firstColour.equals("G") || secondColour.equals("G") || thirdColour.equals("G"))) {
                correctColours = correctColours + 1;
            } else if (computerColour.equals("Y") && (firstColour.equals("Y") || secondColour.equals("Y") || thirdColour.equals("Y"))) {
                correctColours = correctColours + 1;
            } else if (computerColour.equals("B") && (firstColour.equals("B") || secondColour.equals("B") || thirdColour.equals("B"))) {
                correctColours = correctColours + 1;
            }
        }
        //Printing the number of correctly guessed colours
        System.out.println("Number of Colours Correct: " + correctColours);
        
        //Changing into check positions method
        checkPositionsCorrect(firstColour, secondColour, thirdColour, computerColourOne, computerColourTwo, computerColourThree);
    }

    public static void checkPositionsCorrect(String firstColour, String secondColour, String thirdColour, String computerColourOne, String computerColourTwo, String computerColourThree) {

        //Declaring variables
        int correctPositions = 0;

        //Checking if the position of the user's guesses and the guessed colour itself are correct
        if (computerColourOne.equals(firstColour)) {
            correctPositions = correctPositions + 1;
        }
        if (computerColourTwo.equals(secondColour)) {
            correctPositions = correctPositions + 1;
        }
        if (computerColourThree.equals(thirdColour)) {
            correctPositions = correctPositions + 1;
        }
        System.out.println("Number of Positions Correct: " + correctPositions);

        //OUTPUT if user gets all three positions (and therefore colours) correct
        if (correctPositions ==3){
            System.out.println("Congradulations! You have guessed all 3 colours correctly! Please exit the game and play again!");
        }
    }
}
