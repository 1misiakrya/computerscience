/*
 * Name: BubbleSort
 * Date: May 6, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program sorts the numbers in an array from least to greatest.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u6;

/**
 *
 * @author 1misiakrya
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Selection Sort");
        int data[] = new int[10];
        int temp = 0;
        int comparisons = 0;
        int swaps = 0;

        // GENERATE RANDOM NUMBERS
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000) + 1;
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(data);

        // SELECTION SORT
        for (int pass = 0; pass < data.length; pass++) {
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    temp = data[i];
                } else {
                    temp = data[i + 1];
                }
                comparisons++;
            }
            ArrayHelper.swap(data, data[data.length - pass], temp);
            swaps++;

        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(data);

        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);

    }

}