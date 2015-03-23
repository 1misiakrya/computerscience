/*
 * Name: Arithmetic
 * Date: February 27, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program was created to complete simple arithmetic problems.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 13;
        int b = 8;
        System.out.println("The sum of the two integers is: " + (a+b));
        System.out.println("The difference of the two integers is: " + (a-b));
        System.out.println("The product of the two integers is: " + (a*b));
        System.out.println("The modulus of the two integers is: " + (a%b));
    }
    
}
