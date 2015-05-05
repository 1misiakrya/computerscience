/*
 * Name: BubbleSort
 * Date: May 4, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program sorts the numbers in an array from least to greatest.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u6;

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
        int chosenIntegers[] = new int[10];

        // GENERATE RANDOM NUMBERS
        for (int i = 0; i < chosenIntegers.length; i++) {
            chosenIntegers[i] = (int) (Math.random() * 1000) + 1;
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(chosenIntegers);

        // BUBBLE SORT
        for (int pass = 0; pass < 10; pass++) {
            for (int i = 0; i < 10; i++) {
                if (chosenIntegers[i] > chosenIntegers[i + 1]) {
                    ArrayHelper.swap(chosenIntegers, i, i + 1);
                    chosenIntegers[i] = i;
                }

            }

        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(chosenIntegers);

    }

}
