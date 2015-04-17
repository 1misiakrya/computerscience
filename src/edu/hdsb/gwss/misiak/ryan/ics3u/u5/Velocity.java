/*
 * Name: Velocity
 * Date: April 17, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program calculates velocity using more than one method.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class Velocity {

    public static double distance;

    public static double time;

    public static void main(String[] args) {

        gettingInput();

        calculatingVelocity();

    }

    public static void gettingInput() {
        
        System.out.println("Enter a distance: ");

        Scanner inputDistance = new Scanner(System.in);
        distance = inputDistance.nextDouble();
        
        System.out.println("Enter a time: ");
        
        Scanner inputTime = new Scanner(System.in);
        time = inputTime.nextDouble();

    }

    public static void calculatingVelocity() {

        double velocity = distance / time;

        System.out.println("Velocity: " + velocity + "m/s");
    }

}
