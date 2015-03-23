/*
 * Name: HeronFormula
 * Date: March 2, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program gives the area of a triangle using Heron's Formula, based off of the user's input.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class HeronFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputSideOne = new Scanner (System.in);
        Scanner inputSideTwo = new Scanner (System.in);
        Scanner inputSideThree = new Scanner (System.in);
        
        System.out.println("Please enter the length of the first side: ");
        
        double a = inputSideOne.nextDouble();
        
        System.out.println("Please enter the length of the second side: ");
        
        double b = inputSideTwo.nextDouble();
        
        System.out.println("Please enter the length of the third side: ");
        
        double c = inputSideThree.nextDouble();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("The area is: " + area);
        
    }
    
}
