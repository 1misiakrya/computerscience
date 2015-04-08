/*
 * Name: FibonacciSeries
 * Date: April 1, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program will determine when the population of a group of animals in a lab will
 outgrow the lab's food supply.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Title & explanation of the program for user
        System.out.println("Lab Animals");

        System.out.println("At present there are X animals in a lab and enough food for Y animals. At \n"
                + "the end of every hour the population doubles, and enough food is added to \n"
                + "support Z more animals. During any hour, the animals will eat enough food for \n"
                + "only themselves. Use a loop to determine when the population will outgrow the \n"
                + "food supply.");

        System.out.format("%30s %7s %2s", "Enter the Initial Population (X) ", " ", ":\n");

        Scanner inputInitialPopulation = new Scanner(System.in);
        int initialPopulation = inputInitialPopulation.nextInt();

        System.out.format("%30s %7s %2s", "Enter the Initial Food Supply (Y)", " ", ":\n");

        Scanner inputInitialFoodSupply = new Scanner(System.in);
        int initialFoodSupply = inputInitialFoodSupply.nextInt();

        System.out.format("%41s %2s", "Enter the Amount of Food to Add Each Hour", ":\n");

        Scanner inputAddedFood = new Scanner(System.in);
        int addedFood = inputAddedFood.nextInt();

        System.out.format("%6s %12s %12s %12s %12s", "Hour | ", "Animals at Start | ", "Food at Start | ", "Food at End | ", "Animals at End | \n");
        int endingFoodSupply = 10;
        int hour = 0;

        for (int endingPopulation = 1; endingPopulation < endingFoodSupply; endingPopulation = (initialPopulation)) {
            hour = hour + 1;
            endingPopulation = initialPopulation * 2;
            endingFoodSupply = initialFoodSupply + addedFood - initialPopulation;
            System.out.format("%2s %15s %15s %15s %15s\n", hour, initialPopulation, initialFoodSupply, endingFoodSupply, endingPopulation);
            initialFoodSupply = endingFoodSupply;
            initialPopulation = endingPopulation;

        }

    }
}
