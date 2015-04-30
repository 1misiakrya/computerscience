/*
 * Name: Golf
 * Date: April 27, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program records the score for 18 holes of golf.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("This program records the score for 18 holes of golf.");

        Scanner inputScore = new Scanner(System.in);
        int[] userScore = new int[18];

        for (int hole = 0; hole < 18; hole++) {
            System.out.print("Please enter your score in hole " + (hole + 1) + ": ");
            userScore[hole] = inputScore.nextInt();
        }
        for (int hole = 0; hole < 18; hole++) {
            System.out.println("Golf hole " + (hole + 1) + ";" + userScore[hole]);
        }

    }

}
