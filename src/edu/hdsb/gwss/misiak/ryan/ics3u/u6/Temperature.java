/*
 * Name: Temperature
 * Date: April 30, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program 
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("This program records the daily maximum temperatures for a week. \n");
        System.out.println("Please enter the temperature for the following day: ");

        Scanner inputTemperature = new Scanner(System.in);
        String[] dayOfTheWeek = new String[7];
        int[] temperature = new int[7];

        dayOfTheWeek[0] = "Monday: ";
        dayOfTheWeek[1] = "Tuesday: ";
        dayOfTheWeek[2] = "Wednesday: ";
        dayOfTheWeek[3] = "Thursday: ";
        dayOfTheWeek[4] = "Friday: ";
        dayOfTheWeek[5] = "Saturday: ";
        dayOfTheWeek[6] = "Sunday: ";

        for (int i = 0; i < 7; i++) {
            System.out.print(dayOfTheWeek[i]);
            temperature[i] = inputTemperature.nextInt();
        }

        for (int i = 0; i < 18; i++) {
            System.out.println("Temperature for " + dayOfTheWeek[i] + temperature[i]);
        }

    }
}
