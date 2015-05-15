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
        testingBubbleSort();
        testingSelectionSort();
        testingSearches();

    }

    public static void testingMaxAndMinimum() {

        // TESTING MAX & MIN
        System.out.println("TESTING MAXIMUM AND MINIMUM:");

        int[] randomNumberArray = new int[10];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (Math.random() * 100);
        }
        randomNumberArray[randomNumberArray.length / 2] = 101;
        randomNumberArray[randomNumberArray.length - 1] = -1;

        // DISPLAY ARRAY
        ArrayHelper.displayArray(randomNumberArray);

        // MAX
        int max = ArrayHelper.max(randomNumberArray);
        assert (max == 101);

        // MIN
        int min = ArrayHelper.min(randomNumberArray);
        assert (min == -1);

        System.out.println("\nTEST CASE #1A RESULTS - passed\n");
    }

    public static void testingAverage() {

        // TESTING AVERAGE
        System.out.println("TESTING AVERAGE:");

        int[] randomNumberArray = new int[10];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = i;
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(randomNumberArray);

        int average = ArrayHelper.average(randomNumberArray);
        assert (average == 4);

        System.out.println("\nTEST CASE #1A RESULTS - passed\n");
    }

    public static void testingSum() {

        // TESTING SUM
        System.out.println("TESTING SUM:");

        int[] randomNumberArray = new int[10];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = 1;
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(randomNumberArray);

        int sum = ArrayHelper.sum(randomNumberArray);
        assert (sum == 10);

        System.out.println("\nTEST CASE #1A RESULTS - passed\n");
    }

    public static void testingBubbleSort() {

        // TESTING BUBBLE SORT
        System.out.println("TESTING BUBBLE SORT \n");

        int[] randomNumberArray = new int[10];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (Math.random() * 100);
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(randomNumberArray);
        ArrayHelper.bubbleSort(randomNumberArray);

        for (int i = 0; i < randomNumberArray.length - 1; i++) {
            assert (randomNumberArray[i] <= randomNumberArray[i + 1]);
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(randomNumberArray);

        System.out.println("\nTEST CASE #1A RESULTS - passed\n");
    }

    public static void testingSelectionSort() {

        // TESTING BUBBLE SORT
        System.out.println("\nTESTING SELECTION SORT \n");

        int[] randomNumberArray = new int[10];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (Math.random() * 100);
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(randomNumberArray);
        ArrayHelper.selectionSort(randomNumberArray);

        for (int i = 0; i < randomNumberArray.length - 1; i++) {
            assert (randomNumberArray[i] <= randomNumberArray[i + 1]);
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(randomNumberArray);

        System.out.println("\nTEST CASE #1A RESULTS - passed\n");
    }

    public static void testingSearches() {

        // TESTING SEARCHES
        System.out.println("\nTESTING SEARCHES");
        int searchValue = 20;
        System.out.println("Value Being Searched For: " + searchValue);

        int[] randomNumberArray = new int[10];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = i;
        }
        randomNumberArray[7] = searchValue;
        ArrayHelper.bubbleSort(randomNumberArray);

        // TESTING LINEAR SEARCH
        int valueFoundLinear = ArrayHelper.linearSearch(randomNumberArray, searchValue);
        System.out.println("Value Found in Linear Search: " + valueFoundLinear);
        assert (valueFoundLinear == searchValue);

        System.out.println("\nTEST CASE #1A RESULTS - passed\n");

        // TESTING BINARY SEARCH
        System.out.println("\nTESTING BINARY SEARCH\n");

        int valueFoundBinary = ArrayHelper.binarySearch(randomNumberArray, searchValue);
        System.out.println("Value Found in Binary Search: " + valueFoundBinary);
        assert (valueFoundBinary == searchValue);

        System.out.println("\nTEST CASE #1A RESULTS - passed");
    }
    
    public static void testingLinearSearches(){
        
    }
    
    public static void testingBinarySearch(){
        
    }
}
