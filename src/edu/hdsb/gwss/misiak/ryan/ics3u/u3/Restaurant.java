/*
 * Name: Restaurant
 * Date: February 27, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Descrption: This program is designed to calculate the total tax from a 
restaurant bill, then add that tax to the bill to get the total paid.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please Print Your Total Bill");
        
        double billTotal = input.nextDouble();
        double HST = 0.13;
        double totalTax = HST * billTotal;
        double billPlusTax = totalTax + billTotal;
        System.out.println("Total Tax: " + "$" + billTotal + " x " + "0.13 " + "= " +  "$" + totalTax);
        System.out.println("Total Paid: " + "$" + billTotal + " + " + "$" + totalTax + "= " + "$" + billPlusTax);
    }
    
}
