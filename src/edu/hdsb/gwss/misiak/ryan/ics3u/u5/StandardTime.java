/*
 * Name: StandardTime
 * Date: April 20, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program converts standard time to traditional time.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static void convertToTraditional() {

        System.out.println("Please enter a Standard Time (hh:mm) : ");

        Scanner inputStandardTime = new Scanner(System.in);

        String standardTime = inputStandardTime.nextLine();
        String hours = standardTime.substring(0, 2);
        String minutes = standardTime.substring(2, 2);

        System.out.println("Traditional Time: ");

    }

    public static void convertToStandard() {

        System.out.println("Please enter a traditional time (hh:mm xx) : ");

        Scanner inputTraditionalTime = new Scanner(System.in);

        String traditionalTime = inputTraditionalTime.nextLine();
        String hours = traditionalTime.substring(0, 2);
        String minutes = traditionalTime.substring(2, 2);

        System.out.println("StandardTime: ");

    }
}
