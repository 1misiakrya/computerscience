/*
 * Name: Cosine Law
 * Date: March 2, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Descrption: Calculates cosine law for the user when two sides and one angle are inputed.
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
        double sideOneLength = inputSideOne.nextDouble();
        
        System.out.println("Please enter a second side length for the triangle: ");
        
        Scanner inputSideTwo = new Scanner (System.in);
        double sideTwoLength = inputSideTwo.nextDouble();
        
        System.out.println("Please enter an angle: ");
        
        Scanner inputAngle = new Scanner (System.in);
        
        double angle = inputAngle.nextDouble();
        double cosineLaw = Math.sqrt(Math.pow(sideOneLength,2) + Math.pow(sideTwoLength,2) -(2*sideOneLength*sideTwoLength*Math.cos(angle)));
        double sideThreeLength = cosineLaw;
        
        System.out.println("The length of the third side is: " + sideThreeLength);
        
    }
    
}
