/*
 * Name: NumbersToWords
 * Date: April 17, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program converts three digit numbers given by the user into the english word that goes with them.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class NumbersToWords3 {

    //Declaring global variables
    public static String numberString;
    public static int hundreds;
    public static int tens;
    public static int ones;
    public static int teens;
    public static int digit;
    public static double number;
    public static String message;
    public static int checkingHundreds;

    public static void main(String[] args) {

        //Getting user's input
        System.out.println("Enter a number: ");

        Scanner inputNumber = new Scanner(System.in);
        numberString = inputNumber.nextLine();

        //Checking that user's input works in the program
        number = Integer.parseInt(numberString);

        if (number > 999 || number < 0 || (numberString.length() > 3)) {
            System.out.println("Invalid entry.");
        } else {

            //Running the other methods
            for (int i = 0; i < numberString.length(); i++) {
                digit = Integer.parseInt("" + numberString.charAt(i));
                if (digit == 0) {

                    hundreds = (int) number / 100;

                    hundreds();

                } else if (digit == 1) {
                    tens = (int) (number / 10) % 10;
                    tens();
                    teens();
                    System.out.print(message);
                } else if (digit == 2) {
                    checkingHundreds = (int) number / 100;
                    ones = (int) number % 10;
                    ones();
                    System.out.print(message);

                }
            }
        }
    }

    public static void hundreds() {

        //Finding the digit in the hundreds column
        ones();
        System.out.print(message + "HUNDRED");
    }

    public static void tens() {

        //Finding the digit in the tens column
        //OUTPUT for tens column
        if (20 < number) {
            if (tens == 2) {
                message = "TWENTY ";
            } else if (tens == 3) {
                message = "THIRTY ";
            } else if (tens == 4) {
                message = "FORTY ";
            } else if (tens == 5) {
                message = "FIFTY ";
            } else if (tens == 6) {
                message = "SIXTY ";
            } else if (tens == 7) {
                message = "SEVENTY ";
            } else if (tens == 8) {
                message = "EIGHTY ";
            } else if (tens == 9) {
                message = "NINETY ";
            }

        }

    }

    public static void ones() {

        //Finding the digit in the ones column
        //OUTPUT for ones column
        if (digit == 1) {
            message = "ONE ";
        } else if (digit == 2) {
            message = "TWO ";
        } else if (digit == 3) {
            message = "THREE ";
        } else if (digit == 4) {
            message = "FOUR ";
        } else if (digit == 5) {
            message = "FIVE ";
        } else if (digit == 6) {
            message = "SIX ";
        } else if (digit == 7) {
            message = "SEVEN ";
        } else if (digit == 8) {
            message = "EIGHT ";
        } else if (digit == 9) {
            message = "NINE ";
        }

    }

    public static void teens() {

        //Checking to see if the user's number is in the teens
        int hundredsDigit = (int) number / 100;
        teens = (int) number - (hundredsDigit * 100);

        //OUTPUT for if the digits are in the teens
        if (teens > 9 && teens < 20) {
            if (teens == 10) {
                System.out.println("TEN");
            } else if (teens == 11) {
                System.out.println("ELEVEN");
            } else if (teens == 12) {
                System.out.println("TWELVE");
            } else if (teens == 13) {
                System.out.println("THIRTEEN");
            } else if (teens == 14) {
                System.out.println("FOURTEEN");
            } else if (teens == 15) {
                System.out.println("FIFTEEN");
            } else if (teens == 16) {
                System.out.println("SIXTEEN");
            } else if (teens == 17) {
                System.out.println("SEVENTEEN");
            } else if (teens == 18) {
                System.out.println("EIGHTEEN");
            } else {
                System.out.println("NINETEEN");
            }
        }
    }
}
