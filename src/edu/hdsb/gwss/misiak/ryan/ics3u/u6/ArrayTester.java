/*
 * Name: ArrayTester
 * Date: May 4, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program tests the methods in ArrayHelper to see if they work
 correctly.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u6;

/**
 *
 * @author 1misiakrya
 */
public class ArrayTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Array Tester \n");

        testingMaxAndMinimum();
        testingAverage();
        testingSum();

    }

    public static void testingMaxAndMinimum() {

        // TESTING MAX & MIN
        System.out.println("TESTING MAXIMUM AND MINIMUM:");

        int[] randomNumberArray = new int[10];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (Math.random() * 100);
            System.out.print(randomNumberArray[i] + " ");
        }
        System.out.println("\n");

        // MAX
        System.out.println("Maximum: " + ArrayHelper.max(randomNumberArray));

        // MIN
        System.out.println("Minimum: " + ArrayHelper.min(randomNumberArray) + "\n");

    }

    public static void testingAverage() {
        // TESTING AVERAGE
        System.out.println("TESTING AVERAGE:");

        int[] randomNumberArray = new int[10];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (Math.random() * 100);
            System.out.print(randomNumberArray[i] + " ");
        }
        System.out.println("\n");
        // AVERAGE
        System.out.println("Average Value: " + ArrayHelper.average(randomNumberArray) + "\n");
    }

    public static void testingSum() {
        // TESTING SUM
        System.out.println("TESTING SUM:");

        int[] randomNumberArray = new int[10];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (Math.random() * 100);
            System.out.print(randomNumberArray[i] + " ");
        }
        System.out.println("\n");
        // SUM
        System.out.println("Sum: " + ArrayHelper.sum(randomNumberArray) + "\n");

    }
}
