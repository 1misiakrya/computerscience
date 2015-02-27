/*
 * Name: Arithmetic
 * Date: February 27, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Descrption:
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
        
        Scanner input = new Scanner( System.in );
        
        System.out.println("Please Type a Number");
        
        int l = input.nextInt();
        int w = 6;
        int area = l*w;
        int perimeter = (2*l) + (2*w);
        
        System.out.println("The Perimeter Is: " + perimeter);
        System.out.println("The Area Is: " + area);
    }
    
}
