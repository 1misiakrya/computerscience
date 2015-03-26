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

        //I nformation about triangles
        System.out.println("Three numbers represent the sides of a triangle when"
                + " the sum of any two sides is greater than the third side.  "
                + "This program has the user enter three lengths of sides and "
                + "determines whether the figure is a triangle or not.");

        // User inputs lengths of sides 1, 2, & 3.
        System.out.println("Enter Length of Side 1: ");

        Scanner inputSideA = new Scanner(System.in);
        double sideA = inputSideA.nextDouble();
        
        System.out.println("Enter Length of Side 2: ");

        Scanner inputSideB = new Scanner(System.in);
        double sideB = inputSideB.nextDouble();
        
        System.out.println("Enter Length of Side 3: ");

        Scanner inputSideC = new Scanner(System.in);
        double sideC = inputSideC.nextDouble();
        
        double tmp = 0;

        // SWAP
        if (sideA > sideB) {
            tmp = sideB;
            sideB = sideA;
            sideA = tmp;
        }

        // SWAP #2
        if (sideB > sideC) {
            tmp = sideC;
            sideC = sideB;
            sideB = tmp;
        }

        // Checking to see if the side lengths make a triangle.
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
