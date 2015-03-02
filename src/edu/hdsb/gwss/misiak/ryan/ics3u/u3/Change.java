/*
 * Name: Change
 * Date: February 27, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Descrption: This program gives the user the smallest amount of change needed for a certain value in cents.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputChange = new Scanner (System.in);
        
        System.out.println("Enter the Change in Cents: ");
        
        double change = inputChange.nextDouble();
        int numberOfQuarters = (int) (change/25);
        int numberOfDimes = (int) (change-(numberOfQuarters*25))/10;
        int numberOfNickels = (int) ((change-(numberOfQuarters*25)-(numberOfDimes*10)))/5;
        int numberOfPennies = (int) ((change-(numberOfQuarters*25)-(numberOfDimes*10)-(numberOfNickels*5)));
        
        System.out.println("Total number of quarters needed: " + numberOfQuarters);
        System.out.println("Total number of dimes needed: " + numberOfDimes);
        System.out.println("Total number of nickels needed: " + numberOfNickels);
        System.out.println("Total number of pennies needed: " + numberOfPennies);
        
    }
    
}
