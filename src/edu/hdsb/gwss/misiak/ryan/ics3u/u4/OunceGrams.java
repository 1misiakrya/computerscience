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
        
        //Explanations
        System.out.println("Ounce to Grams Conversion Chart");
        
        System.out.println("This program will print out a titled table that can be used to convert ounces to grams,\n" +
"for values from 1 to 15. (1 ounce = 28.35 grams).");
        
        System.out.format("0%s", "10%s", "Ounces", "Grams");
        
        int ounces = 1;
        double grams = (ounces*28.35);
        
        
        while (ounces<15){
            
            System.out.println("");
            ounces = ounces+1;
        }
        
    }
    
}
