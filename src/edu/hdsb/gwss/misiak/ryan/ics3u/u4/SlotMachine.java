/*
 * Name: SlotMachine
 * Date: April 7, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: 
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

        int startingCoins = 50;
        int endingCoins;
        int currentCoins = startingCoins;
        int choice;
        int numberOne;
        int numberTwo;
        int numberThree;
        int addedCoins = 4;
        String winningMessage = ("\nYou won: " + addedCoins + " coins");
        String totalCoinsMessage = ("You now have " + (currentCoins + addedCoins) + " coins. \n");
        boolean continueGame = true;

        final int numOfValues = 4;
        while (continueGame) {

            System.out.print("\nTo play again, click 1. To end the game, click 0: ");

            Scanner inputChoice = new Scanner(System.in);
            choice = inputChoice.nextInt();

            if (choice == 1) {

                currentCoins = currentCoins - 1;
                numberOne = (int) (Math.random() * numOfValues + 1);
                numberTwo = (int) (Math.random() * numOfValues + 1);
                numberThree = (int) (Math.random() * numOfValues + 1);
                
                System.out.format("%2s %3s %2s %3s %2s \n", numberOne, " ", numberTwo, " ", numberThree);
                continueGame = true;
                if (numberOne != numberTwo || numberTwo != numberThree){
                    System.out.println("\nSorry, you did not win anything :(");
                    System.out.println(totalCoinsMessage);
                } else if (numberOne == 1) {
                    addedCoins = 4;
                    currentCoins = currentCoins + addedCoins;
                    System.out.println(winningMessage);
                    System.out.println(totalCoinsMessage);
                } else if (numberOne == 2) {
                    addedCoins = 6;
                    currentCoins = currentCoins + addedCoins;
                    System.out.println(winningMessage);
                    System.out.println(totalCoinsMessage);
                } else if (numberOne == 3) {
                    addedCoins = 8;
                    currentCoins = currentCoins + addedCoins;
                    System.out.println(winningMessage);
                    System.out.println(totalCoinsMessage);
                } else if (numberOne == 4) {
                    addedCoins = 10;
                    currentCoins = currentCoins + addedCoins;
                    System.out.println(winningMessage);
                    System.out.println(totalCoinsMessage);
                }
            } else if (choice == 0) {
                endingCoins = currentCoins;
                System.out.println("Thank you for playing!");
                System.out.println("Total coins left: " + endingCoins);
                System.out.println("Game has been ended.");
                continueGame = false;
            } else {
                System.out.println("Invalid entry. Please try again.");
                continueGame = false;
            }

        }
    }
}
