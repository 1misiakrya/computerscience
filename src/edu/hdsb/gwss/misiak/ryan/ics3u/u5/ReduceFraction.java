/*
 * Name: ReduceFraction
 * Date: April 23, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program reduces a given fraction into its lowest terms.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Reduce Fraction \nThe program will reduce a fraction to its lowest terms.");

        System.out.println("Enter the Numerator: ");

        Scanner inputNumerator = new Scanner(System.in);

        System.out.println("Enter the Denominator: ");

        Scanner inputDenominator = new Scanner(System.in);

        double numerator = inputNumerator.nextInt();
        double denominator = inputDenominator.nextInt();

        for (int i = 2; i < numerator && i < denominator; i++) {
            

            
        }

    }

}
