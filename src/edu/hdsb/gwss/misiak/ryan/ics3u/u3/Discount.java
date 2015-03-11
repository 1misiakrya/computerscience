/*
 * Name: Discount
 * Date: March 11, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Descrption: This program shows the user the discounted price of their purchases if the purchases are greater than $10.00.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Enter amount of purchases: ");
        
        Scanner inputPurchases = new Scanner (System.in);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        double totalPurchased = inputPurchases.nextDouble();
        double discounts = totalPurchased*0.10;
        
        if (totalPurchased >= 10.00){
            System.out.println( "Discounted Price: " + money.format(discounts));
        }
        else {
            System.out.println("Your purchases were not enough to be awarded a discount.");
        }        
       
        
    }
    
}
