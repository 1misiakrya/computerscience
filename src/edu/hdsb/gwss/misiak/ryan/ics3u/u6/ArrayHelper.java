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

    public static void swap(int[] data, int i, int j) {

        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void displayArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int[] data, int searchValue) {

        int valueOfArrayAtSearchValue = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchValue) {
                valueOfArrayAtSearchValue = data[i];
            }
            if (i == data.length && data[i] != searchValue) {
                System.out.println("Value not found in the array.");
            }
        }
        return valueOfArrayAtSearchValue;
    }

    public static int min(int[] data) {

        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (min > data[i]) {
                min = data[i];
            }
        }
        return min;
    }

    public static int sum(int[] data) {

        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public static int average(int[] data) {
        
        int sum = 0;
        int averageValue; 
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        averageValue = sum / data.length;
        return averageValue;
    }

}
