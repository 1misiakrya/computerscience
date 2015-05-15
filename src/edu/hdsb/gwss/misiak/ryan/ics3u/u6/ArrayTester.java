/*
 * Name: ArrayTester
 * Date: May 11, 2015
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

        // TITLE
        System.out.println("Array Tester \n");

        // CALLING EACH TEST METHOD
        testingMaxAndMinimum();
        testingAverage();
        testingSum();
        testingBubbleSort();
        testingSelectionSort();
        testingLinearSearch();
        testingBinarySearch();

    }

    public static void testingMaxAndMinimum() {

        // TESTING MAX & MIN
        System.out.println("TESTING MAXIMUM AND MINIMUM:");

        // DECLARING VARIABLES
        int[] randomNumberArray = new int[10];

        // CREATING VALUES FOR THE ARRAY
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

        System.out.println("\nTEST CASE MAX/MIN. RESULTS - passed\n");
    }

    public static void testingAverage() {

        // TESTING AVERAGE
        System.out.println("TESTING AVERAGE:");

        // DECLARING VARIABLES
        int[] randomNumberArray = new int[10];

        // CREATING VALUES FOR THE ARRAY
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = i;
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(randomNumberArray);

        int average = ArrayHelper.average(randomNumberArray);
        assert (average == 4);

        System.out.println("\nTEST CASE AVERAGE. RESULTS - passed\n");
    }

    public static void testingSum() {

        // TESTING SUM
        System.out.println("TESTING SUM:");

        // DECLARING VARIABLES
        int[] randomNumberArray = new int[10];

        // CREATING VALUES FOR THE ARRAY
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = 1;
        }

        // DISPLAY ARRAY
        ArrayHelper.displayArray(randomNumberArray);

        int sum = ArrayHelper.sum(randomNumberArray);
        assert (sum == 10);

        System.out.println("\nTEST CASE SUM. RESULTS - passed\n");
    }

    public static void testingBubbleSort() {

        // TESTING BUBBLE SORT
        System.out.println("TESTING BUBBLE SORT \n");

        // DECLARING VARIABLES
        int[] randomNumberArray = new int[10];

        // CREATING VALUES FOR THE ARRAY
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

        System.out.println("\nTEST CASE BUBBLE SORT. RESULTS - passed\n");
    }

    public static void testingSelectionSort() {

        // TESTING BUBBLE SORT
        System.out.println("\nTESTING SELECTION SORT \n");

        // DECLARING VARIABLES
        int[] randomNumberArray = new int[10];

        // CREATING VALUES FOR THE ARRAY
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

        System.out.println("\nTEST CASE SELECTION SORT. RESULTS - passed\n");
    }

    public static void testingLinearSearch() {

        System.out.println("\nTESTING LINEAR SEARCH\n");

        // DECLARING VARIABLES
        int searchValue = 20;
        int[] randomNumberArray = new int[10];

        // CREATING VALUES FOR THE ARRAY
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = i;
        }
        randomNumberArray[7] = searchValue;
        ArrayHelper.bubbleSort(randomNumberArray);

        System.out.println("Value Being Searched For Case A: " + searchValue);
        int valueFoundLinearCaseA = ArrayHelper.linearSearch(randomNumberArray, searchValue);
        assert (valueFoundLinearCaseA == searchValue);

        System.out.println("TEST CASE #1A (Variable is in array). RESULTS - passed");
        System.out.println("Value Found in Linear Search Case A: " + valueFoundLinearCaseA);

        // CASE B - Variable not found
        searchValue = -12;
        System.out.println("\nValue Being Searched For Case B: " + searchValue);
        int valueFoundLinearCaseB = ArrayHelper.binarySearch(randomNumberArray, searchValue);
        assert (valueFoundLinearCaseB == -1);

        System.out.println("TEST CASE #1B (Variable is not in array). RESULTS - passed");
        System.out.println("Value Found in Linear Search Case B: " + valueFoundLinearCaseB + "\n");
    }

    public static void testingBinarySearch() {

        System.out.println("\nTESTING BINARY SEARCH\n");

        // DECLARING VARIABLES
        int searchValue = 20;
        System.out.println("Value Being Searched For Case A: " + searchValue);
        int[] randomNumberArray = new int[10];

        // CREATING VALUES FOR THE ARRAY
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = i;
        }

        // CASE A - Variable found
        randomNumberArray[7] = searchValue;
        ArrayHelper.bubbleSort(randomNumberArray);

        System.out.println("TEST CASE #1A (Variable is in array). RESULTS - passed");
        int valueFoundBinaryCaseA = ArrayHelper.binarySearch(randomNumberArray, searchValue);
        System.out.println("Value Found in Binary Search Case A: " + valueFoundBinaryCaseA);
        assert (valueFoundBinaryCaseA == searchValue);

        // CASE B - Variable not found
        searchValue = -12;
        System.out.println("\nValue Being Searched For Case B: " + searchValue);
        int valueFoundBinaryCaseB = ArrayHelper.binarySearch(randomNumberArray, searchValue);

        assert (valueFoundBinaryCaseB == -1);

        System.out.println("TEST CASE #1B (Variable is not in array). RESULTS - passed");
        System.out.println("Value Found in Binary Search Case B: " + valueFoundBinaryCaseB);
    }
}
