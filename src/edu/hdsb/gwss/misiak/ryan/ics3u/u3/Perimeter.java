/*
 * Name: Perimeter
 * Date: March 2, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Descrption: This program gives the area and perimeter of a rectangle given the user's input.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputLength = new Scanner( System.in );
        Scanner inputWidth = new Scanner( System.in );
        
        System.out.println("Please Type a Length");
        
        int l = inputLength.nextInt();
        
        System.out.println("Please Type a Width");
        
        int w = inputWidth.nextInt();
        int area = l*w;
        int perimeter = (2*l) + (2*w);
        
        System.out.println("The Perimeter Is: " + perimeter);
        System.out.println("The Area Is: " + area);
    }
    
}
