/*
 * Name: Cosine Law
 * Date: March 2, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Descrption: 
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class CosineLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Please enter a side length for the triangle: ");
        
        Scanner inputSideOne = new Scanner (System.in);
        
        System.out.println("Please enter a second side length for the triangle: ");
        
        Scanner inputSideTwo = new Scanner (System.in);
        
        double sideOneLength = inputSideOne.nextDouble();
        double sideTwoLength = inputSideTwo.nextDouble();
        double cosineLaw = Math.sqrt((sideOneLength) + (sideTwoLength));
        double sideThreeLength = 0;
        
        System.out.println("The length of the third side is: " + sideThreeLength);
        
    }
    
}
