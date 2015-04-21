/*
 * Name: CountingVowels
 * Date: April 14, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program counts the vowels in the user's input.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Introduction to the program
        System.out.println("Count Vowels \nThe Program counts the number of vowels in a sentence.");

        System.out.println("Enter a Sentence: ");

        //Getting user's input
        Scanner inputString = new Scanner(System.in);

        String enteredWord = inputString.nextLine();

        enteredWord = enteredWord.toUpperCase();

        //Declaring variables
        int totalLetters = enteredWord.length();
        int totalVowels = 0;
        int unicodeValue;
        
        //OUTPUT
        for (int i = 0; i < totalLetters; i++) {
            unicodeValue = enteredWord.codePointAt(i);
            if ((unicodeValue == 65) || (unicodeValue == 69) || (unicodeValue == 73) || (unicodeValue == 79) || (unicodeValue == 85)) {
                totalVowels = totalVowels + 1;
            }
        }
        System.out.println("There are " + totalVowels + " vowels in the sentence.");
    }

}
