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

        System.out.println("Count Vowels \nThe Program counts the number of vowels in a sentence.");

        System.out.println("Enter a Sentence: ");

        Scanner inputString = new Scanner(System.in);

        String enteredWord = inputString.nextLine();

        enteredWord = enteredWord.toUpperCase();

        int totalLetters = enteredWord.length();

        for (int i = 0; i < totalLetters; i++) {
            
        }
    }

}
