/*
 * Name: OrderChecker
 * Date: March 13, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program verifies that the number of tools match the necessary amounts.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter the number of bolts: ");
        
        Scanner inputNumberOfBolts = new Scanner (System.in);
        int numberOfBolts = inputNumberOfBolts.nextInt();
        
        System.out.println("Please enter the number of nuts: ");
        
        Scanner inputNumberOfNuts = new Scanner (System.in);
        int numberOfNuts = inputNumberOfNuts.nextInt();
            
        System.out.println("Please enter the number of washers: ");
        
        Scanner inputNumberOfWashers = new Scanner (System.in);
        int numberOfWashers = inputNumberOfWashers.nextInt();
        
        boolean correctNumberOf = false;
        
        if ((numberOfNuts >= numberOfBolts) && (numberOfWashers >= 2*numberOfBolts)){
                correctNumberOf = true;
                };
    }
    
}
