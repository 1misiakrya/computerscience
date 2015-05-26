/*
 * Name: TravelTime
 * Date: May 20, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program reads from a file and tells the user how long it
would take to take a trip from one spot to another.
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
        StringTokenizer st;
        String a;
        String b;

        String time;
        int timeDifference;
        int hours;
        int minutes;
        int seconds;
        int timeTaken;

        while (input.hasNext()) {
            a = input.nextLine();
            st = new StringTokenizer(a, " ");
            time = st.nextToken();
            timeTaken = Integer.parseInt(st.nextToken());
            timeDifference = Integer.parseInt(st.nextToken());

            // CUT THE TIME
            st = new StringTokenizer(time, ":");
            hours = Integer.parseInt(st.nextToken());
            minutes = Integer.parseInt(st.nextToken());
            seconds = Integer.parseInt(st.nextToken());

            System.out.println(a);
            if (hours >= 24) {
                hours = hours - 24;
            }
            if (timeDifference < 0) {
                hours = hours + timeTaken - timeDifference;
            } else{
                hours = hours + timeTaken + timeDifference;
            }

            System.out.println(hours + ":" + minutes + ":" + seconds);

        }
    }
}
