/*
 * Name: BodyMassIndex
 * Date: March 25, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program calculates the user's body mass index in metric and imperial systems after the user gives it their height & weight.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // User inputs their weight.
        System.out.println("Body Mass Index Calculator. Enter 1 for Metric, and 2 for Imperial.");
        
        Scanner inputChoice = new Scanner (System.in);
        int Choice = inputChoice.nextInt();
        double bmi = 0;
        
        System.out.println("Please enter your weight");

        Scanner inputWeight = new Scanner(System.in);
        double Weight = inputWeight.nextDouble();

        // User inputs their height.
        System.out.println("Please enter your height");

        Scanner inputHeightMetres = new Scanner(System.in);
        double Height = inputHeightMetres.nextDouble();

        // Calculations for body mass index.
        double bmiMetric = (Weight / (Height * Height));
        double bmiImperial = (Weight * 703 / (Height * Height));
        
        if (Choice == 1){
            bmi = bmiMetric;
        }
        else{
            bmi = bmiImperial;
        }
        
        // Telling the user what their metric body mass index means.
        System.out.println("Your body mass index shows you are:");
        
        if (bmiMetric < 0) {
            System.out.println("Sorry. Invalid number. Please try again.\n");
        } else if (bmiMetric < 16) {
            System.out.println("Starvation");
        } else if (bmiMetric < 19.5) {
            System.out.println("Underweight\n");
        } else if (bmiMetric <= 25) {
            System.out.println("Ideal\n");
        } else if (bmiMetric < 30) {
            System.out.println("Overweight\n");
        } else if (bmiMetric < 40) {
            System.out.println("Obese\n");
        } else {
            System.out.println("Morbidly Obese\n");
        }

       
    }

}
