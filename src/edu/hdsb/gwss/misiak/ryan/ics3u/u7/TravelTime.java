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
        int hours[] = new int [10];
        int changeInHours = 0;
        int minutes[] = new int [4];
        int seconds[] = new int [4];
        int[] timeTaken = new int[4];
        int i = 0;
        int j = 0;

        while (input.hasNext()) {
            a = input.nextLine();
            cutSpaces = new StringTokenizer(a, " ");
            time[i] = cutSpaces.nextToken();
            timeDifference[i] = Integer.parseInt(cutSpaces.nextToken());
            timeTaken[i] = Integer.parseInt(cutSpaces.nextToken());
            System.out.println(a);
            while (cutSpaces.hasMoreTokens()) {
                b = time[j];
                cutColons = new StringTokenizer(b, ":");
                hours[j] = Integer.parseInt(cutColons.nextToken());
                minutes[j] = Integer.parseInt(cutColons.nextToken());
                seconds[j] = Integer.parseInt(cutColons.nextToken());
                changeInHours = hours[j] + timeDifference[i] + timeTaken[i];
                System.out.println(changeInHours + ":" + minutes[j] + ":" + seconds[j]);
                j++;
            }
            
            i++;
        }
    }
}
