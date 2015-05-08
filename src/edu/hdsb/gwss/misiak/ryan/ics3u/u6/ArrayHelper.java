/*
 * Name: ArrayHelper
 * Date: May 4, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program consists of methods used in other programs.
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

    public static void selectionSwap(int[] data, int i, int j, int k) {
        int temp = i;
        data[k] = data[j];
        data[j] = temp;
    }

    public static void displayArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void search() {

    }

}
