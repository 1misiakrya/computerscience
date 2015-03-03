/*
 * Name: Days To Hours
 * Date: March 2, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Descrption: This program takes an input of days and converts it to hours.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class DaysToHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Please type a number: ");
        
        Scanner inputHours = new Scanner (System.in);
        
        int startingHours = inputHours.nextInt();
        int days = startingHours/24;
        int hoursRemaining = (startingHours -(days*24));
        
        System.out.println("Conversion to days + hours:");
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hoursRemaining);
        
    }
    
}
