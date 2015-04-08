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
        int currentCoins;
        Boolean continueGame = true;

        final int numOfValues = 4;

        for (int count = 0; count == count; count += 1) {
            if (continueGame) {
                System.out.print("To play again, click 1. To end the game, click 0: ");

                Scanner inputChoice = new Scanner(System.in);
                int Choice = inputChoice.nextInt();

                if (Choice == 1) {
                    currentCoins = startingCoins - 1;
                    int numberOne = (int) (Math.random() * numOfValues + 1);
                    int numberTwo = (int) (Math.random() * numOfValues + 1);
                    int numberThree = (int) (Math.random() * numOfValues + 1);
                    if ((numberOne == 1) && (numberTwo == 1) && (numberThree == 1)) {
                        currentCoins = currentCoins + 4;
                        System.out.println("You won: " + currentCoins);
                    }else if((numberOne == 2) && (numberTwo == 2) && (numberThree == 2)){
                        currentCoins = currentCoins + 6;
                        System.out.println("You won: " + currentCoins);
                    }else if ((numberOne == 3) && (numberTwo == 3) && (numberThree == 3)){
                        currentCoins = currentCoins + 8;
                        System.out.println("You won: " + currentCoins);
                    }else if((numberOne == 4) && (numberTwo == 4) && (numberThree == 4)){
                        currentCoins = currentCoins + 10;
                        System.out.println("You won: " + currentCoins);
                    }else{
                        System.out.println("Sorry, you did not win anything :(");
                    }   
                    System.out.format("%2s %3s %2s %3s %2s \n", numberOne, " ", numberTwo, " ", numberThree);
                    continueGame = true;
                } else if (Choice == 0) {
                    continueGame = false;
                    endingCoins = startingCoins;
                    System.out.println("Thank you for playing! See you soon!");
                    System.out.println("Total coins left: " + endingCoins);
                } else {
                    System.out.println("Invalid entry. Please try again.");
                }
            } else {
                System.out.println("Game has been ended.");
            }
        }
    }
}
