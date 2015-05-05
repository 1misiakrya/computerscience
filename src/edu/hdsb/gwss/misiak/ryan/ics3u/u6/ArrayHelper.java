/*
 * Name: ArrayHelper
 * Date: May 4, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: 
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
    
    public static void swap(int[] data, int j, int k ) {
        int temp;
        temp = j;
        j = k;
        k = temp;
    }
    
    public static void displayArray( int[] data ) {
        for (int i = 0; i < data.length; i++) {
            System.out.print( data[i] + " " );
        }
        System.out.println();
    }

}
