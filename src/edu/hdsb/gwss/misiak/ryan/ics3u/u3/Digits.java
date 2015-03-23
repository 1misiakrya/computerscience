/*
 * Name: Digits
 * Date: March 2, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program takes the values of the digits in a three digit number.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputNumber = new Scanner (System.in);
        
        System.out.println("Enter a three digit number: ");
        
        int numberGiven = inputNumber.nextInt();
        
        System.out.println("The Hundredth Place Digit is: " + (numberGiven)/100);
        System.out.println("The Tens Place Digit is: " + ((numberGiven)/10)%10);
        System.out.println("The Ones Place Digit is: " + (numberGiven)%10);
        
        
    }
    
}
