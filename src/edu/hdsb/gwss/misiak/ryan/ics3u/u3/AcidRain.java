/*
 * Name: AcidRain
 * Date: March 23, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program notifies the user if the water in the river near them is either 
too acidic or basic for fish to live in, or just right.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Acid Rain");
        System.out.println("Acid Rain is an environmental problem. This program determines if the pH level in water is safe for fish.");
        
        System.out.println("Enter a pH level: ");
        
        Scanner inputPH = new Scanner (System.in);
        
        int pH = inputPH.nextInt();
        
        // pH
        if (pH>14 || pH<0){
            System.out.println("Error - not a valid value.");
        }
        else if (pH>7.5){
            System.out.println("TOO BASIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        }
        else if (pH<6.5){
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        }
        else {
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        }
            
            
    }
    
}
