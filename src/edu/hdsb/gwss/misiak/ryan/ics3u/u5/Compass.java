/*
 * Name: Compass
 * Date: April 20, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program gets the user's inputted direction and converts it to a sentence with the
directions.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Compass {

    //Delcaring global variables
    public static char startingDirectionLetter;
    public static char endingDirectionLetter;

    public static int lengthOfInput;

    public static String startingDirectionWord;
    public static String givenAngle;
    public static String endingDirectionWord;
    public static String userInput;

    public static void main(String[] args) {

        //Introduction to program
        System.out.println("Compass Directions");

        System.out.println("Compass directions are written in the following form: S45W. This "
                + "indicates \nthat the direction is determined by facing SOUTH and then turning "
                + "45 \ndegrees towards the WEST. This program has the user enter a compass direction \n"
                + "and then prints a message.");

        //Getting user's input
        System.out.println("Enter Direction: ");

        Scanner inputDirection = new Scanner(System.in);

        userInput = inputDirection.nextLine();
        userInput = userInput.toUpperCase();

        //Running methods
        startingDirection();
        angle();
        endingDirection();

        //FINAL OUTPUT
        System.out.println("Start facing " + startingDirectionWord + " Turn " + givenAngle + " degrees towards the " + endingDirectionWord);

    }

    public static void startingDirection() {

        //Finding startDirection
        startingDirectionLetter = userInput.charAt(0);
        
        //Converting startDirectionLetter into a word
        if (startingDirectionLetter == 'N') {
            startingDirectionWord = "NORTH";
        } else if (startingDirectionLetter == 'S') {
            startingDirectionWord = "SOUTH";
        } else if (startingDirectionLetter == 'W') {
            startingDirectionWord = "WEST";
        } else if (startingDirectionLetter == 'E') {
            startingDirectionWord = "EAST";
        } else {
            System.out.println("Error");
            startingDirectionWord = " ";
        }

    }

    public static void angle() {

        //Getting the angle
        lengthOfInput = userInput.length();

        //OUTPUT to find the angle, and finding endingDirectionLetter as well
        if (lengthOfInput < 2 || lengthOfInput > 5) {
            System.out.println("Error. Invalid Entry.");
            givenAngle = " ";
            endingDirectionLetter = userInput.charAt(6);
        } else if (lengthOfInput == 3) {
            givenAngle = userInput.substring(1, 2);
            endingDirectionLetter = userInput.charAt(2);
        } else if (lengthOfInput == 4) {
            givenAngle = userInput.substring(1, 3);
            endingDirectionLetter = userInput.charAt(3);
        } else {
            givenAngle = userInput.substring(1, 4);
            endingDirectionLetter = userInput.charAt(4);
        }

    }

    public static void endingDirection() {

        //OUTPUT to spell out endingDirection
        if (endingDirectionLetter == 'N') {
            endingDirectionWord = "NORTH";
        } else if (endingDirectionLetter == 'S') {
            endingDirectionWord = "SOUTH";
        } else if (endingDirectionLetter == 'W') {
            endingDirectionWord = "WEST";
        } else if (endingDirectionLetter == 'E') {
            endingDirectionWord = "EAST";
        } else {
            System.out.println("Error");
            endingDirectionWord = " ";
        }

    }
}
