/*
 * Name: OunceGrams
 * Date: April 1, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program will print out a titled table that can be used to convert ounces to grams,
 for values from 1 to 15. (1 ounce = 28.35 grams).
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u4;

/**
 *
 * @author 1misiakrya
 */
public class OunceGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Title & explanation of program for user
        System.out.println("Ounce to Grams Conversion Chart");

        System.out.println("This program will print out a titled table that can be used to convert ounces to grams,\n"
                + "for values from 1 to 15. (1 ounce = 28.35 grams).");

        //Declaring the variable.
        final double GRAMS_IN_OUNCE = 28.35;
        
        //OUTPUT
        System.out.format("%6s %10s\n", "Ounces", "Grams");

        for (int ounces = 1; ounces <= 15; ounces += 1) {
            System.out.format("%6s %10.2f\n", ounces, (ounces * GRAMS_IN_OUNCE));
        }

    }

}
