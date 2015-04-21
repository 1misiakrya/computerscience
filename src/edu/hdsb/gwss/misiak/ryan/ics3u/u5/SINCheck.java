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

    //Declaring global variables
    public static String socialInsuranceNumber;
    public static int totalEvenAddition = 0;
    public static int totalOddAddition = 0;

    public static void main(String[] args) {

        //Introduction to the program for the user.
        System.out.println("Social Insurance Number");

        System.out.println("In Canada, each person is uniquely identified by the Government with a Social "
                + "Insurance \nNumber (SIN). A Social Insurance Number consists of nine digits. The first eight "
                + "numbers are \nassigned digits and the last number is a digit check. This program determines "
                + "if the check \ndigit for a SIN is correct.");

        System.out.println("Enter Social Insurance Number: ");

        Scanner inputSIN = new Scanner(System.in);

        socialInsuranceNumber = inputSIN.nextLine();

        evenDigitMultiplier();
        oddDigitAddition();
        System.out.println(totalEvenAddition);
        System.out.println(totalOddAddition);
    }

    public static void evenDigitMultiplier() {

        //Multiplying all numbers found in even numbered columns by 2
        int a;

        for (int i = 1; i < socialInsuranceNumber.length(); i += 2) {
            a = socialInsuranceNumber.charAt(i) * 2;
            totalEvenAddition = totalEvenAddition + a;
        }

    }

    public static void oddDigitAddition() {

        //Adding up the odd numbers
        int b;

        for (int i = 0; i < socialInsuranceNumber.length(); i += 2) {
            b = socialInsuranceNumber.charAt(i);
            totalOddAddition = totalOddAddition + b;
        }

    }

    public static void grandTotal() {
        
        
        
    }

    public static void subtraction() {

    }

}
