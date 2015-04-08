/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int gameCount = 1;
        Boolean continueGame = true;

        final int numOfValues = 4;
        if (continueGame = true) {
            for (int count = 0; count == count; count += 1) {

                System.out.println("Game " + gameCount);
                System.out.print("\nTo play again, click 1. To end the game, click 0: ");

                Scanner inputChoice = new Scanner(System.in);
                int Choice = inputChoice.nextInt();

                if (Choice == 1) {

                    currentCoins = currentCoins - 1;
                    int numberOne = (int) (Math.random() * numOfValues + 1);
                    int numberTwo = (int) (Math.random() * numOfValues + 1);
                    int numberThree = (int) (Math.random() * numOfValues + 1);
                    int addedCoins;

                    System.out.format("%2s %3s %2s %3s %2s \n", numberOne, " ", numberTwo, " ", numberThree);
                    continueGame = true;
                    if ((numberOne == 1) && (numberTwo == 1) && (numberThree == 1)) {
                        gameCount = gameCount + 1;
                        addedCoins = 4;
                        currentCoins = currentCoins + addedCoins;
                        System.out.println("\nYou won: " + addedCoins + " coins");
                        System.out.println("You now have " + (currentCoins + addedCoins) + " coins. \n");
                    } else if ((numberOne == 2) && (numberTwo == 2) && (numberThree == 2)) {
                        gameCount = gameCount + 1;
                        addedCoins = 6;
                        currentCoins = currentCoins + addedCoins;
                        System.out.println("\nYou won: " + addedCoins + " coins");
                        System.out.println("You now have " + (currentCoins + addedCoins) + " coins. \n");
                    } else if ((numberOne == 3) && (numberTwo == 3) && (numberThree == 3)) {
                        gameCount = gameCount + 1;
                        addedCoins = 8;
                        currentCoins = currentCoins + addedCoins;
                        System.out.println("\nYou won: " + addedCoins + " coins");
                        System.out.println("You now have " + (currentCoins + addedCoins) + " coins. \n");
                    } else if ((numberOne == 4) && (numberTwo == 4) && (numberThree == 4)) {
                        gameCount = gameCount + 1;
                        addedCoins = 10;
                        currentCoins = currentCoins + addedCoins;
                        System.out.println("\nYou won: " + addedCoins + " coins");
                        System.out.println("You now have " + (currentCoins + addedCoins) + " coins. \n");
                    } else {
                        gameCount = gameCount + 1;
                        System.out.println("\nSorry, you did not win anything :(");
                        System.out.println("You now have " + currentCoins + " coins. \n");
                    }
                } else if (Choice == 0) {
                    continueGame = false;
                    endingCoins = startingCoins;
                    System.out.println("Thank you for playing! See you soon!");
                    System.out.println("Total coins left: " + endingCoins);
                } else {
                    System.out.println("Invalid entry. Please try again.");
                }
            }
        } else {
            System.out.println("Game has been ended.");
        }
    }
}
