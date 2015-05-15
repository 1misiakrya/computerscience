/*
 * Name: SelectionSort2
 * Date: May 6, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program sorts the numbers in an array from least to greatest
 using selection sorting.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u6;

/**
 *
 * @author 1misiakrya
 */
public class SelectionSort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Intro to program
        System.out.println("Selection Sort Two");
        int data[] = new int[10];
        int comparisons = 0;
        int swaps = 0;
        int dataWhenHighestValue;

        // GENERATE RANDOM NUMBERS
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000) + 1;
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(data);

        // SELECTION SORT
        for (int pass = 0; pass < data.length - 1; pass++) {
            dataWhenHighestValue = 0;
            for (int i = 0; i < data.length - pass; i++) {
                if (data[i] > data[dataWhenHighestValue]) {
                    dataWhenHighestValue = i;
                }
                comparisons++;
            }
            ArrayHelper.swap(data, data.length - pass - 1, dataWhenHighestValue);
            swaps++;

        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(data);

        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);


    }

}
