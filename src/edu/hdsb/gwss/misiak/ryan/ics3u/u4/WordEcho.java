/*
 * Name: WordEcho
 * Date: March 31, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program asks the user for a word, and repeats that word as many times as there are letters in the word.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter A Word:   ");
        
        Scanner inputWord = new Scanner (System.in);
        String word = inputWord.nextLine();
        
        int wordLength = word.length();
        int wordRepeat = 0;
        
        if (wordLength<=0){
            System.out.println("Error. Please enter a word.");
        }else
            while(wordRepeat<wordLength){
                System.out.print(word + " ");
                wordRepeat = wordRepeat + 1;
            }
    }
    
}
