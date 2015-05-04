/*
 * Name: BubbleSort
 * Date: May 4, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program 
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Bubble Sort");
        int a;
        int chosenIntegers[] = new int[10];

        for (int i = 0; i < 10; i++) {
            a = (int) (Math.random() * 1000) + 1;
            chosenIntegers[i] = a;
            System.out.print(chosenIntegers[i]);
        }

        for (int pass = 0; pass < 10; pass++) {
            for (int i = 0; i < 10; i++) {

            }
        }

    }

}
