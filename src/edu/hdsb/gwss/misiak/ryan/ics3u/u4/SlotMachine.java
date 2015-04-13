/*
 * Name: SlotMachine
 * Date: April 7, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program is a basic form of a casino slot machine game. User starts 
 50 coins and continues to play until they choose not to.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Introduction to the game for user.
        System.out.println("Slot Machine. \nWelcome! \nThis is a variation of the casino game Slot Machine."
                + "You start with 50 free coins. Each round costs \n1 coin. If the slot machine gives you three "
                + "1's, you will win 4 coins. If it gives you three \n2's, you will win 6 coins. If it gives you "
                + "three 3's, you will win 8 coins. If it gives you \nthree 4's, you will win 10 coins. Any other "
                + "combination will result in no coins being won.");

        //Declaring variables.
        int startingCoins = 10;
        int endingCoins;
        int currentCoins = startingCoins;
        int choice;
        int numberOne;
        int numberTwo;
        int numberThree;
        int addedCoins;
        boolean continueGame = true;
        final int numOfValues = 4;

        //OUTPUT
        while ((continueGame) && currentCoins > 0) {

            System.out.print("\nTo play again, click 1. To end the game, click 0: ");

            Scanner inputChoice = new Scanner(System.in);
            choice = inputChoice.nextInt();

            //User decides to play again.
            if (choice == 1) {

                startingCoins = currentCoins;
                currentCoins = currentCoins - 1;
                numberOne = (int) (Math.random() * numOfValues + 1);
                numberTwo = (int) (Math.random() * numOfValues + 1);
                numberThree = (int) (Math.random() * numOfValues + 1);

                System.out.format("%2s %3s %2s %3s %2s \n", numberOne, " ", numberTwo, " ", numberThree);

                continueGame = true;
                if (numberOne != numberTwo || numberTwo != numberThree) {
                    System.out.println("\nSorry, you did not win anything :(");
                } else if (numberOne == 1) {
                    addedCoins = 4;
                    currentCoins = currentCoins + addedCoins;
                } else if (numberOne == 2) {
                    addedCoins = 6;
                    currentCoins = currentCoins + addedCoins;
                } else if (numberOne == 3) {
                    addedCoins = 8;
                    currentCoins = currentCoins + addedCoins;
                } else if (numberOne == 4) {
                    addedCoins = 10;
                    currentCoins = currentCoins + addedCoins;
                } else {
                    System.out.println();
                }
                System.out.println("\nYou won: " + (currentCoins - startingCoins + 1) + " coins");
                System.out.println("You now have " + currentCoins + " coins. \n");

                //User decides not to play again.
            } else if (choice == 0) {
                endingCoins = currentCoins;
                System.out.println("Thank you for playing!");
                System.out.println("Total coins left: " + endingCoins);
                System.out.println("Game has been ended.");
                continueGame = false;

                //User enters an incorrect digit.
            } else {
                System.out.println("Invalid entry. Please try again.");
                continueGame = false;
            }

        }
        System.out.println("Sorry, you do not have any more coins left.");
    }
}
