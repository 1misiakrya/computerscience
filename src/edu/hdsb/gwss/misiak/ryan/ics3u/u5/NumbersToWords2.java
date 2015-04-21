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
public class NumbersToWords2 {

    //Declaring global variables
    public static String numberString;
    public static int hundreds;
    public static int tens;
    public static int ones;
    public static int teens;
    public static double number;

    public static void main(String[] args) {

        //Getting user's input
        System.out.println("Enter a three-digit number (use 0 as a place holder): ");

        Scanner inputNumber = new Scanner(System.in);
        numberString = inputNumber.nextLine();

        //Checking that user's input works in the program
        if (number > 999 || number < 0 || (numberString.length()) < 3 || (numberString.length() > 3)) {
            System.out.println("Invalid entry.");
        } else {
            
            //Running the other methods
            hundreds();

            tens();

            ones();

            teens();
        }
    }

    public static void hundreds() {

        //Finding the digit in the hundreds column
        number = Integer.parseInt(numberString);
        hundreds = (int) number / 100;

        //OUTPUT for hundreds column
        if (hundreds == 1) {
            System.out.print("ONE HUNDRED ");
        } else if (hundreds == 2) {
            System.out.print("TWO HUNDRED ");
        } else if (hundreds == 3) {
            System.out.print("THREE HUNDRED ");
        } else if (hundreds == 4) {
            System.out.print("FOUR HUNDRED ");
        } else if (hundreds == 5) {
            System.out.print("FIVE HUNDRED ");
        } else if (hundreds == 6) {
            System.out.print("SIX HUNDRED ");
        } else if (hundreds == 7) {
            System.out.print("SEVEN HUNDRED ");
        } else if (hundreds == 8) {
            System.out.print("EIGHT HUNDRED ");
        } else if (hundreds == 9) {
            System.out.print("NINE HUNDRED ");
        }
    }

    public static void tens() {

        //Finding the digit in the tens column
        tens = (int) (number / 10) % 10;

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

        //Finding the digit in the ones column
        int checkingHundreds = (int) number/100;
        ones = (int) number % 10;

        //OUTPUT for ones column
        if (number-(checkingHundreds*100) < 10 || (number-checkingHundreds*100) > 19) {
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

        //Checking to see if the user's number is in the teens
        int hundredsDigit = (int )number/100;
        teens = (int) number-(hundredsDigit*100);
        
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