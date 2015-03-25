/*
 * Name: RightTriangle
 * Date: March 24, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program asks the user for 3 side lengths, and check to see if they could properly create a right triangle.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class RightTriangle {

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
        double tmp = 0;
        boolean triangle = false;

        // SWAP
        if (sideA > sideB) {
            tmp = sideB;
            sideB = sideA;
            sideA = tmp;
        }

        //
        if (sideB > sideC) {
            tmp = sideC;
            sideC = sideB;
            sideB = tmp;
        }

        // Checking that the side lengths make a triangle
        if ((sideA < 0) || (sideB < 0) || (sideC < 0)) {
            triangle = false;
        } else if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)) {
            triangle = true;
        } else {
            triangle = false;
        }
        
        // Checking that the side lengths make a right angle triangle
        if ((((Math.pow(sideA, 2)) + Math.pow(sideB, 2)) == Math.pow(sideC, 2)) && (triangle = true)){
            System.out.println("These sides will make a right triangle.");
        } else
            System.out.println("These sides will NOT make a right triangle.");
    }
    
}
