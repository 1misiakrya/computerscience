/*
 * Name: TravelTime
 * Date: May 20, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1misiakrya
 */
public class TravelTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("Data1.txt"));
        StringTokenizer cutColons, cutSpaces;
        String a;
        String b;

        String[] time = new String[10];
        int[] timeDifference = new int[10];
        int hours = 0;
        int changeInHours = 0;
        int minutes = 0;
        int seconds = 0;
        int[] timeTaken = new int[10];
        int i = 0;

        while (input.hasNext()) {
            a = input.nextLine();
            cutSpaces = new StringTokenizer(a, " ");
            time[i] = cutSpaces.nextToken();
            timeDifference[i] = Integer.parseInt(cutSpaces.nextToken());
            timeTaken[i] = Integer.parseInt(cutSpaces.nextToken());
            System.out.println(a);
            while (cutSpaces.hasMoreTokens()) {
                b = time[i];
                cutColons = new StringTokenizer(b, ":");
                hours = Integer.parseInt(cutColons.nextToken());
                minutes = Integer.parseInt(cutColons.nextToken());
                seconds = Integer.parseInt(cutColons.nextToken());
            }
            changeInHours = hours + timeDifference[i] + timeTaken[i];
            System.out.println(hours+ ":" + minutes + ":" + seconds);
            i++;
        }
    }
}
