/*
 * Name: SINCheck
 * Date: April 20, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program determines if the check digit for a SIN is correct.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class SINCheck {

    public static void main(String[] args) {

        //Introduction to the program for the user.
        System.out.println("Social Insurance Number");

        System.out.println("In Canada, each person is uniquely identified by the Government with a Social "
                + "Insurance \nNumber (SIN). A Social Insurance Number consists of nine digits. The first eight "
                + "numbers are \nassigned digits and the last number is a digit check. This program determines "
                + "if the check \ndigit for a SIN is correct.");

        //Getting user's inputted SIN number
        System.out.println("Enter Social Insurance Number: ");

        Scanner inputSIN = new Scanner(System.in);

        //Declaring Variables
        String socialInsuranceNumber = inputSIN.nextLine();
        int sumOfEvenNumbers = 0;
        int totalDigitTestOdd = 0;
        double totalSum;
        boolean correctSIN = false;

        //Calculating using the social insurance number to check if it is correct
        if (socialInsuranceNumber.length() != 9) {
            System.out.println("Error. Incorrect amount of digits entered.");
        } else {
            int value;
            for (int i = 0; i < 8; i++) {
                value = Integer.parseInt("" + socialInsuranceNumber.charAt(i));
                if ((i % 2) == 1) {
                    value = value * 2;
                    sumOfEvenNumbers = sumOfEvenNumbers + (value / 10) + (value % 10);
                    System.out.println(sumOfEvenNumbers);
                } else if ((i % 2) == 0) {
                    totalDigitTestOdd = totalDigitTestOdd + value;
                }
            }

            totalSum = sumOfEvenNumbers + totalDigitTestOdd;
            if ((Integer.parseInt("" + socialInsuranceNumber.charAt(8)) == (double) (Math.ceil(totalSum / 10) * 10) - totalSum)) {
                correctSIN = true;
            }
        }

        //OUTPUT
        if (correctSIN) {
            System.out.println("The Check Digit of the SIN is correct.");
        } else {
            System.out.println("The Check Digit of the SIN is incorrect.");
        }
    }
}
