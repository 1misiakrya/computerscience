/*
 * Name: NumbersToWords
 * Date: April 17, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program converts two digit numbers given by the user into the english word that goes with them.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class NumbersToWords {

    //Declaring global variables
    public static String numberString;
    public static int tens;
    public static int ones;
    public static double number;

    public static void main(String[] args) {

        //Getting user's input
        System.out.println("Enter a two-digit number (use 0 as a place holder): ");

        Scanner inputNumber = new Scanner(System.in);
        numberString = inputNumber.nextLine();

        //Checking that user's input works with the program
        if (number > 99 || number < 0 || (numberString.length()) < 2 || (numberString.length() > 2)) {
            System.out.println("Invalid entry.");
        } else {

            //Running other methods
            tens();

            ones();

            teens();
        }
    }

    public static void tens() {

        //Finding digit in tens column
        number = Integer.parseInt(numberString);
        tens = (int) number / 10;

        //OUTPUT for tens column
        if (20 < number) {
            if (tens == 2) {
                System.out.print("TWENTY ");
            } else if (tens == 3) {
                System.out.print("THIRTY ");
            } else if (tens == 4) {
                System.out.print("FORTY ");
            } else if (tens == 5) {
                System.out.print("FIFTY ");
            } else if (tens == 6) {
                System.out.print("SIXTY ");
            } else if (tens == 7) {
                System.out.print("SEVENTY ");
            } else if (tens == 8) {
                System.out.print("EIGHTY ");
            } else if (tens == 9) {
                System.out.print("NINETY ");
            }

        }

    }

    public static void ones() {

        //Finding digit in ones column
        ones = (int) number % 10;

        //OUTPUT for ones column
        if (number < 10 || number > 19) {
            if (ones == 1) {
                System.out.print("ONE");
            } else if (ones == 2) {
                System.out.print("TWO");
            } else if (ones == 3) {
                System.out.print("THREE");
            } else if (ones == 4) {
                System.out.print("FOUR");
            } else if (ones == 5) {
                System.out.print("FIVE");
            } else if (ones == 6) {
                System.out.print("SIX");
            } else if (ones == 7) {
                System.out.print("SEVEN");
            } else if (ones == 8) {
                System.out.print("EIGHT");
            } else if (ones == 9) {
                System.out.print("NINE");
            }
        }
    }

    public static void teens() {

        //OUTPUT of teens
        if (number > 9 && number < 20) {
            if (number == 10) {
                System.out.println("TEN");
            } else if (number == 11) {
                System.out.println("ELEVEN");
            } else if (number == 12) {
                System.out.println("TWELVE");
            } else if (number == 13) {
                System.out.println("THIRTEEN");
            } else if (number == 14) {
                System.out.println("FOURTEEN");
            } else if (number == 15) {
                System.out.println("FIFTEEN");
            } else if (number == 16) {
                System.out.println("SIXTEEN");
            } else if (number == 17) {
                System.out.println("SEVENTEEN");
            } else if (number == 18) {
                System.out.println("EIGHTEEN");
            } else {
                System.out.println("NINETEEN");
            }
        }
    }
}
