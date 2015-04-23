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

        System.out.println("Enter 1 to convert to Traditional time. Enter 2 to convert to Standard time: ");
        Scanner inputChoice = new Scanner(System.in);

        int choice = inputChoice.nextInt();
        if (choice > 2 || choice < 1) {
            System.out.println("Error - Invalid Entry");
        }else if (choice == 1){
            System.out.println("Please enter a Standard Time: ");
        }else{
            System.out.println("Please enter a Traditional Time: ");
        }
        

    }

    public static void convertToTraditional(String time) {

        System.out.println("Please enter a Standard Time (hh:mm) : ");

        Scanner inputStandardTime = new Scanner(System.in);

        String standardTime = inputStandardTime.nextLine();
        String hours = standardTime.substring(0, 2);

        System.out.println("Traditional Time: ");

    }

    public static void convertToStandard(String time) {

        System.out.println("Please enter a traditional time (hh:mm xx) : ");

        Scanner inputTraditionalTime = new Scanner(System.in);

        String traditionalTime = inputTraditionalTime.nextLine();
        String hours = traditionalTime.substring(0, 2);
        String minutes = traditionalTime.substring(2, 2);

        System.out.println("StandardTime: ");

    }
}
