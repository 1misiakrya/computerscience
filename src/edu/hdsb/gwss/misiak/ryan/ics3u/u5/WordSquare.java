/*
 * Name: WordSquare
 * Date: April 14, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program takes the user's input and converts it to a word square.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Word Square \nThis program prints a square out of the letters of a word entered by the user.");

        System.out.println("Enter Word: ");

        Scanner inputString = new Scanner(System.in);

        String enteredWord = inputString.nextLine();

        enteredWord = enteredWord.toUpperCase();
        
        for (int i = 1; i<enteredWord.length(); i++){
            int x = enteredWord.charAt(i);
            System.out.println(enteredWord);
            
        }

    }

}
