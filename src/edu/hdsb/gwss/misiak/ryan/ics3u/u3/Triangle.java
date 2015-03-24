/*
 * Name: Triangle
 * Date: March 24, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program asks the user for 3 side lengths, and check to see if they could properly create a triangle.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Three numbers represent the sides of a triangle when"
                + " the sum of any two sides is greater than the third side.  "
                + "This program has the user enter three lengths of sides and "
                + "determines whether the figure is a triangle or not.");

        System.out.println("Enter Length of Side 1: ");

        Scanner inputSideA = new Scanner(System.in);

        System.out.println("Enter Length of Side 2: ");

        Scanner inputSideB = new Scanner(System.in);

        System.out.println("Enter Length of Side 3: ");

        Scanner inputSideC = new Scanner(System.in);

        double sideA = inputSideA.nextDouble();
        double sideB = inputSideB.nextDouble();
        double sideC = inputSideC.nextDouble();
        
        // SWAP
        if( sideA > sideB ) {
            sideB = sideA;
        }
        
        //
        if( sideB > sideC ) {
           
        }

        if ((sideA < 0) || (sideB < 0) || (sideC < 0)) {
            System.out.println("One of the numbers given is below zero, therefore"
                    + " it is not a triangle.");
        } else if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)) {
            System.out.println("These sides can make a triangle.");
        } else {
            System.out.println("These sides cannot make a triangle.");
        }
        
    }
}
