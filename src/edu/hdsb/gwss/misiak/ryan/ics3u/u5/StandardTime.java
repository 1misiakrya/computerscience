/*
 * Name: StandardTime
 * Date: April 20, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program converts standard time to traditional time.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Asking the user to choose to convert to traditional or standard time 
        System.out.println("Enter 1 to convert to Traditional time. Enter 2 to convert to Standard time: ");
        Scanner inputChoice = new Scanner(System.in);

        int choice = Integer.parseInt(inputChoice.nextLine());

        //Method choosing based on what the user inputted
        if (choice > 2 || choice < 1) {
            System.out.println("Error - Invalid Entry");
        } else if (choice == 1) {
            System.out.println("Please enter a Standard Time (hh:mm): ");
            Scanner inputStandardTime = new Scanner(System.in);
            convertToTraditional(inputStandardTime.nextLine());
        } else {
            System.out.println("Please enter a Traditional Time (hh:mm xx): ");
            Scanner inputTraditionalTime = new Scanner(System.in);
            convertToStandard(inputTraditionalTime.nextLine());
        }

    }

    public static void convertToTraditional(String givenStandardTime) {

        //Checking that the user's input is in the correct format
        if (givenStandardTime.length() == 5) {

            //Declaring variables
            String timeOfDay = "AM";
            int hours = Integer.parseInt(givenStandardTime.substring(0, 2));
            int minutes = Integer.parseInt(givenStandardTime.substring(3));

            //OUTPUT for converting to traditional
            if (hours >= 24 || hours < 0 || minutes < 0 || minutes > 59) {
                System.out.println("Error - Incorrect Entry. Please try again!");
            } else {
                if (hours == 0) {
                    hours = 12;
                } else if (hours > 12) {
                    hours = hours - 12;
                }
                if (hours > 12 || hours == 12) {
                    timeOfDay = "PM";
                }
                if (minutes < 10) {
                    System.out.print("Your time in Traditional Time: " + hours + ":" + "0" + minutes + timeOfDay);
                } else {
                    System.out.print("Your time in Traditional Time: " + hours + ":" + minutes + timeOfDay);
                }
            }
        } else {
            System.out.println("Error - Your entry was incorrect. Format should be: (hh:mm).");
        }
    }

    public static void convertToStandard(String givenTraditionalTime) {

        //Checking that the user's input is in the correct format
        if (givenTraditionalTime.length() > 8 || givenTraditionalTime.length() < 7) {
            System.out.println("Error - Your entry was incorrect. Format should be: (hh:mm xx)");
        } else {

            //Declaring variables
            String timeOfDay = givenTraditionalTime.substring(5, 7);
            int colonLocation = givenTraditionalTime.indexOf(":");
            int hours = Integer.parseInt(givenTraditionalTime.substring(0, colonLocation));
            int minutes = Integer.parseInt(givenTraditionalTime.substring(colonLocation + 1, colonLocation + 3));

            //OUTPUT for converting to standard
            if (hours > 12 || hours < 0 || minutes > 59 || minutes < 0) {
                System.out.println("Error. Invalid entry. Please try again!");
            } else {
                if (hours == 0) {
                    hours = hours + 12;
                } else if (hours == 12) {
                    hours = 0;
                }
                if (timeOfDay.equals("PM")) {
                    if (hours < 12) {
                        hours = hours + 12;
                    }
                }
                System.out.print("Your time in Standard Time: ");
                if (hours < 10) {
                    System.out.print("0" + hours + ":");
                } else {
                    System.out.print(hours + ":");
                }
                if (minutes < 10) {
                    System.out.print("0");
                }
                System.out.print(minutes);
            }
        }
    }
}
