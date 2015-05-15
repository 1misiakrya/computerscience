/*
 * Name: ArrayHelper
 * Date: May 4, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program consists of methods used for other programs.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u6;

/**
 *
 * @author 1misiakrya
 */
public class ArrayHelper {

    public static int max(int[] data) {

        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }

    public static void bubbleSort(int[] data) {

        int comparisons = 0;
        int swaps = 0;

        // BUBBLE SORT
        for (int pass = 0; pass < data.length; pass++) {
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    ArrayHelper.swap(data, i, i + 1);
                    swaps++;
                }
                comparisons++;
            }

        }
    }

    public static void selectionSort(int[] data) {

        int comparisons = 0;
        int swaps = 0;
        int dataWhenHighestValue;

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
    }

    public static void swap(int[] data, int i, int j) {

        // SWAPPING ONE VARIABLE IN AN ARRAY FOR ANOTHER
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void displayArray(int[] data) {
        
        // PRINTING AN ARRAY
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int[] data, int searchValue) {

        // SEARCHING FOR A VALUE USING LINEAR SEARCH
        int valueOfArrayAtSearchValue = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchValue) {
                valueOfArrayAtSearchValue = data[i];
            }
            if ((i == data.length) && (data[i] != searchValue)) {
                System.out.println("Value not found in the array.");
            }
        }
        return valueOfArrayAtSearchValue;
    }

    public static int min(int[] data) {

        // FINDING THE SMALLEST VALUE IN AN ARRAY
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (min > data[i]) {
                min = data[i];
            }
        }
        return min;
    }

    public static int sum(int[] data) {

        // FINDING THE SUM OF ALL VALUES IN AN ARRAY
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public static int average(int[] data) {

        // FINDING THE AVERAGE OF THE VALUES IN THE ARRAY
        int sum = 0;
        int averageValue;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        averageValue = sum / data.length;
        return averageValue;
    }

    public static int binarySearch(int[] data, int searchValue) {

        // SEARCHING FOR A VALUE IN AN ARRAY USING BINARY SEARCH
        
        // DECLARING VARIABLES
        int rightSide = data.length;
        int leftSide = 0;
        int middle = data.length / 2;
        boolean valueFound = false;
        int passCount = 0;

        int valueOfArrayAtSearchValue = -1;

        // SHORTENING THE SEARCH AREA WITH EACH PASS UNTIL THE MIDDLE IS (OR ISN'T) THE SEARCH VALUE
        while (valueFound == false) {
            if (passCount == data.length) {
                valueFound = true;
            } else {
                if (data[middle] == searchValue) {
                    valueOfArrayAtSearchValue = data[middle];
                    valueFound = true;
                } else if (data[middle] < searchValue) {
                    leftSide = middle;
                    middle = data[data.length - (data.length - leftSide) / 2];
                } else if (data[middle] > searchValue) {
                    rightSide = middle;
                    middle = data[data.length - rightSide - (data.length - rightSide) / 2];
                }
                if (leftSide == rightSide) {
                    middle = leftSide;
                    if (data[middle] == searchValue) {
                        valueOfArrayAtSearchValue = data[middle];
                    } else {
                        valueOfArrayAtSearchValue = -1;
                    }
                    valueFound = true;
                }
            }
            passCount = passCount + 1;
        }
        return valueOfArrayAtSearchValue;
    }

}
