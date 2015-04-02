/*
 * Name: FibonacciSeries
 * Date: April 1, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program will print the first twenty terms of the Fibonacci Series.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u4;

/**
 *
 * @author RMisiak
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Title & explanation of the program for user
        System.out.println("Fibonacci Series");

        System.out.println("This program will print the first twenty terms of the Fibonacci Series.");

        int a = 1;
        int b = 1;
        int c;

        System.out.print(b + " " + a + " ");
        for (int count = 0; count < 18; count += 1) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }

}
