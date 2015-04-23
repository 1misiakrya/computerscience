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

        System.out.println("Enter Social Insurance Number: ");

        Scanner inputSIN = new Scanner(System.in);

        String socialInsuranceNumber = inputSIN.nextLine();
        int totalDigitTestEven = 0;
        int sumOfEvenNumbers = 0;
        int totalDigitTestOdd = 0;
        double totalSum;
        boolean correctSIN = false;

        if (socialInsuranceNumber.length() != 9) {
            System.out.println("Error. Incorrect amount of digits entered.");
        } else {
            for (int i = 0; i < 8; i++) {
                if ((i % 2) == 1) {
                    totalDigitTestEven = totalDigitTestEven + (Integer.parseInt("" + socialInsuranceNumber.charAt(i)) * 2);
                    System.out.println(totalDigitTestEven);
                    if (Integer.parseInt("" + socialInsuranceNumber.charAt(i) * 2) > 10) {
                        sumOfEvenNumbers = (int) (((Integer.parseInt("" + socialInsuranceNumber.charAt(i) * 2) % 10)) + ((Integer.parseInt("" + socialInsuranceNumber.charAt(i) * 2) / 10)));
                    }
                    sumOfEvenNumbers = sumOfEvenNumbers + totalDigitTestEven;
                    totalDigitTestEven = 0;
                } else if ((i % 2) == 0) {
                    totalDigitTestOdd = totalDigitTestOdd + (Integer.parseInt("" + socialInsuranceNumber.charAt(i)));

                }

            }

            totalSum = sumOfEvenNumbers + totalDigitTestOdd;
            if ((Integer.parseInt("" + socialInsuranceNumber.charAt(8)) == (double) (Math.ceil(totalSum / 10) * 10) - totalSum)) {

                correctSIN = true;
            }
        }

        if (correctSIN) {
            System.out.println("The Check Digit of the SIN is correct.");
        } else {
            System.out.println("The Check Digit of the SIN is incorrect.");
        }
        System.out.println(sumOfEvenNumbers);
        System.out.println(totalDigitTestOdd);
    }
}
